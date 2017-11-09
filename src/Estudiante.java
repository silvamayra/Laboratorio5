/**
 * 
 */

/*
 * *Esta clase es la madre que hereda a los demas
 *@Authors: Oliver Graf  17190
 *
 * Mayra Silva 17276
 
 * @File name: Estudiante.java
 * @Date and Project: laboratorio 5 (8/11/2017)
 */
public class Estudiante  {
	protected String nombre;
	protected String dpi;
	protected float notaFinal;
	protected String tipo;
	
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @param nombre
	 * @param dpi
	 * @param notaFinal
	 *
	 */
	public Estudiante(String nombre, String dpi, float notaFinal, String tipo) {
		super();
		this.nombre = nombre;
		this.dpi = dpi;
		this.notaFinal = notaFinal;
		this.tipo=tipo;
		
	}
	
	public Estudiante() {
		
	}
	
}


