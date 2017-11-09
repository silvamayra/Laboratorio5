import java.util.ArrayList;
/*
 * *Esta clase interactua con el usuario
 *@Authors: Oliver Graf  17190
 *
 * Mayra Silva 17276
 
 * @File name: Main.java
 * @Date and Project: laboratorio 5 (8/11/2017)
 */
import java.util.Arrays;
import java.util.Comparator;

public  class ArrEstudiante extends Estudiante  {
	private ArrayList<Estudiante> arrEstudiantes;
	private float comparador; //Variable a usar en los metodos
	private float result;//variable a usar en los metodos
	
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
	
	
	
	/*
	 * Metodo para determinar si el rendimiento de los estudiantes es mejor que el parametro ingresado
	 * @param: float valor
	 * @return cadena de texto que indica al usuario, si se cumple o no con el parametro ingresado
	 */
	 
	
	 public String verificarRendimientoSecundaria(float valor) {
		 String mensaje="";
		
		for(Estudiante dobby: arrEstudiantes) {
			if(dobby.getTipo().equals("DesvinculadoSec")) {
			this.resultado=resultado + dobby.getNotaFinal();
		}
		this.resultado=(resultado/(arrEstudiantes.size()))*100;
		if(resultado>valor) {
		 mensaje="El rendimiento de los estudiantes es mayor al valor ingresado";
		}
		if(resultado<valor) {
			 mensaje="El rendimiento de los estudiantes es menor al valor ingresado";
		}
		
	}
		return mensaje;
	 }

	/**
	 * Metodo para ordenar el escalafon
	 * @param arrEstudiantes
	 * @return escalafon ordenado
	 */
	
	public String ordenarEscalafon() {
		int tamano=arrEstudiantes.size();
		String cadena="";
		float mayor=arrEstudiantes.get(0).getNotaFinal();
		for(int i=1; i<tamano; i++) {
			if(arrEstudiantes.get(i).getNotaFinal()>mayor) {
				mayor=arrEstudiantes.get(i).getNotaFinal();
				cadena=cadena + "" + arrEstudiantes.get(i).getNombre() +" "+ arrEstudiantes.get(i).getNotaFinal()+"\n";
				arrEstudiantes.remove(i);
		}
			
	}
		return cadena;
	}
	
	
	
	public String verificarRendimientoBach() {
		 String mensaje="";
		
			for(Estudiante snape: arrEstudiantes) {
				if(snape.getTipo().equals("DesvinculadoBach")) {
				this.comparador++;
				if(snape.getNotaFinal()>80) {
					this.result++;
				}	
			}
			}
				this.result=(result*100)/comparador;
				if(result<50) {
					mensaje="El 50% de los aspirantes desvinculados graduados de bachillerato no tienen un promedio de notas superior a 80 puntos";
				}
				if(result>50) {
					mensaje="El 50% de los aspirantes desvinculados graduados de bachillerato tienen un promedio de notas superior a 80 puntos";
				}
				
			return mensaje;
		 }
	
		
	
	
	
}
