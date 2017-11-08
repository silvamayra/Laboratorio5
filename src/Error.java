/**
 * 
 */
//Esta es una clase, que contiene los metodos para la validación de errores, en vista de que si se colocaban en el main éste tendría muchos métodos. 
//este es un cambio, en vista de que no quería poner mi main muy cargado
/**
 * @author smayr 17276
 *Project: laboratorio 5
 */
public class Error {
	private String cadena;
	private boolean error1;
	
	public Error() {
		this.cadena=cadena;
		this.error1=error1;
	}
	

	
	
	/**
	 * @return the cadena
	 */
	public String getCadena() {
		return cadena;
	}



	/**
	 * @param cadena the cadena to set
	 */
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}



	/**
	 * @return the error1
	 */
	public boolean isError1() {
		return error1;
	}


	/**
	 * @param error1 the error1 to set
	 */
	public void setError1(boolean error1) {
		this.error1 = error1;
	}





	///este metodo verifica que el dato ingresado se uno de tipo string
		//@param cadena

	public boolean verificarString (String cadena) {
	//En este ciclo se realiza la primera verificacion de datos, donde si el usuario ingresa un int le solicitara que ingrese un string.
	if (!cadena.equals("")) {
		try {
			Integer.parseInt(cadena);
			error1=false;
		} catch (NumberFormatException nfe) {
			error1=true;
		}
		
	}
	return error1;
	}
	
	//este metodo verifica que el dato ingreado sea uno de tipo int
		//@param numero
		public boolean verificarInt(String cadena) {
			if (!cadena.equals("")) {
			try {
				Integer.parseInt(cadena);
				error1=true;
				
				
			} catch (NumberFormatException nfe) {
				error1=false;
			}
		}
		return error1;
		}
	

}
