package com.example;

import com.example.expression.ast.ExpressionNode;
import com.example.expression.context.EvaluationContext;
import com.example.expression.evaluator.ExpressionVisitor;
import com.example.expression.parser.ExpressionLexer;
import com.example.expression.parser.ExpressionParser;
import com.example.expression.exception.SyntaxErrorListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {
        logger.info("Starting expression evaluation program.");

        String expressionText = "vars.age >= 28 and attributes.transport.ContentType == 'application/json'";
        logger.info("Expression to evaluate: " + expressionText);

        // Create an input stream from the expression
        CharStream input = CharStreams.fromString(expressionText);
        logger.fine("Created CharStream from expression text.");

        // Create a lexer that feeds off of input CharStream
        ExpressionLexer lexer = new ExpressionLexer(input);
        logger.fine("Lexer created.");

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        logger.fine("Token stream created.");

        // Create a parser that feeds off the tokens buffer
        ExpressionParser parser = new ExpressionParser(tokens);
        logger.fine("Parser created.");

        // Add custom error listener
        SyntaxErrorListener errorListener = new SyntaxErrorListener();
        parser.removeErrorListeners();  // Remove default console error listener
        parser.addErrorListener(errorListener);
        logger.fine("Custom error listener added to parser.");

        // Begin parsing at expression rule
        ParseTree tree = parser.expression();
        logger.fine("Parse tree generated.");

        // Check for syntax errors
        if (errorListener.hasErrors()) {
            logger.severe("Parsing failed due to syntax errors.");
            return;
        }

        // Create a visitor to build the AST
        ExpressionVisitor visitor = new ExpressionVisitor();
        ExpressionNode expression = visitor.visit(tree);
        logger.fine("AST built from parse tree.");

        // Check if the expression is null
        if (expression == null) {
            logger.severe("Expression is null after visiting the parse tree.");
            return;
        }

        // Create an evaluation context with variables, attributes, and payload
        EvaluationContext context = new EvaluationContext();
        context.setVariable("age", 20);
        context.setAttribute("transport", "ContentType", "application/json");
        logger.fine("Evaluation context created and initialized.");

        // Evaluate the expression
        Object result = expression.evaluate(context);
        logger.info("Expression evaluated. Result: " + result);
        System.out.println("Result: " + result);
    }
}
