/**
 * 
 */
/*
 * *Esta clase crea un objeto de tipo estudiante de bachillerato
 *@Authors: Oliver Graf  17190
 *
 * Mayra Silva 17276
 
 * @File name: Bachillerato.java
 * @Date and Project: laboratorio 5 (8/11/2017)
 */
public class Secundaria extends Estudiante implements NotaEscalafon{
	protected float promSeptimo;
	protected float promOctavo;
	protected float promNoveno;
	protected float notaMate;
	protected float notaHistoria;
	protected float notaEspanol;
	
	
	
	
	

	/**
	 * 
	 */
	public Secundaria() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nombre
	 * @param dpi
	 * @param notaFinal
	 * @param tipo
	 */
	public Secundaria(String nombre, String dpi, float notaFinal, String tipo) {
		super(nombre, dpi, notaFinal, tipo);
		
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the promSeptimo
	 */
	public float getPromSeptimo() {
		return promSeptimo;
	}


	/**
	 * @param promSeptimo the promSeptimo to set
	 */
	public void setPromSeptimo(float promSeptimo) {
		this.promSeptimo = promSeptimo;
	}


	/**
	 * @return the promOctavo
	 */
	public float getPromOctavo() {
		return promOctavo;
	}


	/**
	 * @param promOctavo the promOctavo to set
	 */
	public void setPromOctavo(float promOctavo) {
		this.promOctavo = promOctavo;
	}


	/**
	 * @return the promNoveno
	 */
	public float getPromNoveno() {
		return promNoveno;
	}


	/**
	 * @param promNoveno the promNoveno to set
	 */
	public void setPromNoveno(float promNoveno) {
		this.promNoveno = promNoveno;
	}


	/**
	 * @return the notaMate
	 */
	public float getNotaMate() {
		return notaMate;
	}


	/**
	 * @param notaMate the notaMate to set
	 */
	public void setNotaMate(float notaMate) {
		this.notaMate = notaMate;
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


	/**
	 * @return the notaEspanol
	 */
	public float getNotaEspanol() {
		return notaEspanol;
	}


	/**
	 * @param notaEspanol the notaEspanol to set
	 */
	public void setNotaEspanol(float notaEspanol) {
		this.notaEspanol = notaEspanol;
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
	
	public void calcularPromedio(float ...list) {
		this.notaFinal=(promSeptimo+promOctavo+promNoveno)/3;
		
	}
	
	public void calcularNota(float...list) {
		this.notaFinal=(float) ((notaFinal*0.6)+(((notaMate+notaHistoria+notaEspanol)/3)*0.4));
		
	}
	
}
	
	
	


