package org.petidierabraham.tema8.ejercicio1;

public class cadena {
	 private String cadena;
	 
	 public cadena(String Cadena) {
	 super();
	 this.cadena=Cadena;
	 }
	 public String getCadena() {
		 return cadena;
	 }
	 public void cDelante(String delan) {
		 cadena=delan+" "+cadena;
	 }
	 public void cDetras(String detras) {
		 cadena=cadena+" "+detras;
	 }
	 public void quitar(char qui) {
		 String quitar=""+qui;
		 cadena=cadena.replaceAll(quitar,"");
	 }
	 public void quitar(char qui,int num) {
		 String quitar=""+qui;
		 for (int x=0;x<num;x++) {
			 cadena=cadena.replace(quitar,"");
		 }
	 }
}
