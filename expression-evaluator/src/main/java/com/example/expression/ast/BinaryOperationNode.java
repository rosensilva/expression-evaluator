package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;
import com.example.expression.exception.EvaluationException;

import java.util.logging.Logger;
import java.util.logging.Level;

public class BinaryOperationNode implements ExpressionNode {
    private static final Logger logger = Logger.getLogger(BinaryOperationNode.class.getName());

    private final ExpressionNode left;
    private final ExpressionNode right;
    private final String operator;

    public BinaryOperationNode(ExpressionNode left, String operator, ExpressionNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
        logger.fine("Created BinaryOperationNode with operator: " + operator);
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        Object leftValue = left.evaluate(context);
        Object rightValue = right.evaluate(context);
        logger.fine("Evaluating Binary Operation: " + leftValue + " " + operator + " " + rightValue);

        try {
            switch (operator) {
                case "+":
                    double resultAdd = ((Number) leftValue).doubleValue() + ((Number) rightValue).doubleValue();
                    logger.fine("Result of addition: " + resultAdd);
                    return resultAdd;
                case "-":
                    double resultSub = ((Number) leftValue).doubleValue() - ((Number) rightValue).doubleValue();
                    logger.fine("Result of subtraction: " + resultSub);
                    return resultSub;
                case "*":
                    double resultMul = ((Number) leftValue).doubleValue() * ((Number) rightValue).doubleValue();
                    logger.fine("Result of multiplication: " + resultMul);
                    return resultMul;
                case "/":
                    double resultDiv = ((Number) leftValue).doubleValue() / ((Number) rightValue).doubleValue();
                    logger.fine("Result of division: " + resultDiv);
                    return resultDiv;
                case "%":
                    double resultMod = ((Number) leftValue).doubleValue() % ((Number) rightValue).doubleValue();
                    logger.fine("Result of modulus: " + resultMod);
                    return resultMod;
                case "==":
                    boolean resultEq = leftValue.equals(rightValue);
                    logger.fine("Result of equality: " + resultEq);
                    return resultEq;
                case "!=":
                    boolean resultNeq = !leftValue.equals(rightValue);
                    logger.fine("Result of inequality: " + resultNeq);
                    return resultNeq;
                case "<":
                    boolean resultLt = compareValues(leftValue, rightValue) < 0;
                    logger.fine("Result of less than: " + resultLt);
                    return resultLt;
                case "<=":
                    boolean resultLe = compareValues(leftValue, rightValue) <= 0;
                    logger.fine("Result of less than or equal: " + resultLe);
                    return resultLe;
                case ">":
                    boolean resultGt = compareValues(leftValue, rightValue) > 0;
                    logger.fine("Result of greater than: " + resultGt);
                    return resultGt;
                case ">=":
                    boolean resultGe = compareValues(leftValue, rightValue) >= 0;
                    logger.fine("Result of greater than or equal: " + resultGe);
                    return resultGe;
                case "and":
                    boolean resultAnd = (Boolean) leftValue && (Boolean) rightValue;
                    logger.fine("Result of logical AND: " + resultAnd);
                    return resultAnd;
                case "or":
                    boolean resultOr = (Boolean) leftValue || (Boolean) rightValue;
                    logger.fine("Result of logical OR: " + resultOr);
                    return resultOr;
                default:
                    logger.severe("Unsupported operator: " + operator);
                    throw new EvaluationException("Unsupported operator: " + operator);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error evaluating binary operation", e);
            throw new EvaluationException("Error evaluating binary operation", e);
        }
    }

    @SuppressWarnings("unchecked")
    private int compareValues(Object leftValue, Object rightValue) {
        if (leftValue == null || rightValue == null) {
            logger.severe("Cannot compare null values");
            throw new EvaluationException("Cannot compare null values");
        }

        if (leftValue instanceof Number && rightValue instanceof Number) {
            double leftNumber = ((Number) leftValue).doubleValue();
            double rightNumber = ((Number) rightValue).doubleValue();
            logger.fine("Comparing numbers: " + leftNumber + " and " + rightNumber);
            return Double.compare(leftNumber, rightNumber);
        } else if (leftValue instanceof String && rightValue instanceof String) {
            logger.fine("Comparing strings: '" + leftValue + "' and '" + rightValue + "'");
            return ((String) leftValue).compareTo((String) rightValue);
        } else if (leftValue instanceof Comparable && leftValue.getClass().isInstance(rightValue)) {
            logger.fine("Comparing comparable objects: " + leftValue + " and " + rightValue);
            return ((Comparable<Object>) leftValue).compareTo(rightValue);
        } else {
            logger.severe("Cannot compare values of different types or non-comparable types");
            throw new EvaluationException("Cannot compare values of different types or non-comparable types");
        }
    }
}
