package visitor;


import gen.Cpp_GrammarBaseVisitor;
import model.Statement;

/**
 * Created by psk on 25.05.17.
 */
public class StatementVisitor extends Cpp_GrammarBaseVisitor<Statement> {

    private ExpressionVisitor expressionVisitor = new ExpressionVisitor();
/*
    @Override
    public Statement visitReturnStatement(@NotNull JavaParser.ReturnStatementContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new Statement("return", expression);
    }

    @Override
    public Statement visitCondStatement(@NotNull JavaParser.CondStatementContext ctx) {
        Expression parExpression = ctx.parExpression().expression().accept(expressionVisitor);

        List<Statement> statements = ctx.statement()
                .stream()
                .map(instruction -> instruction.accept(this))
                .collect(Collectors.toList());

        return new Statement("if", parExpression, statements);
    }

    @Override
    public Statement visitWhileStatement(@NotNull JavaParser.WhileStatementContext ctx) {
        Expression parExpression = ctx.parExpression().expression().accept(expressionVisitor);

        Statement statement = ctx.statement().accept(this);
        List<Statement> statements = new ArrayList<>();
        statements.add(statement);

        return new Statement("while", parExpression, statements);
    }

    @Override
    public Statement visitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new Statement("assign", expression);
    }*/
}
