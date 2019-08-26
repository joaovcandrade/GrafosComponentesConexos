import java.util.ArrayList;
import java.util.Scanner;

public class InterpretarArquivo {
    /**
     * Executa comandos do arquivo lido
     * @param comandos Lista de Strings de commandos a serem executadosm onde o primeiro indica a quantidade de nos
     * no grafo, e o restante as coneccoes a serem formadas
     */
    public static String exercutarCommandos(ArrayList<String> comandos){
        String resultado = "";
        /*
        for(String s : comandos){
            System.out.println(s);
        }*/
        int sizeGrafo = Integer.valueOf(comandos.remove(0));
        Grafo table = new Grafo();
        for(int i = 1 ; i<=sizeGrafo ; i++){
            table.adicionaNo(i);
        }
        //System.out.println(table.getConnectedComponents());
        for (String comando: comandos) {
            int i=0;
            while (i<comando.length() && comando.charAt(i)!=' '){
                i++;
            }
            int firstNode = 0;
            int secondNode = 0;
            firstNode= Integer.valueOf(comando.substring(0,i));
            //System.out.print(firstNode+" ");
            secondNode= Integer.valueOf(comando.substring(i+1,comando.length()));
            //System.out.println(secondNode);
            if(firstNode>0 && secondNode>0){
                if(table.relacionaNo(firstNode,secondNode)){
                    resultado += table.getConnectedComponents()+"\r\n";
                }else{
                    resultado += table.getConnectedComponents()+" "+"CICLO FORMADO!\r\n";
                }
            }
        }
        return resultado;
    }
}
