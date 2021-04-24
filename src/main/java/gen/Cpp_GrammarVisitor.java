package gen;// Generated from D:/JAVA-KOMPILATORY/Kompl3/src/main/java\Cpp_Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Cpp_Grammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Cpp_GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(Cpp_Grammar.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(Cpp_Grammar.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(Cpp_Grammar.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(Cpp_Grammar.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(Cpp_Grammar.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(Cpp_Grammar.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Cpp_Grammar.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#lambdaIntroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIntroducer(Cpp_Grammar.LambdaIntroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#lambdaCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCapture(Cpp_Grammar.LambdaCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#captureDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureDefault(Cpp_Grammar.CaptureDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(Cpp_Grammar.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(Cpp_Grammar.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(Cpp_Grammar.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(Cpp_Grammar.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#lambdaDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDeclarator(Cpp_Grammar.LambdaDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Cpp_Grammar.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdOfTheTypeId(Cpp_Grammar.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(Cpp_Grammar.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(Cpp_Grammar.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Cpp_Grammar.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(Cpp_Grammar.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(Cpp_Grammar.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(Cpp_Grammar.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(Cpp_Grammar.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(Cpp_Grammar.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerNewDeclarator(Cpp_Grammar.NoPointerNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(Cpp_Grammar.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(Cpp_Grammar.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(Cpp_Grammar.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Cpp_Grammar.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#pointerMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerMemberExpression(Cpp_Grammar.PointerMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Cpp_Grammar.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Cpp_Grammar.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Cpp_Grammar.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(Cpp_Grammar.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Cpp_Grammar.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Cpp_Grammar.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Cpp_Grammar.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Cpp_Grammar.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Cpp_Grammar.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(Cpp_Grammar.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(Cpp_Grammar.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Cpp_Grammar.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Cpp_Grammar.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Cpp_Grammar.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Cpp_Grammar.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Cpp_Grammar.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Cpp_Grammar.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Cpp_Grammar.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Cpp_Grammar.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Cpp_Grammar.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(Cpp_Grammar.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(Cpp_Grammar.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Cpp_Grammar.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(Cpp_Grammar.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(Cpp_Grammar.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(Cpp_Grammar.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(Cpp_Grammar.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(Cpp_Grammar.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(Cpp_Grammar.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(Cpp_Grammar.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Cpp_Grammar.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(Cpp_Grammar.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(Cpp_Grammar.AliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(Cpp_Grammar.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(Cpp_Grammar.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(Cpp_Grammar.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(Cpp_Grammar.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(Cpp_Grammar.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(Cpp_Grammar.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(Cpp_Grammar.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(Cpp_Grammar.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(Cpp_Grammar.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(Cpp_Grammar.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(Cpp_Grammar.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSeq(Cpp_Grammar.TypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSeq(Cpp_Grammar.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#simpleTypeLengthModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeLengthModifier(Cpp_Grammar.SimpleTypeLengthModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#simpleTypeSignednessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSignednessModifier(Cpp_Grammar.SimpleTypeSignednessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(Cpp_Grammar.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(Cpp_Grammar.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#decltypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypeSpecifier(Cpp_Grammar.DecltypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(Cpp_Grammar.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(Cpp_Grammar.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(Cpp_Grammar.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(Cpp_Grammar.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(Cpp_Grammar.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(Cpp_Grammar.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(Cpp_Grammar.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(Cpp_Grammar.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(Cpp_Grammar.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(Cpp_Grammar.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(Cpp_Grammar.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(Cpp_Grammar.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(Cpp_Grammar.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(Cpp_Grammar.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(Cpp_Grammar.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(Cpp_Grammar.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(Cpp_Grammar.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(Cpp_Grammar.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(Cpp_Grammar.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(Cpp_Grammar.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSeq(Cpp_Grammar.AttributeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(Cpp_Grammar.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(Cpp_Grammar.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(Cpp_Grammar.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Cpp_Grammar.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attributeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNamespace(Cpp_Grammar.AttributeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#attributeArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeArgumentClause(Cpp_Grammar.AttributeArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#balancedTokenSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedTokenSeq(Cpp_Grammar.BalancedTokenSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(Cpp_Grammar.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(Cpp_Grammar.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(Cpp_Grammar.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(Cpp_Grammar.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#pointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclarator(Cpp_Grammar.PointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#noPointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerDeclarator(Cpp_Grammar.NoPointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(Cpp_Grammar.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#trailingReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingReturnType(Cpp_Grammar.TrailingReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#pointerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerOperator(Cpp_Grammar.PointerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(Cpp_Grammar.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(Cpp_Grammar.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(Cpp_Grammar.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(Cpp_Grammar.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#theTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeId(Cpp_Grammar.TheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(Cpp_Grammar.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAbstractDeclarator(Cpp_Grammar.PointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractDeclarator(Cpp_Grammar.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPackDeclarator(Cpp_Grammar.AbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractPackDeclarator(Cpp_Grammar.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(Cpp_Grammar.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(Cpp_Grammar.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(Cpp_Grammar.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(Cpp_Grammar.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(Cpp_Grammar.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(Cpp_Grammar.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(Cpp_Grammar.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(Cpp_Grammar.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(Cpp_Grammar.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(Cpp_Grammar.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(Cpp_Grammar.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(Cpp_Grammar.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(Cpp_Grammar.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#classHeadName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeadName(Cpp_Grammar.ClassHeadNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#classVirtSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVirtSpecifier(Cpp_Grammar.ClassVirtSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#classKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKey(Cpp_Grammar.ClassKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(Cpp_Grammar.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(Cpp_Grammar.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(Cpp_Grammar.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarator(Cpp_Grammar.MemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifierSeq(Cpp_Grammar.VirtualSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#virtualSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifier(Cpp_Grammar.VirtualSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#pureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureSpecifier(Cpp_Grammar.PureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(Cpp_Grammar.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(Cpp_Grammar.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#baseSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifier(Cpp_Grammar.BaseSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#classOrDeclType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrDeclType(Cpp_Grammar.ClassOrDeclTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(Cpp_Grammar.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(Cpp_Grammar.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#conversionFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunctionId(Cpp_Grammar.ConversionFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#conversionTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionTypeId(Cpp_Grammar.ConversionTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#conversionDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionDeclarator(Cpp_Grammar.ConversionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#constructorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializer(Cpp_Grammar.ConstructorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#memInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerList(Cpp_Grammar.MemInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(Cpp_Grammar.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(Cpp_Grammar.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(Cpp_Grammar.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#literalOperatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorId(Cpp_Grammar.LiteralOperatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(Cpp_Grammar.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateparameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterList(Cpp_Grammar.TemplateparameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameter(Cpp_Grammar.TemplateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Cpp_Grammar.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#simpleTemplateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTemplateId(Cpp_Grammar.SimpleTemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateId(Cpp_Grammar.TemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateName(Cpp_Grammar.TemplateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgumentList(Cpp_Grammar.TemplateArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#templateArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(Cpp_Grammar.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typeNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameSpecifier(Cpp_Grammar.TypeNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#explicitInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitInstantiation(Cpp_Grammar.ExplicitInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#explicitSpecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitSpecialization(Cpp_Grammar.ExplicitSpecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(Cpp_Grammar.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#functionTryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTryBlock(Cpp_Grammar.FunctionTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#handlerSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSeq(Cpp_Grammar.HandlerSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(Cpp_Grammar.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(Cpp_Grammar.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(Cpp_Grammar.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#exceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSpecification(Cpp_Grammar.ExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicExceptionSpecification(Cpp_Grammar.DynamicExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#typeIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdList(Cpp_Grammar.TypeIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#noeExceptSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoeExceptSpecification(Cpp_Grammar.NoeExceptSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#theOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheOperator(Cpp_Grammar.TheOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Cpp_Grammar#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Cpp_Grammar.LiteralContext ctx);
}
