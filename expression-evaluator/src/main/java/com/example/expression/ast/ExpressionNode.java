package com.example.expression.ast;

import com.example.expression.context.EvaluationContext;

public interface ExpressionNode {
    Object evaluate(EvaluationContext context);
}
