package adivina;

import javax.management.RuntimeErrorException;

public class Adivina {
	int rdm;
	
	public Adivina(){
		rdm = 0;
	}
	public Adivina(int random){
		rdm = random;
	}
	
	public boolean iguales(int aleatorio,int entrada){
			boolean ret = false;
			if(aleatorio==entrada)
				ret = true;
			return ret;
	}
	//si la entrada es menor que el random te retorna true sino false
	public boolean entradaMenor(int aleatorio,int entrada){
		boolean ret = false;
		if(aleatorio>entrada)
			ret = true;
		return ret;
	}
	public boolean verificarInput(int numero){
		boolean ret = true;
		if(numero<0 || numero>100)
			ret=false;
			//throw new RuntimeException("numero invalido");
		return ret;
	}
	public int num_rdm(){
		return rdm;
	}
}
