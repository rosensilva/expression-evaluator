package com.example.expression.exception;

public class EvaluationException extends RuntimeException {
    public EvaluationException(String message, Throwable cause) {
        super(message, cause);
    }

    public EvaluationException(String message) {
        super(message);
    }
}
