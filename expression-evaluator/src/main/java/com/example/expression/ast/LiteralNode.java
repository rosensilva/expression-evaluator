package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;

public class LiteralNode implements ExpressionNode {
    private final Object value;

    public LiteralNode(Object value) {
        this.value = value;
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        return value;
    }
}
