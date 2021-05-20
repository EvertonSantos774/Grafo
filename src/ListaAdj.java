// Representação de lista adjacente em Java

import java.util.*;

class ListaAdj {
	
	private int V;

	public ListaAdj(int V)
	{
		this.V = V;
	}

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }


  // Mosta a Lista adjacente
  static void printLista(ArrayList<ArrayList<Integer>> am) {
	  System.out.println("Lista");
    for (int i = 1; i < am.size(); i++) {
      System.out.print( i );
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}