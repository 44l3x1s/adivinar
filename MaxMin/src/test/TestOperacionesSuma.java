package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bussiness.Operaciones;

public class TestOperacionesSuma {

	@Test
	public void testSumaEntero() {
		Operaciones op = new Operaciones();
		double expected = 5;
		double actual = op.suma(2, 3);
		assertEquals(expected, actual,0.1);
	}
	@Test
	public void testSumaDecimal(){
		Operaciones op = new Operaciones();
		double expected = 3.9;
		double actual = op.suma(3.0, 0.9);
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testSumaDecimalGrande(){
		Operaciones op = new Operaciones();
		double expected = 71.2439;
		double actual = op.suma(45.2589,25.985);
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testSumaDeEnteros(){
		Operaciones op = new Operaciones();
		double expected = -98;
		double actual = op.suma(-100,2);
		assertEquals(expected,actual,0.1);		
	}
	@Test
	public void testSumaDeEnterosDecimales(){
		Operaciones op = new Operaciones();
		double expected = -8.66555;
		double actual = op.suma(-12.54,3.8745);
		assertEquals(expected,actual,0.1);
	}
	
}
