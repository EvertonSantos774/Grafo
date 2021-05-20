import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num;
		
		int vert = 5;
		int arest = 5;
		
		Grafo g = new Grafo (vert, arest); 
		
		System.out.println("Entre com um n�mero para escolher um estilo de Grafo: \n1 - MATRIZ DE ADJACENCIA \n2 - LISTA DE ADJACENCIA");
		num = entrada.nextInt();
		
		switch (num)
		{
			case 1:
				MatrizAdj m = new MatrizAdj(vert);

			    m.addEdge(0, 1);    
			    m.addEdge(0, 4);
			    m.addEdge(1, 4);
			    m.addEdge(4, 3);
			    m.addEdge(4, 2);
			    
				System.out.println(m.toString());
				break;
				
			case 2:
				 ListaAdj l = new ListaAdj (vert);
				    int V=6;
				    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

				    for (int i = 0; i < V; i++)
				      am.add(new ArrayList<Integer>());

				    // Add edges
				    addEdge(am, 1, 2);
				    addEdge(am, 1, 5);
				    addEdge(am, 2, 5);
				    addEdge(am, 5, 3);
				    addEdge(am, 5, 4);
				    
				l.printLista(am);
				break;
			
			default :
				System.out.println("N�mero inv�lido");	
		}
		
		System.out.printf("\nO n�mero de V�rtices �: "+ g.getVert());
		System.out.println();
		System.out.printf("\nO n�mero de Arestas �: "+ g.getAresta());
		System.out.println();		
		System.out.printf(g.toString());
			
	}

static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
    am.get(d).add(s);
  }}