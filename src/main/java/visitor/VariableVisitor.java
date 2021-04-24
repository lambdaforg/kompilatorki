package visitor;

import gen.Cpp_Grammar;
import gen.Cpp_GrammarBaseVisitor;
import model.Variable;

/**
 * Created by psk on 25.05.17.
 */
public class VariableVisitor extends Cpp_GrammarBaseVisitor<Variable> {


    @Override
    public Variable visitBaseTypeSpecifier(Cpp_Grammar.BaseTypeSpecifierContext ctx) {
        System.out.println("test");
        return super.visitBaseTypeSpecifier(ctx);
    }

/*
    @Override
    public Variable visitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx) {
        Variable variable = new Variable();
        variable.setType(ctx.type().getText());
        variable.setName(ctx.variableName().getText());
        variable.setValue(ctx.variableInitializer().expression().getText());
        return variable;
    }
*/

}
