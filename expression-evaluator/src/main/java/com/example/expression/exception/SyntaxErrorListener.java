package com.example.expression.exception;

import org.antlr.v4.runtime.*;

public class SyntaxErrorListener extends BaseErrorListener {
    private boolean hasErrors = false;

    public boolean hasErrors() {
        return hasErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        hasErrors = true;
        System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
    }
}
