package Herencia;

public class Doctor extends Persona{

	private String Especialidad;

	public Doctor(String nombre, String apellido, int edad, String especialidad) {
		super(nombre, apellido, edad);
		Especialidad = especialidad;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	
	public void mostrarDoctor() {
		System.out.println("Nonbre del Doctor: " + getNombre());
		System.out.println("Apellido del Doctor: " + getApellido());
		System.out.println("Edad del Doctor: " + getEdad());
		System.out.println("Especialidad:  " + getEspecialidad());
	}
}
