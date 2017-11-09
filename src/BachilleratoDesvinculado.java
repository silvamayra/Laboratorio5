/**
 * 
 */

/*
 * *Esta clase crea un objeto de tipo desvinculado de bachillerato
 *@Authors: Oliver Graf  17190
 *
 * Mayra Silva 17276
 
 * @File name: BachilleratoDesvinculado.java
 * @Date and Project: laboratorio 5 (8/11/2017)
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
	 * @param tipo
	 */
	public BachilleratoDesvinculado(String nombre, String dpi, float notaFinal, String tipo) {
		super(nombre, dpi, notaFinal, tipo);
	
		// TODO Auto-generated constructor stub
	}

	public void calcularPromedio(float ...list) {
		this.notaFinal=(promDecimo+promOnceavo)/2;
		
	}
	
	public void calcularNota(float ...list) {
		this.notaFinal=(float)((notaFinal*0.4)+(notaHistoria*0.6));
		
	}
	

}
