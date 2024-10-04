package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;

import java.util.List;

public class PayloadReferenceNode implements ExpressionNode {
    private final List<String> propertyPath;

    public PayloadReferenceNode(List<String> propertyPath) {
        this.propertyPath = propertyPath;
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        return context.getPayloadValue(propertyPath);
    }
}
