public class Main {

    public static void main(String[] args) {
//        String fileName = args[0];
//        while(fileName.length()!=0){
//            fileName=fileName.substring(1,fileName.length());
//            System.out.println();
//        }
        Grafo grafo = new Grafo();
        grafo.adicionaNo(1);
        grafo.adicionaNo(2);
        grafo.adicionaNo(3);
        grafo.adicionaNo(4);
        System.out.println(grafo.connectedComponents);
        if(!grafo.relacionaNo(1,1)) System.out.println("CICLO!");

    }
}
