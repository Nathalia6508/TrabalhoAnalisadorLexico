package ManipuladorArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LexicalAnalyzer {

    private HashMap<String, TokenType> keywords;
    private HashMap<String, TokenType> symbols;

    public LexicalAnalyzer() {
        keywords = new HashMap<>();
        symbols = new HashMap<>();
        // Adicione palavras-chave da linguagem Pascal
        keywords.put("and", TokenType.AND);
        keywords.put("array", TokenType.ARRAY);
        keywords.put("begin", TokenType.BEGIN);
        keywords.put("case", TokenType.CASE);
        keywords.put("const", TokenType.CONST);
        keywords.put("div", TokenType.DIV);
        keywords.put("do", TokenType.DO);
        keywords.put("repeat", TokenType.REPEAT);
        keywords.put("downto", TokenType.DOWNTO);
        keywords.put("else", TokenType.ELSE);
        keywords.put("end", TokenType.END);
        keywords.put("file", TokenType.FILE);
        keywords.put("for", TokenType.FOR);
        keywords.put("function", TokenType.FUNCTION);
        keywords.put("goto", TokenType.GOTO);
        keywords.put("if", TokenType.IF);
        keywords.put("in", TokenType.IN);
        keywords.put("label", TokenType.LABEL);
        keywords.put("mod", TokenType.MOD);
        keywords.put("nil", TokenType.NIL);
        keywords.put("not", TokenType.NOT);
        keywords.put("of", TokenType.OF);
        keywords.put("or", TokenType.OR);
		keywords.put("packet", TokenType.PACKET);
		keywords.put("procedure", TokenType.PROCEDURE);
		keywords.put("program", TokenType.PROGRAM);
		keywords.put("record", TokenType.RECORD);
		keywords.put("end", TokenType.END);
		keywords.put("repeat", TokenType.REPEAT);
		keywords.put("set", TokenType.SET);
		keywords.put("then", TokenType.THEN);
		keywords.put("to", TokenType.TO);
		keywords.put("type", TokenType.TYPE);
        keywords.put("until", TokenType.UNTIL);
		keywords.put("var", TokenType.VAR);
        keywords.put("virtual", TokenType.VIRTUAL);
        keywords.put("with", TokenType.WITH);
		keywords.put("constructor", TokenType.CONSTRUCTOR);
		keywords.put("absolute", TokenType.ABSOLUTE);
		keywords.put("asm", TokenType.ASM);
		keywords.put("destructor", TokenType.DESTRUCTOR);
		keywords.put("export", TokenType.EXPORT);
		keywords.put("external", TokenType.EXTERNAL);
		keywords.put("forward", TokenType.FORWARD);
		keywords.put("implementation", TokenType.IMPLEMENTATION);
		keywords.put("inhireted", TokenType.INHIRETED);
		keywords.put("inline", TokenType.INLINE);
		keywords.put("interface", TokenType.INTERFACE);
		keywords.put("interrupt", TokenType.INTERRUPT);
		keywords.put("library", TokenType.LIBRARY);
		keywords.put("shl", TokenType.SHL);
		keywords.put("string", TokenType.STRING);
		keywords.put("uses", TokenType.USES);
		keywords.put("xor", TokenType.XOR);
		
        //SÍMBOLOS
        symbols.put("+", TokenType.PLUS);
        symbols.put("-", TokenType.LESS);
        symbols.put("*", TokenType.MULT);
        symbols.put("/", TokenType.DIVIDE);
        symbols.put("=", TokenType.EQUAL);
        symbols.put("<", TokenType.LESSTHAN);
        symbols.put(">", TokenType.MORETHAN);
        symbols.put("<=", TokenType.LESSEQUAL);
        symbols.put(">=", TokenType.MOREEQUAL);
        symbols.put("<>", TokenType.DIFFERENT);
        symbols.put("(", TokenType.OPPAR);
        symbols.put(")", TokenType.CLPAR);
        symbols.put("[", TokenType.OPCOL);
        symbols.put("]", TokenType.CLCOL);
        symbols.put(",", TokenType.COMMA);
        symbols.put(";", TokenType.DOTCOMMA);
        symbols.put(":", TokenType.RECIEVE);
        symbols.put(".", TokenType.DOT);
        symbols.put("..", TokenType.INTERVAL);
        symbols.put(":=", TokenType.RECIEVETO);
        symbols.put("..=", TokenType.CLINTERVAL);
        symbols.put("//", TokenType.COMMENT);
        symbols.put("{", TokenType.OPCHA);
        symbols.put("}", TokenType.CLCHA);
        symbols.put("^", TokenType.POINT);
        symbols.put("|", TokenType.ORS);
        symbols.put("@", TokenType.ARROBA);
        symbols.put("$", TokenType.DOLLAR);
        symbols.put("#", TokenType.SHARP);
        symbols.put("&", TokenType.ANDS);
        symbols.put("%", TokenType.PERCENT);

        // Adicione outras palavras-chave conforme necessário
    }

    public void analyze(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\s+"); // Divida a linha em tokens usando espaços em branco
                for (String token : tokens) {
                    if (keywords.containsKey(token)) {
                        System.out.println(token + ": " + keywords.get(token) + "KEYWORD");
                    }
                    else if (symbols.containsKey(token)) {
                        System.out.println(token + ": " + symbols.get(token) + "SYMBOL");
                    }
                    else {
                        // Se não for uma palavra-chave, pode ser um identificador, número, etc.
                        // Implemente lógica para identificar outros tipos de tokens conforme necessário
                        System.out.println(token + ": IDENTIFIER"); // Por enquanto, consideramos todos os não-palavras-chave como identificadores
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


