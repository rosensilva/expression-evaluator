package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;

public class VariableReferenceNode implements ExpressionNode {
    private final String variableName;

    public VariableReferenceNode(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        return context.getVariable(variableName);
    }
}
