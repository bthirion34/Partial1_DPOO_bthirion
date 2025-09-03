package logica;

public class Hombre extends Persona {
	public Hombre(String name,float peso, float altura, int edad) {
		super(name,peso, altura, edad);
	}
	@Override
	public double calcular_tmb() throws Exception {
		if (this.peso_kg<60 || this.peso_kg>110) {
			throw new Exception("el peso de "+this.name+" no es entre 60kg y 110kg, no podemos calcular el tmb");
		}
		if (this.altura_cm<165 || this.altura_cm>195) {
			throw new Exception("la altura de "+this.name+" no es entre 160cm y 195cm, no podemos calcular el tmb");
		}
		if (this.edad<=15) {
			throw new Exception(this.name+" tiene menos de 15 anos, no podemos calcular el tmb");
		}
		double tmb=88.362+(13.397*this.peso_kg)+(4.799*this.altura_cm)-(5.677*this.edad);
		return tmb;
	}
}
