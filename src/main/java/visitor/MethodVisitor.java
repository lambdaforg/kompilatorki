package visitor;


import gen.Cpp_GrammarBaseVisitor;
import model.Method;

/**
 * Created by psk on 23.05.17.
 */
public class MethodVisitor extends Cpp_GrammarBaseVisitor<Method> {


 /*   @Override
    public Method visitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {
        Method method = new Method(ctx.methodName().getText());
        if (ctx.modifier() != null ) {
            method.setModifier(ctx.modifier().getText());
        }
        method.setReturnType(ctx.type().getText());

        List<Parameter> arguments = new ArrayList<>();
        JavaParser.MethodParametersDeclarationContext paramContext = ctx.methodParameters().methodParametersDeclaration();
        while (paramContext != null) {
            arguments.add(new Parameter(
                    paramContext.type().getText(), paramContext.variableName().getText()
            ));
            paramContext = paramContext.methodParametersDeclaration();
        }
        method.setArguments(arguments);

        InstructionVisitor instructionVisitor = new InstructionVisitor();
        List<Instruction> instructions = ctx.methodBody().instruction()
                .stream()
                .map(instruction -> instruction.accept(instructionVisitor))
                .collect(Collectors.toList());

        method.setInstructions(instructions);
        return method;
    }*/
}
