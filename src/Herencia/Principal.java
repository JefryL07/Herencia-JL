package Herencia;

public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("Andy", "Gomez", 53, 134);
		Doctor doctor = new Doctor("Juan", "Méndez", 45, "Cirujano");
		
		paciente.mostrarPaciente();
		
		System.out.println("\n");
		
		doctor.mostrarDoctor();
	}

}
