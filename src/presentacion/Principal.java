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
			hombres[0]=new Hombre("juan",75,176,32);
			hombres[1]=new Hombre("sebastian",50,165,22);
			System.out.println("tmb de"+hombres[0].get_name()+" : "+ hombres[0].calcular_tmb());
			System.out.println("tmb de"+hombres[1].get_name()+" : "+ hombres[1].calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	private void Caso2() {
		try {
			Mujer muj = new Mujer("lisa",60,139,25);
			System.out.println("tmb de"+muj.get_name()+" : "+ muj.calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	private void Caso3() {
		try {
			Hombre hom = new Hombre("tomas",60,163,14);
			System.out.println("tmb de "+ hom.get_name()+" : "+hom.calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
	private void Caso4() {
		try {
			Mujer muj = new Mujer("emma",60,165,25);
			Hombre hom= new Hombre("pablo",85,180,76);
			System.out.println("tmb de "+muj.get_name()+ " : "+ muj.calcular_tmb());
			System.out.println("tmb de "+ hom.get_name()+" : "+hom.calcular_tmb());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		new Principal();
	}
	
}
