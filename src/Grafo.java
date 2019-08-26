import java.util.ArrayList;
import java.util.*;


public class Grafo {

    private int connectedComponents;
    private Map<Integer, GrafoNo> grafo;


    public Grafo(){
        connectedComponents = 0;
        grafo = new HashMap<Integer, GrafoNo>();
    }

    /**
     * Cria e adiciona o nó ao MapaHash, sendo a chave valor inteiro do nó.
     * @param node valor inteiro do nó a ser criado e adicionado.
     */
    public void adicionaNo(int node){
        grafo.put( node, new GrafoNo(node));
        connectedComponents += 1;
    }

    /**
     * Cria uma relação ente dois nós, verificando se causa um ciclo.
     * Retorna True caso a realação for adiciona com sucesso.
     * Retorna False caso a relação gera ciclo, removendo-a.
     * @param node1
     * @param node2
     * @return
     */
    public boolean relacionaNo(int node1, int node2){
        GrafoNo nodeA = grafo.get(node1);
        GrafoNo nodeB = grafo.get(node2);
        if(node1 == node2){
            return false;
        }
        if(possuiCiclo(nodeA,nodeB) && possuiCiclo(nodeB,nodeA)) {
            return false;
        }
        nodeA.inserirNo(nodeB);
        nodeB.inserirNo(nodeA);
        connectedComponents--;
        return true;
    }

    /**
     * Verifica se há ciclo a partir de um determinado nó.
     * @param nodeA Nó de partida.
     * @param nodeB Nó de chegada.
     * @return true caso houver clico, caso contrário não.;
     */
    private boolean possuiCiclo(GrafoNo nodeA, GrafoNo nodeB){

        ArrayList<GrafoNo> linksA = nodeA.getLinks();
        if(linksA.contains(nodeB)) return true;
        else{
            for(GrafoNo link :linksA){
                if(possuiCiclo(nodeA,link,nodeB)){ return true; }
            }
        }
        return false;
    }
    private boolean possuiCiclo(GrafoNo origin, GrafoNo nodeA, GrafoNo nodeB){

        ArrayList<GrafoNo> linksA = nodeA.getLinks();
        if(linksA.contains(nodeB)) return true;
        else{
            for(GrafoNo link :linksA){
                if(link!=origin){
                    if(possuiCiclo(nodeA,link,nodeB)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Realiza uma busca por um determinado nó dentro de listas de nós,
     * até que não haja mais elementos nestas listas ou o nó for encontrado.
     * @param node Nó de partida.
     * @param nodeKey Nó a ser buscado.
     * @return true caso nó encontrado, caso contrário false.
     */
    private boolean buscaNo(GrafoNo node, GrafoNo nodeKey){


        if(node.getLinks().size() == 1) return false;
        if(node.getLinks().contains(nodeKey)) return true;

        boolean contains = false;
        for(GrafoNo nodeLinked : node.getLinks()){
            if(buscaNo(nodeLinked, nodeKey))  contains = true;
        }

        return contains;
    }

    /**
     * Retorna a quantidade de Grafos individuais dentre os nos
     * @return Numero de Grafos individuais no mapa
     */
    public int getConnectedComponents(){
        return this.connectedComponents;
    }
}
