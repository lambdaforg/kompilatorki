package gen;// Generated from D:/JAVA-KOMPILATORY/Kompl3/src/main/java\Cpp_Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cpp_Grammar}.
 */
public interface Cpp_GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(Cpp_Grammar.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(Cpp_Grammar.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(Cpp_Grammar.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(Cpp_Grammar.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(Cpp_Grammar.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(Cpp_Grammar.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedId(Cpp_Grammar.UnqualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedId(Cpp_Grammar.UnqualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedId(Cpp_Grammar.QualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedId(Cpp_Grammar.QualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(Cpp_Grammar.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(Cpp_Grammar.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Cpp_Grammar.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Cpp_Grammar.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIntroducer(Cpp_Grammar.LambdaIntroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIntroducer(Cpp_Grammar.LambdaIntroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCapture(Cpp_Grammar.LambdaCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCapture(Cpp_Grammar.LambdaCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#captureDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaptureDefault(Cpp_Grammar.CaptureDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#captureDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaptureDefault(Cpp_Grammar.CaptureDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(Cpp_Grammar.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(Cpp_Grammar.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(Cpp_Grammar.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(Cpp_Grammar.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(Cpp_Grammar.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(Cpp_Grammar.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(Cpp_Grammar.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(Cpp_Grammar.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDeclarator(Cpp_Grammar.LambdaDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDeclarator(Cpp_Grammar.LambdaDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Cpp_Grammar.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Cpp_Grammar.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdOfTheTypeId(Cpp_Grammar.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdOfTheTypeId(Cpp_Grammar.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Cpp_Grammar.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Cpp_Grammar.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(Cpp_Grammar.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(Cpp_Grammar.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Cpp_Grammar.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Cpp_Grammar.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(Cpp_Grammar.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(Cpp_Grammar.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(Cpp_Grammar.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(Cpp_Grammar.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(Cpp_Grammar.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(Cpp_Grammar.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#newTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeId(Cpp_Grammar.NewTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#newTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeId(Cpp_Grammar.NewTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(Cpp_Grammar.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(Cpp_Grammar.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerNewDeclarator(Cpp_Grammar.NoPointerNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerNewDeclarator(Cpp_Grammar.NoPointerNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(Cpp_Grammar.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(Cpp_Grammar.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(Cpp_Grammar.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(Cpp_Grammar.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(Cpp_Grammar.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(Cpp_Grammar.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(Cpp_Grammar.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(Cpp_Grammar.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointerMemberExpression(Cpp_Grammar.PointerMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointerMemberExpression(Cpp_Grammar.PointerMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Cpp_Grammar.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Cpp_Grammar.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Cpp_Grammar.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Cpp_Grammar.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(Cpp_Grammar.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(Cpp_Grammar.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(Cpp_Grammar.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(Cpp_Grammar.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Cpp_Grammar.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Cpp_Grammar.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Cpp_Grammar.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Cpp_Grammar.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Cpp_Grammar.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Cpp_Grammar.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(Cpp_Grammar.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(Cpp_Grammar.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(Cpp_Grammar.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(Cpp_Grammar.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(Cpp_Grammar.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(Cpp_Grammar.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(Cpp_Grammar.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(Cpp_Grammar.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Cpp_Grammar.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Cpp_Grammar.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Cpp_Grammar.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Cpp_Grammar.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Cpp_Grammar.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Cpp_Grammar.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Cpp_Grammar.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Cpp_Grammar.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(Cpp_Grammar.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(Cpp_Grammar.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Cpp_Grammar.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Cpp_Grammar.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Cpp_Grammar.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Cpp_Grammar.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Cpp_Grammar.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Cpp_Grammar.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(Cpp_Grammar.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(Cpp_Grammar.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(Cpp_Grammar.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(Cpp_Grammar.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(Cpp_Grammar.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(Cpp_Grammar.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Cpp_Grammar.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Cpp_Grammar.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(Cpp_Grammar.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(Cpp_Grammar.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(Cpp_Grammar.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(Cpp_Grammar.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(Cpp_Grammar.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(Cpp_Grammar.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(Cpp_Grammar.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(Cpp_Grammar.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(Cpp_Grammar.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(Cpp_Grammar.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(Cpp_Grammar.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(Cpp_Grammar.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(Cpp_Grammar.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(Cpp_Grammar.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Cpp_Grammar.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Cpp_Grammar.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(Cpp_Grammar.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(Cpp_Grammar.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(Cpp_Grammar.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(Cpp_Grammar.AliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(Cpp_Grammar.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(Cpp_Grammar.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(Cpp_Grammar.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(Cpp_Grammar.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(Cpp_Grammar.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(Cpp_Grammar.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(Cpp_Grammar.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(Cpp_Grammar.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(Cpp_Grammar.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(Cpp_Grammar.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(Cpp_Grammar.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(Cpp_Grammar.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(Cpp_Grammar.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(Cpp_Grammar.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(Cpp_Grammar.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(Cpp_Grammar.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(Cpp_Grammar.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(Cpp_Grammar.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(Cpp_Grammar.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(Cpp_Grammar.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(Cpp_Grammar.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(Cpp_Grammar.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSeq(Cpp_Grammar.TypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSeq(Cpp_Grammar.TypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSeq(Cpp_Grammar.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSeq(Cpp_Grammar.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeLengthModifier(Cpp_Grammar.SimpleTypeLengthModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeLengthModifier(Cpp_Grammar.SimpleTypeLengthModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSignednessModifier(Cpp_Grammar.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSignednessModifier(Cpp_Grammar.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(Cpp_Grammar.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(Cpp_Grammar.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(Cpp_Grammar.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(Cpp_Grammar.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypeSpecifier(Cpp_Grammar.DecltypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypeSpecifier(Cpp_Grammar.DecltypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(Cpp_Grammar.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(Cpp_Grammar.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(Cpp_Grammar.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(Cpp_Grammar.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(Cpp_Grammar.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(Cpp_Grammar.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(Cpp_Grammar.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(Cpp_Grammar.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(Cpp_Grammar.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(Cpp_Grammar.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(Cpp_Grammar.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(Cpp_Grammar.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(Cpp_Grammar.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(Cpp_Grammar.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(Cpp_Grammar.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(Cpp_Grammar.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(Cpp_Grammar.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(Cpp_Grammar.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(Cpp_Grammar.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(Cpp_Grammar.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(Cpp_Grammar.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(Cpp_Grammar.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceName(Cpp_Grammar.OriginalNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceName(Cpp_Grammar.OriginalNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(Cpp_Grammar.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(Cpp_Grammar.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAlias(Cpp_Grammar.NamespaceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAlias(Cpp_Grammar.NamespaceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAliasDefinition(Cpp_Grammar.NamespaceAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAliasDefinition(Cpp_Grammar.NamespaceAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(Cpp_Grammar.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(Cpp_Grammar.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(Cpp_Grammar.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(Cpp_Grammar.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#usingDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(Cpp_Grammar.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#usingDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(Cpp_Grammar.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmDefinition(Cpp_Grammar.AsmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmDefinition(Cpp_Grammar.AsmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSpecification(Cpp_Grammar.LinkageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSpecification(Cpp_Grammar.LinkageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSeq(Cpp_Grammar.AttributeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSeq(Cpp_Grammar.AttributeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(Cpp_Grammar.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(Cpp_Grammar.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(Cpp_Grammar.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(Cpp_Grammar.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(Cpp_Grammar.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(Cpp_Grammar.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Cpp_Grammar.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Cpp_Grammar.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNamespace(Cpp_Grammar.AttributeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNamespace(Cpp_Grammar.AttributeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(Cpp_Grammar.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(Cpp_Grammar.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokenSeq(Cpp_Grammar.BalancedTokenSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokenSeq(Cpp_Grammar.BalancedTokenSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(Cpp_Grammar.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(Cpp_Grammar.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(Cpp_Grammar.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(Cpp_Grammar.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(Cpp_Grammar.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(Cpp_Grammar.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(Cpp_Grammar.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(Cpp_Grammar.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclarator(Cpp_Grammar.PointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclarator(Cpp_Grammar.PointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerDeclarator(Cpp_Grammar.NoPointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerDeclarator(Cpp_Grammar.NoPointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(Cpp_Grammar.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(Cpp_Grammar.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void enterTrailingReturnType(Cpp_Grammar.TrailingReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void exitTrailingReturnType(Cpp_Grammar.TrailingReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPointerOperator(Cpp_Grammar.PointerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPointerOperator(Cpp_Grammar.PointerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(Cpp_Grammar.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(Cpp_Grammar.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvQualifier(Cpp_Grammar.CvQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvQualifier(Cpp_Grammar.CvQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(Cpp_Grammar.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(Cpp_Grammar.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(Cpp_Grammar.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(Cpp_Grammar.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#theTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeId(Cpp_Grammar.TheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#theTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeId(Cpp_Grammar.TheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(Cpp_Grammar.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(Cpp_Grammar.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerAbstractDeclarator(Cpp_Grammar.PointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerAbstractDeclarator(Cpp_Grammar.PointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractDeclarator(Cpp_Grammar.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractDeclarator(Cpp_Grammar.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPackDeclarator(Cpp_Grammar.AbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPackDeclarator(Cpp_Grammar.AbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractPackDeclarator(Cpp_Grammar.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractPackDeclarator(Cpp_Grammar.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(Cpp_Grammar.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(Cpp_Grammar.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(Cpp_Grammar.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(Cpp_Grammar.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(Cpp_Grammar.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(Cpp_Grammar.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(Cpp_Grammar.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(Cpp_Grammar.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(Cpp_Grammar.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(Cpp_Grammar.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(Cpp_Grammar.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(Cpp_Grammar.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(Cpp_Grammar.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(Cpp_Grammar.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(Cpp_Grammar.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(Cpp_Grammar.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(Cpp_Grammar.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(Cpp_Grammar.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(Cpp_Grammar.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(Cpp_Grammar.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(Cpp_Grammar.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(Cpp_Grammar.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(Cpp_Grammar.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(Cpp_Grammar.ClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(Cpp_Grammar.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(Cpp_Grammar.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#classHeadName}.
	 * @param ctx the parse tree
	 */
	void enterClassHeadName(Cpp_Grammar.ClassHeadNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#classHeadName}.
	 * @param ctx the parse tree
	 */
	void exitClassHeadName(Cpp_Grammar.ClassHeadNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassVirtSpecifier(Cpp_Grammar.ClassVirtSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassVirtSpecifier(Cpp_Grammar.ClassVirtSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#classKey}.
	 * @param ctx the parse tree
	 */
	void enterClassKey(Cpp_Grammar.ClassKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#classKey}.
	 * @param ctx the parse tree
	 */
	void exitClassKey(Cpp_Grammar.ClassKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberSpecification(Cpp_Grammar.MemberSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberSpecification(Cpp_Grammar.MemberSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(Cpp_Grammar.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(Cpp_Grammar.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaratorList(Cpp_Grammar.MemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaratorList(Cpp_Grammar.MemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarator(Cpp_Grammar.MemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarator(Cpp_Grammar.MemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifierSeq(Cpp_Grammar.VirtualSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifierSeq(Cpp_Grammar.VirtualSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifier(Cpp_Grammar.VirtualSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifier(Cpp_Grammar.VirtualSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPureSpecifier(Cpp_Grammar.PureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPureSpecifier(Cpp_Grammar.PureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#baseClause}.
	 * @param ctx the parse tree
	 */
	void enterBaseClause(Cpp_Grammar.BaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#baseClause}.
	 * @param ctx the parse tree
	 */
	void exitBaseClause(Cpp_Grammar.BaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifierList(Cpp_Grammar.BaseSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifierList(Cpp_Grammar.BaseSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifier(Cpp_Grammar.BaseSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifier(Cpp_Grammar.BaseSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrDeclType(Cpp_Grammar.ClassOrDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrDeclType(Cpp_Grammar.ClassOrDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(Cpp_Grammar.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(Cpp_Grammar.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(Cpp_Grammar.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(Cpp_Grammar.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterConversionFunctionId(Cpp_Grammar.ConversionFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitConversionFunctionId(Cpp_Grammar.ConversionFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void enterConversionTypeId(Cpp_Grammar.ConversionTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void exitConversionTypeId(Cpp_Grammar.ConversionTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversionDeclarator(Cpp_Grammar.ConversionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversionDeclarator(Cpp_Grammar.ConversionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializer(Cpp_Grammar.ConstructorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializer(Cpp_Grammar.ConstructorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializerList(Cpp_Grammar.MemInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializerList(Cpp_Grammar.MemInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#memInitializer}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializer(Cpp_Grammar.MemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#memInitializer}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializer(Cpp_Grammar.MemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(Cpp_Grammar.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(Cpp_Grammar.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFunctionId(Cpp_Grammar.OperatorFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFunctionId(Cpp_Grammar.OperatorFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorId(Cpp_Grammar.LiteralOperatorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorId(Cpp_Grammar.LiteralOperatorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(Cpp_Grammar.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(Cpp_Grammar.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterList(Cpp_Grammar.TemplateparameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterList(Cpp_Grammar.TemplateparameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateParameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateParameter(Cpp_Grammar.TemplateParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateParameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateParameter(Cpp_Grammar.TemplateParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Cpp_Grammar.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Cpp_Grammar.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTemplateId(Cpp_Grammar.SimpleTemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTemplateId(Cpp_Grammar.SimpleTemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateId}.
	 * @param ctx the parse tree
	 */
	void enterTemplateId(Cpp_Grammar.TemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateId}.
	 * @param ctx the parse tree
	 */
	void exitTemplateId(Cpp_Grammar.TemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateName}.
	 * @param ctx the parse tree
	 */
	void enterTemplateName(Cpp_Grammar.TemplateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateName}.
	 * @param ctx the parse tree
	 */
	void exitTemplateName(Cpp_Grammar.TemplateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgumentList(Cpp_Grammar.TemplateArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgumentList(Cpp_Grammar.TemplateArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#templateArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgument(Cpp_Grammar.TemplateArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#templateArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgument(Cpp_Grammar.TemplateArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameSpecifier(Cpp_Grammar.TypeNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameSpecifier(Cpp_Grammar.TypeNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitInstantiation(Cpp_Grammar.ExplicitInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitInstantiation(Cpp_Grammar.ExplicitInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitSpecialization(Cpp_Grammar.ExplicitSpecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitSpecialization(Cpp_Grammar.ExplicitSpecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(Cpp_Grammar.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(Cpp_Grammar.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTryBlock(Cpp_Grammar.FunctionTryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTryBlock(Cpp_Grammar.FunctionTryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerSeq(Cpp_Grammar.HandlerSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerSeq(Cpp_Grammar.HandlerSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(Cpp_Grammar.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(Cpp_Grammar.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(Cpp_Grammar.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(Cpp_Grammar.ExceptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(Cpp_Grammar.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(Cpp_Grammar.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSpecification(Cpp_Grammar.ExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSpecification(Cpp_Grammar.ExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicExceptionSpecification(Cpp_Grammar.DynamicExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicExceptionSpecification(Cpp_Grammar.DynamicExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#typeIdList}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdList(Cpp_Grammar.TypeIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#typeIdList}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdList(Cpp_Grammar.TypeIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNoeExceptSpecification(Cpp_Grammar.NoeExceptSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNoeExceptSpecification(Cpp_Grammar.NoeExceptSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#theOperator}.
	 * @param ctx the parse tree
	 */
	void enterTheOperator(Cpp_Grammar.TheOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#theOperator}.
	 * @param ctx the parse tree
	 */
	void exitTheOperator(Cpp_Grammar.TheOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cpp_Grammar#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Cpp_Grammar.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cpp_Grammar#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Cpp_Grammar.LiteralContext ctx);
}
