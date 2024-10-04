package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;
import com.example.expression.exception.EvaluationException;

import java.util.logging.Logger;
import java.util.logging.Level;

public class UnaryOperationNode implements ExpressionNode {
    private static final Logger logger = Logger.getLogger(UnaryOperationNode.class.getName());

    private final ExpressionNode operand;
    private final String operator;

    public UnaryOperationNode(String operator, ExpressionNode operand) {
        this.operator = operator;
        this.operand = operand;
        logger.fine("Created UnaryOperationNode with operator: " + operator);
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        Object value = operand.evaluate(context);
        logger.fine("Evaluating Unary Operation: " + operator + " " + value);
        try {
            switch (operator) {
                case "+":
                    double resultPlus = ((Number) value).doubleValue();
                    logger.fine("Result of unary plus: " + resultPlus);
                    return resultPlus;
                case "-":
                    double resultMinus = -((Number) value).doubleValue();
                    logger.fine("Result of unary minus: " + resultMinus);
                    return resultMinus;
                case "not":
                    boolean resultNot = !((Boolean) value);
                    logger.fine("Result of logical NOT: " + resultNot);
                    return resultNot;
                default:
                    logger.severe("Unsupported operator: " + operator);
                    throw new EvaluationException("Unsupported operator: " + operator);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error evaluating unary operation", e);
            throw new EvaluationException("Error evaluating unary operation", e);
        }
    }
}
