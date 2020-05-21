package org.petidierabraham.tema8.ejercicio3;

public class utilidades {
	public static boolean esPrimo(int numero) throws NumeroException {
		int a=0;
		boolean primo=true;
		if (numero<0 || numero>1000000) {
			throw new NumeroException("No primo");
		} else if (numero==0 || numero==1) {
			primo=false;
		} else {
			for (int x=2;x<=numero && a!=1;x++) {
				if (numero % x==0) {
					primo=false;
					a=1;
				} else {
					a=1;
					primo=true;
				}
			}
		}
		return primo;
	}
}



