import java.util.ArrayList;
import java.util.*;


public class Grafo {

    private int connectedComponents;
    private Map<Integer, GrafoNo> grafo;


    public Grafo(){

        connectedComponents = 0;
        grafo = new HashMap<Integer, GrafoNo>();

    }

    public void adicionaNo(int node){
        grafo.put( node, new GrafoNo(node));
        connectedComponents += 1;
    }

    public boolean relacionaNo(int node1, int node2){
        GrafoNo nodeA = grafo.get(node1);
        GrafoNo nodeB = grafo.get(node2);

        if(!nodeA.inserirNo(nodeB)  || !nodeB.inserirNo(nodeA)) return false;
        if(possuiCiclo(nodeA)){
            nodeA.removerNo(nodeB);
            nodeB.removerNo(nodeA);
            return false;
        }
        else{
            connectedComponents--;
            return true;
        }

    }


    private boolean possuiCiclo(GrafoNo node){

        ArrayList<GrafoNo> links = node.getLinks();
        if(links.size() == 1) return false;

        boolean contains = false;
        for(GrafoNo nodeLinked : links){

            for(GrafoNo nodeLinked2 : nodeLinked.getLinks()){
                if(buscaNo(nodeLinked2, node)) contains = true;
            }
        }
        return contains;
    }

    private boolean buscaNo(GrafoNo node, GrafoNo nodeKey){


        if(node.getLinks().size() == 1) return false;
        if(node.getLinks().contains(nodeKey)) return true;

        boolean contains = false;
        for(GrafoNo nodeLinked : node.getLinks()){
            if(buscaNo(nodeLinked, nodeKey))  contains = true;
        }

        return contains;
    }

    public int getConnectedComponents(){
        return this.connectedComponents;
    }
}
