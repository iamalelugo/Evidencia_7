
public class Piloto implements Interfaz{
	private String nombre;
	private int yearsvolando;
	
	public Piloto(String nombre, int yearsvolando) {
		super();
		this.nombre = nombre;
		this.yearsvolando = yearsvolando;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getYearsvolando() {
		return yearsvolando;
	}

	public void setYearsvolando(int yearsvolando) {
		this.yearsvolando = yearsvolando;
	}

	@Override
	public void encenderobjeto() {
		
		System.out.print("Soy "+this.nombre+" encendi mi nave");
	}

	@Override
	public void maniobrarobjeto() {
		System.out.print("Soy "+this.nombre+" y llevo mas de "+this.yearsvolando+"anios volando");
		
	}

	@Override
	public void apagarobjeto() {
		// TODO Auto-generated method stub
		System.out.print("Soy "+this.nombre+" apague mi nave");
	}
	
	
	
}
