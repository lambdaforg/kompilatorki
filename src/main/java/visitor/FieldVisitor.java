package visitor;


import gen.Cpp_GrammarBaseVisitor;
import model.Field;

/**
 * Created by psk on 25.05.17.
 */
public class FieldVisitor extends Cpp_GrammarBaseVisitor<Field> {

   /* @Override
    public Field visitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) {
        Field field = new Field();
        field.setModifier(ctx.modifier().getText());
        field.setConstant(ctx.constant() != null ? true : false);
        field.setReturnType(ctx.variableDeclarator().type().getText());
        field.setName(ctx.variableDeclarator().variableName().getText());
        field.setValue(ctx.variableDeclarator().variableInitializer().expression().getText());
        field.setConstant(ctx.constant() != null);
        return field;
    }*/

}
