import java.util.ArrayList;
import java.util.Scanner;

public class InterpretarArquivo {
    /**
     * Executa
     * @param comandos
     */
    public static String exercutarCommandos(ArrayList<String> comandos){
        String resultado = "";
        for(String s : comandos){
            System.out.println(s);
        }
        int sizeGrafo = Integer.valueOf(comandos.remove(0));
        Grafo table = new Grafo();
        for(int i = 1 ; i<=sizeGrafo ; i++){
            table.adicionaNo(i);
        }
        return resultado;
    }
}
