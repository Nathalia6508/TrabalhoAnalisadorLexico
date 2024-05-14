package ManipuladorArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.TableView;
public class Analisador {
    public void analisar() throws IOException{
        int nLine = 0;
        while (true){
            nLine++;

            BufferedReader codigoFonte;
            String linha = codigoFonte.readLine();
            if (linha == null)
                break;
            
            int size = linha.length();
            linha = linha.split("\r")[0];
            String caractere = "";

            for (int i = 0; i < size;i++){
                caractere = linha.substring(i,i+1);
                String palavra;
                if (TabelaSimbolos.contains(caractere)){
                     boolean inComment;
                    if ((!inComment) && (palavra.length() >= 2) && (palavra.substring(0,2).equals(
                        "//"))){
                        palavra = "";
                        break;
                     }
                     if ((!inComment) && (palavra.length() >= 2) && (palavra.substring(0,2).equals(
                        "/*"))){
                        palavra = "";
                        inComment = true;
                     }
                     if ((inComment) && (palavra.length() >= 2) && (palavra.substring(0,2).equals(
                        "*/"))){
                        palavra = "";
                        inComment = false;
                     }
                     
                    if (!inComment){ 
                        String tipo;
                        if ((!palavra.equals("")) && (!palavra.contains("/*"))){
                            this.addToken(palavra,nLine);
                            //TabelaSimbolos.inserirConst(palavra, tipo);
                        }

                        //alinhar o token correspondente
                    }
                        palavra = "";
                    
                }
                else
                    palavra = palavra + caractere;
            } 
        }
    }

}
