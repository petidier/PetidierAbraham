package org.petidierabraham.tema8.testejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.petidierabraham.tema8.ejercicio3.NumeroException;
import org.petidierabraham.tema8.ejercicio3.utilidades;

class PrimosTest {

	@Test
 	void numero5() throws NumeroException{
 		assertTrue(utilidades.esPrimo(5));
 	}
	@Test
 	void numero16() throws NumeroException{
 		assertFalse(utilidades.esPrimo(16));
 	}
	@Test
 	void numero999983() throws NumeroException{
 		assertTrue(utilidades.esPrimo(999983));
 	}
	@Test
 	void numero100000() throws NumeroException{
 		assertFalse(utilidades.esPrimo(1000000));
 	}
	@Test
 	void numero1000001() throws NumeroException{
		assertThrows(NumeroException.class, () -> utilidades.esPrimo(1000001));
 	}
	@Test
 	void numero1() throws NumeroException{
 		assertFalse(utilidades.esPrimo(1));
 	}
	@Test
 	void numero0() throws NumeroException{
 		assertFalse(utilidades.esPrimo(0));
 	}
}
