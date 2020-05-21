package org.petidierabraham.tema8.testejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.petidierabraham.tema8.ejercicio2.FechaException;
import org.petidierabraham.tema8.ejercicio2.utilidades;

class testfecha {

	@Test
	void testnofindesemana()throws FechaException{
 		assertFalse(utilidades.esFinDeSemana(6,7,1999));
	}
	
	@Test
	void testfindesemana()throws FechaException{
 		assertFalse(utilidades.esFinDeSemana(10,7,1999));
	}
	
	@Test
	void testnosemana()throws FechaException{
 		assertTrue(utilidades.esFinDeSemana(21,5,2020));
	}
	
	@Test
	void testsemana()throws FechaException{
 		assertTrue(utilidades.esFinDeSemana(21,5,2020));
	}
	
	@Test
	void testfueraderango1()throws FechaException{
 		assertThrows(FechaException.class, () -> utilidades.esFinDeSemana(30,12,1899));
	}
	
	@Test
	void testfueraderango2()throws FechaException{
 		assertThrows(FechaException.class, () -> utilidades.esFinDeSemana(2,1,3000));
	}
}
