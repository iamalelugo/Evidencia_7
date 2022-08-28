

public class Evidencia_7 {


	public static void main(String[] args) {
		
		Piloto piloto = new Piloto("Ale", 22);
		Desarrollador desarrollador = new Desarrollador("Jorge", 5000);
		Cocinero cocinero = new Cocinero("Tere", 3);
		
		piloto.encenderobjeto();
		piloto.maniobrarobjeto();
		piloto.apagarobjeto();
		
		desarrollador.encenderobjeto();
		desarrollador.maniobrarobjeto();
		desarrollador.apagarobjeto();
		
		cocinero.encenderobjeto();
		cocinero.maniobrarobjeto();
		cocinero.apagarobjeto();
	}
}
