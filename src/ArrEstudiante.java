import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public  class ArrEstudiante extends Estudiante  {
	private ArrayList<Estudiante> arrEstudiantes;
	private SecundariaDesvinculado[] listaDesv;
	private float resultado; //variable para manejar en los metodos

	/**
	 * @param arrEstudiantes
	 */
	public ArrEstudiante() {
		super();
		arrEstudiantes=new ArrayList<Estudiante>();
		//SecundariaDesvinculadolistaDesv=new SecundariaDesvinculado;
		
	}

	/**
	 * @return the arrEstudiantes
	 */
	public ArrayList<Estudiante> getArrEstudiantes() {
		return arrEstudiantes;
	}

	/**
	 * @param arrEstudiantes the arrEstudiantes to set
	 */
	public void setArrEstudiantes(ArrayList<Estudiante> arrEstudiantes) {
		this.arrEstudiantes = arrEstudiantes;
	}
	
	
	/**
	 * @return the listaDesv
	 */
	public SecundariaDesvinculado[] getListaDesv() {
		return listaDesv;
	}

	/**
	 * @param listaDesv the listaDesv to set
	 */
	public void setListaDesv(SecundariaDesvinculado[] listaDesv) {
		this.listaDesv = listaDesv;
	}

	/**
	 * @return the resultado
	 */
	public float getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	//Metodo para llenar el arraylist de estudiantes
	public void addEstudiante(Estudiante estu) {
		arrEstudiantes.add(estu);
	}
	
	
	//Metodo para llenar la lista de estudiantes desvinculados de secndaria
	public void addDesvinculado (SecundariaDesvinculado dobby){
		for(int i=0;i<listaDesv.length; i++) {
			this.listaDesv[i]=dobby;
		}
	}
	
	/*
	 * Metodo para determinar si el rendimiento de los estudiantes es mejor que el parametro ingresado
	 * @param: float valor
	 * @return cadena de texto que indica al usuario, si se cumple o no con el parametro ingresado
	 */
	 
	
	 public String verificarRendimientoSecundaria(SecundariaDesvinculado[] listaDesv, float valor) {
		 String mensaje="";
		
		float resultado=0;
		for(int i=0; i<listaDesv.length; i++) {
			this.resultado=resultado + listaDesv[i].getNotaFinal();
		}
		this.resultado=(resultado/(listaDesv.length))*100;
		if(resultado>valor) {
		 mensaje="El rendimiento de los estudiantes es mayor al valor ingresado";
		}
		if(resultado<valor) {
			 mensaje="El rendimiento de los estudiantes es menor al valor ingresado";
		}
		return mensaje;
	}

	/**
	 * Metodo para ordenar el escalafon
	 * @param arrEstudiantes
	 * @return escalafon ordenado
	 */
	
	public String escalafonordenarEscalafon(ArrayList<Estudiante> arrEstudiantes) {
		int tamano=arrEstudiantes.size();
		String cadena="";
		float mayor=arrEstudiantes.get(0).getNotaFinal();
		for(int i=1; i<tamano; i++) {
			if(arrEstudiantes.get(i).getNotaFinal()>mayor) {
				mayor=arrEstudiantes.get(i).getNotaFinal();
				cadena=cadena + "" + arrEstudiantes.get(i).getNombre() +" "+ arrEstudiantes.get(i).getNotaFinal()+"\n";
		}
			
	}
		return cadena;
	}
	
	
	
	
	
		
	
	
	
}
