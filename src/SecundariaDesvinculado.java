/**
 * 
 */

/**
 * @author smayr
 *
 */
public class SecundariaDesvinculado extends Secundaria implements NotaEscalafon {
	private float notaAptitud;

	/**
	 * 
	 */
	public SecundariaDesvinculado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param dpi
	 * @param notaFinal
	 * @param promSeptimo
	 * @param promOctavo
	 * @param promNoveno
	 * @param notaMate
	 * @param notaHistoria
	 * @param notaEspanol
	 */
	public SecundariaDesvinculado(String nombre, String dpi, float notaFinal, float promSeptimo, float promOctavo,
			float promNoveno, float notaMate, float notaHistoria, float notaEspanol, float notaAptitud) {
		super(nombre, dpi, notaFinal, promSeptimo, promOctavo, promNoveno, notaMate, notaHistoria, notaEspanol);
		this.notaAptitud=notaAptitud;
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
	 * @return the notaAptitud
	 */
	public float getNotaAptitud() {
		return notaAptitud;
	}

	/**
	 * @param notaAptitud the notaAptitud to set
	 */
	public void setNotaAptitud(float notaAptitud) {
		this.notaAptitud = notaAptitud;
	}
	
	public void calcularPromedio(float promSeptimo, float promOctavo, float promNoveno) {
		this.notaFinal=(promSeptimo+promOctavo+ promNoveno)/2;
	}
	
	public void calcularNota(float notaMate, float notaEspanol, float notaHistoria, float notaAptitud) {
		this.notaFinal=(float)(((notaFinal*0.4)+(((notaMate+notaEspanol+notaHistoria)/3)*0.6)+notaAptitud)/2);
		
	}
	
	
	
	
	

}
