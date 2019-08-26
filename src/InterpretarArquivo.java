import java.util.ArrayList;
import java.util.Scanner;

public class InterpretarArquivo {
    public static void ler_Exercutar(String fileName){
        ArrayList<String> comandos = OperaArquivo.LerArquivo(fileName);
        for(String s : comandos){
            System.out.println(s);
        }
        int sizeGrafo = Integer.valueOf(comandos.remove(0));
        Grafo table = new Grafo();
        for(int i = 1 ; i<=sizeGrafo ; i++){
            table.adicionaNo(i);
        }
    }
}
