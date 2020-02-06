package bussiness;

public class Operaciones {
	
	public double suma(double num1,double num2){
		return num1+num2;
	}
	public double resta(double num1, double num2){
		return num1-num2;
	}
	public double producto(double num1,double num2){
		return num1*num2;
	}
	public double divicion(double num1,double num2){
		verificarDividendo(num2);
		return num1/num2;
	}
	private void verificarDividendo(double dividendo){
		if(dividendo == 0)
			throw new IllegalArgumentException("No se puede dividir con 0");
	}
}


	