package presentacion;

import logica.Persona;
import logica.Hombre;
import logica.Mujer;

public class Principal {
	public Principal() {
		Caso1();
		Caso2();
		Caso3();
		Caso4();
	}

	private void Caso1() {
		try {
			Hombre[] hombres=new Hombre[2];
			hombres[0]=new Hombre(75,176,32);
			hombres[1]=new Hombre(50,165,22);
			System.out.println("tmb del hombre 1 : "+ hombres[0].calcular_tmb());
			System.out.println("tmb del hombre 2 : "+ hombres[1].calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	private void Caso2() {
		try {
			Mujer lisa = new Mujer(60,139,25);
			System.out.println("tmb de lisa : "+ lisa.calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	private void Caso3() {
		try {
			Hombre tomas = new Hombre(60,163,14);
			System.out.println("tmb de tomas : "+ tomas.calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
	private void Caso4() {
		try {
			Mujer emma = new Mujer(60,165,25);
			Hombre john= new Hombre(85,180,76);
			System.out.println("tmb de emma : "+ emma.calcular_tmb());
			System.out.println("tmb de John : "+ john.calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Principal();
	}
	
}
