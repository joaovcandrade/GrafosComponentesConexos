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
        for (String comando: comandos) {
            int i=0;
            while (i<comando.length() && comando.charAt(i)!=' '){
                i++;
            }
            int firstNode= Integer.valueOf(comando.substring(0,i));
            int secondNode= Integer.valueOf(comando.substring(i+1,comando.length()));
            if(table.relacionaNo(firstNode,secondNode)){
                resultado += table.getConnectedComponents()+"\r\n";
            }else{
                resultado += table.getConnectedComponents()+"CICLO FORMADO!\r\n";
            }
        }
        return resultado;
    }
}
