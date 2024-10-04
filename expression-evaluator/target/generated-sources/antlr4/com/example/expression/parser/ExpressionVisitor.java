// Generated from com/example/expression/parser/Expression.g4 by ANTLR 4.9.2
package com.example.expression.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(ExpressionParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(ExpressionParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(ExpressionParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExpressionParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ExpressionParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ExpressionParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ExpressionParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(ExpressionParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#attributeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeReference(ExpressionParser.AttributeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#payloadReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayloadReference(ExpressionParser.PayloadReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#propertyPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyPath(ExpressionParser.PropertyPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ExpressionParser.LiteralContext ctx);
}