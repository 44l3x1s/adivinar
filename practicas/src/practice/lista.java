package practice;

import java.util.ArrayList;

public class lista {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("dino");
		lista.add("saurio");
		lista.add("alexis");
		lista.add("papi");
		
		System.out.println(lista.get(0));
		doProcess(lista);
		//System.out.println(lista.size());
		
	}
	static void doProcess(ArrayList<String> lista){
		for(String character : lista){
			System.out.println(character.equals("dino"));
			/*if(character.equals("saurio"))
				lista.remove(character);*/
		}
	}

}
