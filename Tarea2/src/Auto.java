public class Auto {
	Persona dueño;
	static String marca;
	String matricula;
	int tiempoT;

	public Auto(String marca, String matricula, Persona dueño) {
		this.dueño = dueño;
		Auto.marca = marca;
		this.matricula = matricula;
		tiempoT = 0;
	}
}
