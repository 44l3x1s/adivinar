package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bussines.Grafo;
 
public class GrafoTest {

	@Test
	public void existeArista() {
		Grafo grafo = new Grafo(5);
		grafo.agregarArista(2, 3);
		assertTrue(grafo.existeArista(2, 3));
	}
	@Test
	public void noExisteArista(){
		Grafo grafo = new Grafo(5);
		assertFalse(grafo.existeArista(2, 3));
	}
	@Test
	(expected=IllegalArgumentException.class)
	public void cantidad_valida(){
		Grafo grafo = new Grafo(-3);
		
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void parametrosI_invalido(){
		Grafo grafo = new Grafo(3);
		grafo.agregarArista(-1, 2);
		
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void parametrosJ_invalido(){
		Grafo grafo = new Grafo(3);
		grafo.agregarArista(1,-2);
		
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void parametrosIJ_invalidos(){
		Grafo grafo = new Grafo(3);
		grafo.agregarArista(-1, -2);
		
	}

}
