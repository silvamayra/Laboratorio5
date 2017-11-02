/**
 * 
 */

/**
 * @author Mayra Silva 17276
 * Oliver Graf 17190
 *
 */
public class Estudiante {
	protected String nombre;
	protected String dpi;
	protected float notaFinal;
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
	
	/**Constructor
	 * @param nombre
	 * @param dpi
	 * @param notaFinal
	 */
	public Estudiante(String nombre, String dpi, float notaFinal) {
		super();
		this.nombre = nombre;
		this.dpi = dpi;
		this.notaFinal = notaFinal;
	}
	public Estudiante() {
	}
	
	}


