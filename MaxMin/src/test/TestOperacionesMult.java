package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bussiness.Operaciones;

public class TestOperacionesMult {

	@Test
	public void testMultiplicacion() {
		Operaciones op = new Operaciones();
		double actual = op.producto(3, 2);
		double expected = 6;
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testMultiplicacionNeg() {
		Operaciones op = new Operaciones();
		double actual = op.producto(-3, 2);
		double expected = -6;
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testProductoDecimales(){
		Operaciones op = new Operaciones();
		double actual = op.producto(3.45, 2.7);
		double expected = 9.315;
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testProductoDecimalesNegativos(){
		Operaciones op = new Operaciones();
		double actual = op.producto(-3.45,-2.7);
		double expected = 9.315;
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testProductoDecimalesNegPos(){
		Operaciones op = new Operaciones();
		double actual = op.producto(-3.45, 2.7);
		double expected = -9.315;
		assertEquals(expected,actual,0.1);
	}

}
