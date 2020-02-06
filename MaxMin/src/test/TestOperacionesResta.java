package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bussiness.Operaciones;

public class TestOperacionesResta {

	@Test
	public void testRestaComun(){
		Operaciones op = new Operaciones();
		double expected = 9;
		double actual = op.resta(12,3);
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testResta(){
		Operaciones op = new Operaciones();
		double expected = -15;
		double actual = op.resta(-12,3);
		assertEquals(expected,actual,0.1);
	}
	@Test
	public void testRestaDecimal(){
		Operaciones op = new Operaciones();
		double expected = 9.747;
		double actual = op.resta(12.98,3.233);
		assertEquals(expected,actual,0.1);
		
	}
	@Test
	public void testRestaDecimalNegativo(){
		Operaciones op = new Operaciones();
		double expected = -16.213;
		double actual = op.resta(-12.98,3.233);
		assertEquals(expected,actual,0.1);
		
	}

}
