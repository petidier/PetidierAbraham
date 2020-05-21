package org.petidierabraham.tema8.ejercicio2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class utilidades {
	public static boolean esFinDeSemana(int dia,int mes,int anyo) throws FechaException{
		boolean fin=true;
		Calendar calendario=new GregorianCalendar();
		calendario.set(anyo,mes,dia);
		if (anyo<1900 || (dia !=1 && mes !=1 && anyo==3000)||anyo>=3000) {
			throw new FechaException("La fecha no es correcta");
		}else {
			int dias=calendario.get(Calendar.DAY_OF_WEEK);
			if (dias==Calendar.SATURDAY || dias==Calendar.SUNDAY) {
				fin=true;
				
			}else {
				fin=false;	
			}
			return fin;
		}
		
	}

}
