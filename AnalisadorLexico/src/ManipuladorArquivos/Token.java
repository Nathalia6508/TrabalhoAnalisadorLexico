package ManipuladorArquivos;

public class Token {
    private TokenType type;

    public Token(TokenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
