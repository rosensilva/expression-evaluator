package com.example.expression.evaluator;

import com.example.expression.ast.*;
import com.example.expression.exception.EvaluationException;
import com.example.expression.parser.ExpressionBaseVisitor;
import com.example.expression.parser.ExpressionParser;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ExpressionVisitor extends ExpressionBaseVisitor<ExpressionNode> {

    private static final Logger logger = Logger.getLogger(ExpressionVisitor.class.getName());

    @Override
    public ExpressionNode visitExpression(ExpressionParser.ExpressionContext ctx) {
        logger.fine("Visiting Expression: " + ctx.getText());
        return visit(ctx.logicalExpression());
    }

    @Override
    public ExpressionNode visitLiteral(ExpressionParser.LiteralContext ctx) {
        logger.fine("Visiting Literal: " + ctx.getText());
        if (ctx.NUMBER() != null) {
            double value = Double.parseDouble(ctx.NUMBER().getText());
            logger.fine("Parsed number literal: " + value);
            return new LiteralNode(value);
        } else if (ctx.STRING_LITERAL() != null) {
            String text = ctx.STRING_LITERAL().getText();
            String value = text.substring(1, text.length() - 1); // Remove quotes
            logger.fine("Parsed string literal: " + value);
            return new LiteralNode(value);
        } else if (ctx.BOOLEAN_LITERAL() != null) {
            boolean value = Boolean.parseBoolean(ctx.BOOLEAN_LITERAL().getText());
            logger.fine("Parsed boolean literal: " + value);
            return new LiteralNode(value);
        } else if (ctx.NULL_LITERAL() != null) {
            logger.fine("Parsed null literal");
            return new LiteralNode(null);
        }
        return null;
    }

    @Override
    public ExpressionNode visitVariableReference(ExpressionParser.VariableReferenceContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        logger.fine("Visiting VariableReference: " + variableName);
        return new VariableReferenceNode(variableName);
    }

    @Override
    public ExpressionNode visitAttributeReference(ExpressionParser.AttributeReferenceContext ctx) {
        String namespace = ctx.IDENTIFIER(0).getText();
        String attributeName = ctx.IDENTIFIER(1).getText();
        logger.fine("Visiting AttributeReference: " + namespace + "." + attributeName);
        return new AttributeReferenceNode(namespace, attributeName);
    }

    @Override
    public ExpressionNode visitFunctionCall(ExpressionParser.FunctionCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        logger.fine("Visiting FunctionCall: " + functionName);
        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (ExpressionParser.LogicalExpressionContext argCtx : ctx.argumentList().logicalExpression()) {
                arguments.add(visit(argCtx));
            }
            logger.fine("Function arguments parsed: " + arguments.size());
        }
        return new FunctionCallNode(functionName, arguments);
    }

    @Override
    public ExpressionNode visitLogicalExpression(ExpressionParser.LogicalExpressionContext ctx) {
        logger.fine("Visiting LogicalExpression: " + ctx.getText());
        if (ctx.comparisonExpression().size() == 1) {
            return visit(ctx.comparisonExpression(0));
        } else {
            ExpressionNode left = visit(ctx.comparisonExpression(0));
            for (int i = 1; i < ctx.comparisonExpression().size(); i++) {
                String operator = ctx.getChild(2 * i - 1).getText();
                ExpressionNode right = visit(ctx.comparisonExpression(i));
                logger.fine("Creating BinaryOperationNode with operator: " + operator);
                left = new BinaryOperationNode(left, operator, right);
            }
            return left;
        }
    }

    @Override
    public ExpressionNode visitComparisonExpression(ExpressionParser.ComparisonExpressionContext ctx) {
        logger.fine("Visiting ComparisonExpression: " + ctx.getText());
        if (ctx.arithmeticExpression().size() == 1) {
            return visit(ctx.arithmeticExpression(0));
        } else {
            ExpressionNode left = visit(ctx.arithmeticExpression(0));
            String operator = ctx.getChild(1).getText();
            ExpressionNode right = visit(ctx.arithmeticExpression(1));
            logger.fine("Creating BinaryOperationNode with operator: " + operator);
            return new BinaryOperationNode(left, operator, right);
        }
    }

    @Override
    public ExpressionNode visitArithmeticExpression(ExpressionParser.ArithmeticExpressionContext ctx) {
        logger.fine("Visiting ArithmeticExpression: " + ctx.getText());
        if (ctx.term().size() == 1) {
            return visit(ctx.term(0));
        } else {
            ExpressionNode left = visit(ctx.term(0));
            for (int i = 1; i < ctx.term().size(); i++) {
                String operator = ctx.getChild(2 * i - 1).getText();
                ExpressionNode right = visit(ctx.term(i));
                logger.fine("Creating BinaryOperationNode with operator: " + operator);
                left = new BinaryOperationNode(left, operator, right);
            }
            return left;
        }
    }

    @Override
    public ExpressionNode visitTerm(ExpressionParser.TermContext ctx) {
        logger.fine("Visiting Term: " + ctx.getText());
        if (ctx.factor().size() == 1) {
            return visit(ctx.factor(0));
        } else {
            ExpressionNode left = visit(ctx.factor(0));
            for (int i = 1; i < ctx.factor().size(); i++) {
                String operator = ctx.getChild(2 * i - 1).getText();
                ExpressionNode right = visit(ctx.factor(i));
                logger.fine("Creating BinaryOperationNode with operator: " + operator);
                left = new BinaryOperationNode(left, operator, right);
            }
            return left;
        }
    }

    @Override
    public ExpressionNode visitFactor(ExpressionParser.FactorContext ctx) {
        logger.fine("Visiting Factor: " + ctx.getText());
        if (ctx.functionCall() != null) {
            return visit(ctx.functionCall());
        } else if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.variableReference() != null) {
            return visit(ctx.variableReference());
        } else if (ctx.attributeReference() != null) {
            return visit(ctx.attributeReference());
        } else if (ctx.payloadReference() != null) {
            return visit(ctx.payloadReference());
        } else if (ctx.logicalExpression() != null) {
            return visit(ctx.logicalExpression());
        } else if (ctx.operator != null && ctx.factor() != null) {
            String operator = ctx.operator.getText();
            logger.fine("Creating UnaryOperationNode with operator: " + operator);
            ExpressionNode operand = visit(ctx.factor());
            return new UnaryOperationNode(operator, operand);
        } else {
            throw new EvaluationException("Unsupported factor");
        }
    }

    @Override
    public ExpressionNode visitPayloadReference(ExpressionParser.PayloadReferenceContext ctx) {
        logger.fine("Visiting PayloadReference: " + ctx.getText());
        List<String> propertyPath = new ArrayList<>();
        for (int i = 0; i < ctx.propertyPath().getChildCount(); i++) {
            String text = ctx.propertyPath().getChild(i).getText();
            if (text.startsWith(".")) {
                propertyPath.add(text.substring(1));
            } else if (text.startsWith("[")) {
                propertyPath.add(text.substring(1, text.length() - 1).replaceAll("'", "").replaceAll("\"", ""));
            }
        }
        logger.fine("Parsed property path: " + propertyPath);
        return new PayloadReferenceNode(propertyPath);
    }
}
