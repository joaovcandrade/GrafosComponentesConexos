/*
NAO UTILIZADO
import java.util.*;
 */
/*
public class PercorreGrafo{

  /**
   * Retorna um Mapa onde o valor associado a cada chave(nó) é o conjunto que contem todos os nós alcancáveis ao fazer um percurso iniciando-se pela chave
   * @param nos Lista de nós contidos no grafo
   * @return mapa dos nós e o conjunto de seus componentes conexos
   */
/*
  public Map<GrafoNo, Set<GrafoNo>> getMapaComponentesConexas(List<GrafoNo> nos){
    Map<GrafoNo, Set<GrafoNo>> mapaGrafo = new HashMap<>();

    for(GrafoNo no : nos){
      mapaGrafo.put(no, percorrerGrafoAPartirDe(no));
    }

    return mapaGrafo;
  }

  /**
   * Percorre o grafo a partir de um GrafoNo e retorna o conjunto que contem todos os nós alcançáveis ao fazer um percurso inciando-se por GrafoNo
   * @param no nó a partir do qual o grafo será percorrido
   * @return conjunto de componentes conexas
   *//*
  public Set<GrafoNo> percorrerGrafoAPartirDe(GrafoNo no){
    Set<GrafoNo> output = new HashSet<>();
    output.add(no);

    percorrer(no, output);

    return output;
  }

  /**
   * Retorna o número de componentes conexas ao dado nó
   * @param no nó a partir do qual o grafo será percorrido
   * @return número de componentes conexas
   *//*
  public int getNumeroComponentesConexas(GrafoNo no){
    Set<GrafoNo> output = new HashSet<>();
    output.add(no);

    percorrer(no, output);

    return output.size();
  }

  /**
   * Método recursivo (in-place) que percorre os vizinhos de um dado nó e os adiciona a um conjunto de nós já percorridos.
   * nosJaPercorridos terá seu estado modificado e conterá todos os nós alcançáveis pelo nó ao final da recursão.
   * @param no nó a ter seus vizinhos percorridos
   * @param nosJaPercorridos conjunto de nós já percorridos entre as recursões da função
   *//*
  private void percorrer(GrafoNo no, Set<GrafoNo> nosJaPercorridos){
    Set<GrafoNo> vizinhos = getLinksSet(no);

    for(GrafoNo vizinho : vizinhos) {
      if (!nosJaPercorridos.contains(vizinho)) {
        percorrer(vizinho, nosJaPercorridos);
        nosJaPercorridos.add(vizinho);
      }
    }
  }

  /**
   * Retorna um conjunto dos nós vizinhos ao nó
   * @param no
   * @return conjunto contendos os nós adjacentes a nó.
   *//*
  private Set<GrafoNo> getLinksSet(GrafoNo no){
    return new HashSet<>(no.getLinks());
  }

}
*/