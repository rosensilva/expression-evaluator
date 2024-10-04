// Generated from com/example/expression/parser/Expression.g4 by ANTLR 4.9.2
package com.example.expression.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(ExpressionParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(ExpressionParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(ExpressionParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(ExpressionParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(ExpressionParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(ExpressionParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ExpressionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ExpressionParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ExpressionParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ExpressionParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ExpressionParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ExpressionParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ExpressionParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(ExpressionParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(ExpressionParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#attributeReference}.
	 * @param ctx the parse tree
	 */
	void enterAttributeReference(ExpressionParser.AttributeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#attributeReference}.
	 * @param ctx the parse tree
	 */
	void exitAttributeReference(ExpressionParser.AttributeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#payloadReference}.
	 * @param ctx the parse tree
	 */
	void enterPayloadReference(ExpressionParser.PayloadReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#payloadReference}.
	 * @param ctx the parse tree
	 */
	void exitPayloadReference(ExpressionParser.PayloadReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#propertyPath}.
	 * @param ctx the parse tree
	 */
	void enterPropertyPath(ExpressionParser.PropertyPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#propertyPath}.
	 * @param ctx the parse tree
	 */
	void exitPropertyPath(ExpressionParser.PropertyPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExpressionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExpressionParser.LiteralContext ctx);
}