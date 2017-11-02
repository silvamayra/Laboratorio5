/**
 * 
 */

/**
 * @author smayr
 *
 */
public class Bachillerato extends Estudiante implements NotaEscalafon {
	protected float promDecimo;
	protected float promOnceavo;
	protected float notaHistoria;
	/**
	 * 
	 */
	public Bachillerato() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nombre
	 * @param dpi
	 * @param notaFinal
	 */
	public Bachillerato(String nombre, String dpi, float notaFinal,
			float promDecimo, float promOnceavo, float notaHistoria) {
		super(nombre, dpi, notaFinal);
		this.promDecimo=promDecimo;
		this.promOnceavo=promOnceavo;
		this.promOnceavo=promOnceavo;
		// TODO Auto-generated constructor stub
	}
	
	public void calcularPromedio() {
	}
	
	public void calcularNota() {
	}
	
	
	
	

}
