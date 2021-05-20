// Representação de Matriz em Java

public class MatrizAdj {
  private boolean adjMatriz[][];
  private int numVertices;

  // Inicializa a matrix
  public MatrizAdj(int numVertices) {
    this.numVertices = numVertices;
    adjMatriz = new boolean[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int i, int j) {
	  adjMatriz[i][j] = true;
	  adjMatriz[j][i] = true;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
	  adjMatriz[i][j] = false;
	  adjMatriz[j][i] = false;
  }

  // Mostra a Matriz
  public String toString() {
	  System.out.println("Matriz");
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < numVertices; i++) {
      s.append("|");
      for (boolean j : adjMatriz[i]) {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("|\n");
    }
    return s.toString();
  }

}
