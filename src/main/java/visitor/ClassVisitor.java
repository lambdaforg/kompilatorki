package visitor;

import gen.Cpp_GrammarBaseVisitor;
import model.Class;

/**
 * Translate Java class to C file.
 */

public class ClassVisitor extends Cpp_GrammarBaseVisitor<Class> {

    private Class returnClass = null;


    public Class getReturnClass() {
        return returnClass;
    }
}



