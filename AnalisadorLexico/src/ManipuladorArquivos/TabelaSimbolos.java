package ManipuladorArquivos;

import java.util.HashMap;

public class TabelaSimbolos {
	public HashMap<String, Simbolo> tabela = new HashMap<>();
	public static int end = -1;
	
	public final byte AND = 0;
	public final byte ARRAY = 1;
	public final byte BEGIN = 2;
	public final byte CASE = 3;
	public final byte CONST = 4;
	public final byte DIV = 5;
	public final byte DO = 6;
	public final byte REPEAT = 7;
	public final byte DOWNTO = 8;
	public final byte ELSE = 9;
	public final byte END = 10;
	public final byte FILE = 11;
	public final byte FOR = 12;
	public final byte FUNCTION = 13;
	public final byte GOTO = 14;
	public final byte IF = 15;
	public final byte IN = 16;
	public final byte LABEL = 17;
	public final byte MOD = 18;
	public final byte NIL = 19;
	public final byte NOT = 20;
	public final byte OF = 21;
	public final byte OR = 22;
	public final byte PACKET = 23;
	public final byte PROCEDURE = 24;
	public final byte SET = 25;
	public final byte THEN = 26;
	public final byte TO = 27;    
	public final byte TYPE = 28;
	public final byte UNTIL = 29;
	public final byte VAR = 30;
	public final byte CONSTRUCTOR = 31;
	public final byte WITH = 32;
	public final byte PLUS = 33; //+
	public final byte LESS = 34; //-
	public final byte MULT = 35; //* 
    public final byte DIVIDE = 36; // /
    public final byte EQUAL = 37; //=
    public final byte LESSTHAN = 38; //<
    public final byte MORETHAN = 39; //>
    public final byte LESSEQUAL = 40; //<=
    public final byte MOREEQUAL = 41; //>=
    public final byte DIFFERENT = 42; //<>
    public final byte OPPAR = 43; //)
    public final byte CLPAR = 44; //(
    public final byte OPCOL = 45; //[
    public final byte CLCOL = 46; //]
    public final byte COMMA = 47; //,
    public final byte DOTCOMMA = 48; //;
    public final byte RECIEVE = 49; //:
    public final byte DOT = 50; //.
    public final byte INTERVAL = 51; //..
    public final byte RECIEVETO = 52; //:=
    public final byte CLINTERVAL = 53; //..=
    public final byte COMMENT = 54; // //
    public final byte OPCHA = 55; //{
    public final byte CLCHA = 56; //}
    public final byte POINT = 57; //^
    public final byte ORS = 58; //|
    public final byte ARROBA = 59; //@
    public final byte DOLLAR = 60; //$
    public final byte SHARP = 61; //#
    public final byte ANDS = 62; //&
    public final byte PERCENT = 63; //%
    public final byte PROGRAM = 64;
    public final byte RECORD = 65;
    public final byte VIRTUAL = 66; 
	public final byte ABSOLUTE = 67; 
	public final byte ASM = 68;
	public final byte DESTRUCTOR = 69;
	public final byte EXPORT = 70;
	public final byte EXTERNAL = 71;
	public final byte FORWARD = 72; 
	public final byte IMPLEMENTATION = 73;
	public final byte INHIRETED = 74;
	public final byte INLINE = 75;
	public final byte INTERFACE = 76;
	public final byte INTERRUPT = 77;
	public final byte LIBRARY = 78;
	public final byte SHL = 79;
	public final byte STRING = 80;
	public final byte USES = 81;
	public final byte XOR = 82;

	public TabelaSimbolos() {
        //PALAVRAS RESERVADAS
		tabela.put("and", new Simbolo(AND,"and", ++end));
		tabela.put("array", new Simbolo(ARRAY,"array", ++end));
		tabela.put("begin", new Simbolo(BEGIN,"begin", ++end));
		tabela.put("case", new Simbolo(CASE,"case", ++end));
		tabela.put("const", new Simbolo(CONST,"const", ++end));
		tabela.put("div", new Simbolo(DIV,"div", ++end));
		tabela.put("do", new Simbolo(DO,"do", ++end));
		tabela.put("downto", new Simbolo(DOWNTO,"downto", ++end));
		tabela.put("else", new Simbolo(ELSE,"else", ++end));
		tabela.put("end", new Simbolo(END,"end", ++end));
		tabela.put("file", new Simbolo(FILE,"file", ++end));
		tabela.put("for", new Simbolo(FOR,"for", ++end));
		tabela.put("function", new Simbolo(FUNCTION,"function", ++end));
		tabela.put("goto", new Simbolo(GOTO,"goto", ++end));
		tabela.put("if", new Simbolo(IF,"if", ++end));
		tabela.put("in", new Simbolo(IN,"in", ++end));
		tabela.put("label", new Simbolo(LABEL,"label", ++end));
		tabela.put("mod", new Simbolo(MOD,"mod", ++end));
		tabela.put("nil", new Simbolo(NIL,"nil", ++end));
		tabela.put("not", new Simbolo(NOT,"not", ++end));
		tabela.put("of", new Simbolo(OF,"of", ++end));
		tabela.put("or", new Simbolo(OR,"or", ++end));
		tabela.put("packet", new Simbolo(PACKET,"packet", ++end));
		tabela.put("procedure", new Simbolo(PROCEDURE,"procedure", ++end));
		tabela.put("program", new Simbolo(PROGRAM,"program", ++end));
		tabela.put("record", new Simbolo(RECORD,"record", ++end));
		tabela.put("end", new Simbolo(END,"end", ++end));
		tabela.put("repeat", new Simbolo(REPEAT,"repeat", ++end));
		tabela.put("set", new Simbolo(SET,"set", ++end));
		tabela.put("then", new Simbolo(THEN,"then", ++end));
		tabela.put("to", new Simbolo(TO,"to", ++end));
		tabela.put("type", new Simbolo(TYPE,"type", ++end));
        tabela.put("until", new Simbolo(UNTIL,"until", ++end));
		tabela.put("var", new Simbolo(VAR,"var", ++end));
        tabela.put("virtual", new Simbolo(VIRTUAL,"virtual", ++end));
        tabela.put("with", new Simbolo(WITH,"with", ++end));
		tabela.put("constructor", new Simbolo(CONSTRUCTOR,"constructor", ++end));
		tabela.put("absolute", new Simbolo(ABSOLUTE,"absolute", ++end));
		tabela.put("asm", new Simbolo(ASM,"asm", ++end));
		tabela.put("destructor", new Simbolo(DESTRUCTOR,"destructor", ++end));
		tabela.put("export", new Simbolo(EXPORT,"export", ++end));
		tabela.put("external", new Simbolo(EXTERNAL,"external", ++end));
		tabela.put("forward", new Simbolo(FORWARD,"forward", ++end));
		tabela.put("implementation", new Simbolo(IMPLEMENTATION,"implementation", ++end));
		tabela.put("inhireted", new Simbolo(INHIRETED,"inhireted", ++end));
		tabela.put("inline", new Simbolo(INLINE,"inline", ++end));
		tabela.put("interface", new Simbolo(INTERFACE,"interface", ++end));
		tabela.put("interrupt", new Simbolo(INTERRUPT,"interrupt", ++end));
		tabela.put("library", new Simbolo(LIBRARY,"library", ++end));
		tabela.put("shl", new Simbolo(SHL,"shl", ++end));
		tabela.put("string", new Simbolo(STRING,"string", ++end));
		tabela.put("uses", new Simbolo(USES,"uses", ++end));
		tabela.put("xor", new Simbolo(XOR,"xor", ++end));
		
        //SÍMBOLOS
        tabela.put("+", new Simbolo(PLUS,"+", ++end));
        tabela.put("-", new Simbolo(LESS,"-", ++end));
        tabela.put("*", new Simbolo(MULT,"*", ++end));
        tabela.put("/", new Simbolo(DIVIDE,"/", ++end));
        tabela.put("=", new Simbolo(EQUAL,"=", ++end));
        tabela.put("<", new Simbolo(LESSTHAN,"<", ++end));
        tabela.put(">", new Simbolo(MORETHAN,">", ++end));
        tabela.put("<=", new Simbolo(LESSEQUAL,"<=", ++end));
        tabela.put(">=", new Simbolo(MOREEQUAL,">=", ++end));
        tabela.put("<>", new Simbolo(DIFFERENT,"<>", ++end));
        tabela.put("(", new Simbolo(OPPAR,"(", ++end));
        tabela.put(")", new Simbolo(CLPAR,")", ++end));
        tabela.put("[", new Simbolo(OPCOL,"[", ++end));
        tabela.put("]", new Simbolo(CLCOL,"]", ++end));
        tabela.put(",", new Simbolo(COMMA,",", ++end));
        tabela.put(";", new Simbolo(DOTCOMMA,";", ++end));
        tabela.put(":", new Simbolo(RECIEVE,":", ++end));
        tabela.put(".", new Simbolo(DOT,".", ++end));
        tabela.put("..", new Simbolo(INTERVAL,"..", ++end));
        tabela.put(":=", new Simbolo(RECIEVETO,":=", ++end));
        tabela.put("..=", new Simbolo(CLINTERVAL,"..=", ++end));
        tabela.put("//", new Simbolo(COMMENT,"//", ++end));
        tabela.put("{", new Simbolo(OPCHA,"{", ++end));
        tabela.put("}", new Simbolo(CLCHA,"}", ++end));
        tabela.put("^", new Simbolo(POINT,"^", ++end));
        tabela.put("|", new Simbolo(ORS,"|", ++end));
        tabela.put("@", new Simbolo(ARROBA,"@", ++end));
        tabela.put("$", new Simbolo(DOLLAR,"$", ++end));
        tabela.put("#", new Simbolo(SHARP,"#", ++end));
        tabela.put("&", new Simbolo(ANDS,"&", ++end));
        tabela.put("%", new Simbolo(PERCENT,"%", ++end));
	}
	
	public int Pesquisar(String lexema){
		lexema = lexema.toLowerCase();
		Simbolo aux = tabela.get(lexema);
		return aux.getEndereco();
	}
	
	public Simbolo BuscarSimbolo(String lexema){
		lexema = lexema.toLowerCase();
		return tabela.get(lexema);
	}
	
	public Simbolo InserirID(String lexema, byte ID){
		lexema = lexema.toLowerCase();
		Simbolo simbolo = new Simbolo(ID,lexema, ++end);
		tabela.put(lexema, simbolo);
		return tabela.get(lexema);
	}
	
	public Simbolo inserirConst(String lexema, String tipo){
		lexema = lexema.toLowerCase();
		Simbolo simbolo = new Simbolo(CONST, lexema, tipo, ++end);
		tabela.put(lexema, simbolo);
		return tabela.get(lexema);
	}

	public static boolean contains(String caractere) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'contains'");
	}

	public static void InserirID(String palavra, int nLine) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'InserirID'");
	}

}
