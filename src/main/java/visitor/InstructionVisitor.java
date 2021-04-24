package visitor;

import gen.Cpp_GrammarBaseVisitor;
import model.Instruction;

/**
 * Created by psk on 23.05.17.
 */
public class InstructionVisitor extends Cpp_GrammarBaseVisitor<Instruction> {

   /* @Override
    public Instruction visitInstruction(@NotNull JavaParser.InstructionContext ctx) {
        Instruction instruction = new Instruction();

        JavaParser.VariableDeclaratorContext variableContext = ctx.variableDeclarator();
        JavaParser.StatementContext statementContext = ctx.statement();

        List<Variable> variables = new ArrayList<>();
        if (variableContext != null) {
            variables.add(variableContext.accept(new VariableVisitor()));
        }

        List<Statement> statements = new ArrayList<>();
        if (statementContext != null) {
            statements.add(statementContext.accept(new StatementVisitor()));
        }

        instruction.setVariables(variables);
        instruction.setStatements(statements);
        return instruction;
    }*/
}
