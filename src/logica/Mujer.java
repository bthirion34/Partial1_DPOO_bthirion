package logica;

public class Mujer extends Persona {
	
	
	public Mujer(float peso_kg, float altura_cm, int edad) {
		super(peso_kg, altura_cm, edad);
	}

	@Override
	public double calcular_tmb() throws Exception {
		if (this.peso_kg<40 || this.peso_kg>80) {
			throw new Exception("el peso de la mujer no es bueno, no podemos calcular el tmb");
		}
		if (this.altura_cm<140 || this.altura_cm>180) {
			throw new Exception("la altura de la mujer no es entre 140cm y 180cm, no podemos calcular el tmb");
		}
		if (this.edad<=15) {
			throw new Exception("la mujer tiene menos de 15 anos, no podemos calcular el tmb");
		}
		double tmb=447.593+(9.247*this.peso_kg)+(3.098*this.altura_cm)-(4.33*this.edad);
		return tmb;
	}

}
