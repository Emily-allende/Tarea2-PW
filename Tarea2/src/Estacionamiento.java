import java.util.ArrayList;
public class Estacionamiento {
	public static Auto autos[];
	int lugar;
	static int pEntrada;
	static int pNoche;
	ArrayList<Persona> persona;
	
	public Estacionamiento(){
		Estacionamiento.autos= new Auto[8];
	}
	public void inicializar(int lugar, int pEntrada, int pNoche) {
		this.lugar = lugar;
		Estacionamiento.pEntrada = pEntrada;
		Estacionamiento.pNoche = pNoche;
	}

	public static void entra(Auto a) {
		boolean encontrado= false;
		for(int i=0;i< autos.length && !encontrado;i++) {
			if(autos[i]==null) {
				autos[i]=a;
				encontrado=true;
			}
		}
	}

	public static void sale(Auto a) {
		boolean encontrado=false;
		for(int i=0;i< autos.length && !encontrado; i++){
			if(autos[i]!=null && autos[i].equals(a)) {
				autos[i]=null;
				encontrado=true;
			}
		}
	}

	public static void nuevoDia(int x) {
		// TODO Auto-generated method stub
		if (x > 11) {
			System.out.println("El estacionamiento cerro");
		} else {
			if (x >= 7) {
				System.out.println("El estacionamiento esta abierto");
			}
		}

	}

	public static int calcular(int x) {
		if (x < 8) {
			return pEntrada;
		} else {
			return pEntrada + pNoche;
		}

	}

}

