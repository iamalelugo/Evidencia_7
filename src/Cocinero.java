
public class Cocinero implements Interfaz{
	private String nombre;
	private int horasestufa;
	
	public Cocinero(String nombre, int horasestufa) {
		super();
		this.nombre = nombre;
		this.horasestufa = horasestufa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasestufa() {
		return horasestufa;
	}

	public void setHorasestufa(int horasestufa) {
		this.horasestufa = horasestufa;
	}

	@Override
	public void encenderobjeto() {
		System.out.print("Soy "+this.nombre+" encendi mi estufa");
	}

	@Override
	public void maniobrarobjeto() {
		// TODO Auto-generated method stub
		System.out.print("Soy "+this.nombre+" y llevo mas de "+this.horasestufa+" horas en la estufa");
	}

	@Override
	public void apagarobjeto() {
		// TODO Auto-generated method stub
		System.out.print("Soy "+this.nombre+" apague mi estufa");
	}
	
	
	
	
}
