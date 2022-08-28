
public class Desarrollador implements Interfaz {
	
	private String nombre;
	private int lineasdecodigo;
	
	public Desarrollador(String nombre, int lineasdecodigo) {
		super();
		this.nombre = nombre;
		this.lineasdecodigo = lineasdecodigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLineasdecodigo() {
		return lineasdecodigo;
	}

	public void setLineasdecodigo(int lineasdecodigo) {
		this.lineasdecodigo = lineasdecodigo;
	}

	@Override
	public void encenderobjeto() {
		System.out.print("Soy "+this.nombre+" encendi mi computadora");
	}

	@Override
	public void maniobrarobjeto() {
		// TODO Auto-generated method stub
		System.out.print("Soy "+this.nombre+" y llavo mas de "+this.lineasdecodigo+" lineas codificadas");
	}

	@Override
	public void apagarobjeto() {
		// TODO Auto-generated method stub
		System.out.print("Soy "+this.nombre+" apague mi computadora");
	}
	
	
	
	
}
