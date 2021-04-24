import gen.Cpp_Grammar;
import gen.Cpp_Lexer;
import model.Output;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.ClassVisitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    private static BufferedWriter prepareOutput(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        return new BufferedWriter(writer);
    }

    private static String readFromFile(String fileName) {
        final StringBuilder builder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
            stream.forEach(s -> builder.append(s).append("\n"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }
    public static void main(String [] args) throws Exception {

        String test =  "int speed=0;";
       // String testCodeFromFile = readFromFile(test);
        BufferedWriter bufferedWriter;

        //InputStream in = Main.class.getResourceAsStream("./example1.txt");
        ANTLRInputStream input = new ANTLRInputStream(test);

        Cpp_Lexer lexer = new Cpp_Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Cpp_Grammar parser = new Cpp_Grammar(tokens);

        ClassVisitor classVisitor = new ClassVisitor();

        model.Class traverseResult = classVisitor.getReturnClass();
        Output output = new Output(traverseResult);
        output.print();
    }
}
