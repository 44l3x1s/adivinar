package bussines;

public class Grafo {
	//Representamo el grado por su matriz de adyacencia
	private boolean [][] A;
	
	//la cantidad de verties esta predeterminado desde el constructor
	public Grafo(int vertices){
		if(vertices<0)
			throw new IllegalArgumentException("Parametro invalido");
		
		A = new boolean [vertices][vertices];
	}
	
	public void agregarArista(int i,int j){
		if(i<0 || j<0 )
			throw new IllegalArgumentException("Parametro invalido");
		A[i][j] = true;
		A[j][i] = true;
	}
	
	public boolean existeArista(int i, int j){
		return A[i][j];
	}	
}
