package funclambda;


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

public class Funciones {

	public static int maxValor(ArrayList<Integer> lista){
		int max = lista.get(0);
		for(Integer i : lista){
			if(i>max)
				max=i;
		}
		return max;
	}
	public static int minValor(ArrayList<Integer> lista){
		int min = lista.get(0);
		for(Integer i : lista){
			if(i<min)
				min=i;
		}
		return min;
	}
	public static int mejorSegun(BiFunction<Integer,Integer,Boolean> comparador,ArrayList<Integer> lista){
		int mejor = lista.get(0);
		for(Integer elem : lista)
			if(comparador.apply(elem, mejor))
				mejor=elem;
		return mejor;
	}
	public static int max(ArrayList<Integer> lista){
		return mejorSegun((a,b)-> a>b, lista);
	}
	
	public static int min(ArrayList<Integer> lista){
		return mejorSegun((a,b)-> a<b,lista);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(6,4,1,5));
		System.out.println(max(lista));
		System.out.println(min(lista));

	}

}
