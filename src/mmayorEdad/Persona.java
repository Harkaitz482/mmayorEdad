package mmayorEdad;

public class Persona {
     public int edad;
	
	public Persona(int edad) {
		this.edad=edad;
	}
	public boolean isMayorDeEdad() {
		assert edad>=0;
		return edad>=18;
	}

}
