//import java.util.List;

//import ManipuladorArquivos.Carregador;
import ManipuladorArquivos.LexicalAnalyzer;
//import ManipuladorArquivos.Token;

public class App {
    public static void main(String[] args) {
      LexicalAnalyzer analyzer = new LexicalAnalyzer();
      analyzer.analyze("CalculadoraPascal.pas");
    }
}

