import java.util.ArrayList;

public class GrafoNo {

    private int value;
    private ArrayList<GrafoNo> links;

    /**
     * Cria um novo No de Grafo de conteudo valor, sem vizinhos.
     * @param valor inteiro conteudo do grafo.
     */
    public GrafoNo(int valor){
        this.value=valor;
        this.links = new ArrayList<>();
    }

    /**
     * Insere um No paraInserir na lista de links do grafo. Retorna false e não insere se o grafo ja existe nos links, caso contrario true.
     * @param paraInserir GrafoNo a ser inserido nos links.
     */
    public boolean inserirNo(GrafoNo paraInserir){
        if(!this.links.contains(paraInserir)){
            links.add(paraInserir);
            return true;
        }
        return false;
    }

    /**
     * Insere um No paraInserir na lista de links do grafo. Retorna false e não insere se o grafo ja existe nos links, caso contrario true.
     * @param paraRemover GrafoNo a ser inserido nos links.
     */
    public boolean removerNo(GrafoNo paraRemover){
        if(this.links.contains(paraRemover)){
            links.remove(paraRemover);
            return true;
        }
        return false;
    }

    /**
     * Retorna a variavel interna Value
     * @return valor inter node value
     */
    public int getValue(){
        return this.value;
    }

    /**
     * Retorna a lista de viznhos do Grafo
     * @return Lista interna de vizinhos do grafo, links
     */
    public ArrayList<GrafoNo> getLinks(){
        return this.links;
    }
}
