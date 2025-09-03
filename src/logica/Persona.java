package logica;

public abstract class Persona {
	protected float peso_kg;
	protected float altura_cm;
	protected int edad;
	
	public Persona(float peso_kg, float altura_cm, int edad) {
		this.peso_kg=peso_kg;
		this.altura_cm=altura_cm;
		this.edad=edad;
	}
	public void set_peso(float peso_kg) {
		this.peso_kg=peso_kg;
	}
	public void set_altura(float altura_cm) {
		this.altura_cm=altura_cm;
	}
	public void set_edad(int edad) {
		this.edad=edad;
	}
	public abstract double calcular_tmb() throws Exception;

}
