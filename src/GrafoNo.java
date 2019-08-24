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
     * Insere um No paraInserir na lista de links do grafo. Ignora se o grafo ja existe nos links.
     * @param paraInserir GrafoNo a ser inserido nos links.
     */
    public void inserirNo(GrafoNo paraInserir){
        if(!this.links.contains(paraInserir)){
            links.add(paraInserir);
        }
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
    public ArrayList getLinks(){
        return this.links;
    }
}
