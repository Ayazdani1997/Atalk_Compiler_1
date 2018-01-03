import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

// Visit https://stackoverflow.com/questions/26451636/how-do-i-use-antlr-generated-parser-and-lexer
public class Atalk {
	public static boolean pass1Passed = true;
	public static void main(String[] args) throws IOException {
		ANTLRInputStream reader = new ANTLRFileStream(args[0]);
		// Pass #1
		AtalkLexer pass1Lexer = new AtalkLexer(reader);
		CommonTokenStream pass1Tokens = new CommonTokenStream(pass1Lexer);
		AtalkParser pass1Parser = new AtalkParser(pass1Tokens);
		ParseTree pass1Tree = pass1Parser.program(); // Program is starting production rule
		System.out.println( "pass1 finished");
		if( Atalk.pass1Passed == false )
			return;
		// System.out.println(pass1Tree.toStringTree());
		
		// Pass #2
		reader.reset();
		Atalk_p2Lexer pass2Lexer = new Atalk_p2Lexer(reader);
		CommonTokenStream pass2Tokens = new CommonTokenStream(pass2Lexer);
		Atalk_p2Parser pass2Parser = new Atalk_p2Parser(pass2Tokens);
		ParseTree pass2Tree = pass2Parser.program();
		System.out.println( "pass2 finished" );
	}
}
