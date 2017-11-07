/**
 * 
 */

/**
 * @author smayr
 *
 */
public class BachilleratoDesvinculado extends Bachillerato implements NotaEscalafon{

	/**
	 * 
	 */
	public BachilleratoDesvinculado() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param dpi
	 * @param notaFinal
	 * @param promDecimo
	 * @param promOnceavo
	 * @param notaHistoria
	 */
	public BachilleratoDesvinculado(String nombre, String dpi, float notaFinal, float promDecimo, float promOnceavo,
			float notaHistoria) {
		super(nombre, dpi, notaFinal, promDecimo, promOnceavo, notaHistoria);
		// TODO Auto-generated constructor stub
	}
	
	public void calcularPromedio(float ...list) {
		this.notaFinal=(promDecimo+promOnceavo)/2;
		
	}
	
	public void calcularNota(float ...list) {
		this.notaFinal=(float)((notaFinal*0.4)+(notaHistoria*0.6));
		
	}
	

}
