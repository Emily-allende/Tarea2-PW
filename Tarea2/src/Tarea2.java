public class Tarea2 {
	public static void main(String[] args) {
		Estacionamiento estacionamiento = new Estacionamiento();
		estacionamiento.inicializar(2, 60, 180); 
			
		Persona juan = new Persona("Juan");
		Auto autoJuan = new Auto(Auto.marca, "BCF-235", juan);

		Estacionamiento.entra(autoJuan); 
		// se inicializa la cuenta corriente a Juan y se le agrega $60

		Persona ana = new Persona("Ana");
		Auto autoAna = new Auto(Auto.marca, "BRF-535", ana);
		Estacionamiento.entra(autoAna);

		Estacionamiento.sale(autoJuan);

		Estacionamiento.nuevoDia(0);  
		// cierra el estacionamiento y abre el dia siguiente

		Estacionamiento.entra(autoJuan);
		Persona felipe = new Persona("Felipe");
		Auto autoFelipe = new Auto(Auto.marca, "BFD-124", felipe);
		Estacionamiento.entra(autoFelipe);
		// notar que no entra el auto, asi que no tiene ningun efecto

		Estacionamiento.calcular(0);
	}
}
