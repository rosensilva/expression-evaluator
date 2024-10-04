package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;

import java.util.List;

public class FunctionCallNode implements ExpressionNode {
    private final String functionName;
    private final List<ExpressionNode> arguments;

    public FunctionCallNode(String functionName, List<ExpressionNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public Object evaluate(EvaluationContext context) {
        return context.callFunction(functionName, arguments);
    }
}
