package org.petidierabraham.tema8.testejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.petidierabraham.tema8.ejercicio1.cadena;

class testcadenas {
cadena cadena=new cadena("Buennas");
	@Test
	void testcDelante(){
		cadena.cDelante("Hola");
		assertEquals("Hola Buennas",cadena.getCadena());
	}
	@Test
	void testcDetras(){
		cadena.cDetras("Hola");
		assertEquals("Buennas Hola",cadena.getCadena());
	}
	@Test
	void testquitar(){
		cadena.quitar('u');
		assertEquals("Bennas",cadena.getCadena());
	}
	@Test
	void testquitarvarias(){
		cadena.quitar('n',1);
		assertEquals("Bueas",cadena.getCadena());
	}
}