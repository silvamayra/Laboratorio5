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
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the dpi
	 */
	public String getDpi() {
		return dpi;
	}
	/**
	 * @param dpi the dpi to set
	 */
	public void setDpi(String dpi) {
		this.dpi = dpi;
	}
	/**
	 * @return the notaFinal
	 */
	public float getNotaFinal() {
		return notaFinal;
	}
	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	/**
	 * @return the promDecimo
	 */
	public float getPromDecimo() {
		return promDecimo;
	}
	/**
	 * @param promDecimo the promDecimo to set
	 */
	public void setPromDecimo(float promDecimo) {
		this.promDecimo = promDecimo;
	}
	/**
	 * @return the promOnceavo
	 */
	public float getPromOnceavo() {
		return promOnceavo;
	}
	/**
	 * @param promOnceavo the promOnceavo to set
	 */
	public void setPromOnceavo(float promOnceavo) {
		this.promOnceavo = promOnceavo;
	}
	/**
	 * @return the notaHistoria
	 */
	public float getNotaHistoria() {
		return notaHistoria;
	}
	/**
	 * @param notaHistoria the notaHistoria to set
	 */
	public void setNotaHistoria(float notaHistoria) {
		this.notaHistoria = notaHistoria;
	}
	
	
	public void calcularPromedio() {
		notaFinal=(promDecimo+promOnceavo)/2;
	}
	
	public float calcularNota() {
		notaFinal=(float)((notaFinal*0.6)+(notaHistoria*0.4));
		return notaFinal;
	}
	
	
	
	

}
