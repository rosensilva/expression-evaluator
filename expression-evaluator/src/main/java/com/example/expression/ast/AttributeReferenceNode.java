package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;

public class AttributeReferenceNode implements ExpressionNode {
    private final String namespace;
    private final String attributeName;

    public AttributeReferenceNode(String namespace, String attributeName) {
        this.namespace = namespace;
        this.attributeName = attributeName;
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        return context.getAttribute(namespace, attributeName);
    }
}
