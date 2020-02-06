package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bussiness.Operaciones;

public class TestOperacionesDivicion {

	@Test (expected=IllegalArgumentException.class)
	public void testIllgalArgument() {
		Operaciones op = new Operaciones();
		op.divicion(3, 0);
	}
	@Test
	public void testDivExacta(){
		Operaciones op = new Operaciones();
		double actual = op.divicion(14, 7);
		double expected = 2;
		assertEquals(expected, actual,0.1);
		
	}
	@Test
	public void testDivDecimal(){
		Operaciones op = new Operaciones();
		double actual = op.divicion(14, 8);
		double expected = 1.75;
		assertEquals(expected,actual,0.1);
		
	}
	@Test
	public void testDivDecimales(){
		Operaciones op = new Operaciones();
		double actual = op.divicion(14.32, 8.98);
		double expected = 1.594654;
		assertEquals(expected,actual,0.1);
		
	}
	@Test
	public void testDivDecimalesPos(){
		Operaciones op = new Operaciones();
		double actual = op.divicion(-14.32,-8.98);
		double expected = 1.594654;
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testDivDecimalesNeg(){
		Operaciones op = new Operaciones();
		double actual = op.divicion(-14.32,8.98);
		double expected = -1.594654;
		assertEquals(expected,actual,0.1);
		
	}
	

}
