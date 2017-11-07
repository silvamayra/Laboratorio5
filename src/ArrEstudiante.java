import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public  class ArrEstudiante extends Estudiante implements Comparator {
	private ArrayList<Estudiante> arrEstudiantes;

	/**
	 * @param arrEstudiantes
	 */
	public ArrEstudiante() {
		super();
		arrEstudiantes=new ArrayList<Estudiante>();
		
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
	
	//Metodo para llenar el arraylist de estudiantes
	public void addEstudiante(Estudiante estu) {
		Estudiante nuevo=new Estudiante();
		arrEstudiantes.add(nuevo);
	}
	
	//Metodo para comprar la nota de los dos objetos
	/**
	 * 
	 * @param dobby
	 * @param snape
	 * @return 0 si son iguales, 1 segundo, -1 si el primero es menor que el segundo 
	 */
	
	public int compare(Estudiante dobby, Estudiante snape) {
		if(dobby.getNotaFinal()==snape.getNotaFinal()) {
			return 0;
		}
		else if (dobby.getNotaFinal()>dobby.notaFinal) {
			return 1;
		}
		else {
			return-1;
	}
		
		
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	
	 public String verificarRendimientoSecundaria(float valor) {
		 String mensaje="";
		int inicio=0;
		float contador=0;
		float resultado=0;
		SecundariaDesvinculado listaSec[];
		for(SecundariaDesvinculado nuevo: arrEstudiantes) {
			listaSec[inicio]=nuevo;
			resultado=resultado + listaSec[inicio].getNotaFinal();
			inicio ++;
		}
		resultado=resultado/(listaSec.length);
		if(resultado>valor) {
		return mensaje="El rendimiento de los estudiantes es mayor al valor ingresado";
		}
		if(resultado<valor) {
			return mensaje="El rendimiento de los estudiantes es menor al valor ingresado";
		}
	}

	/**
	 * 
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
				cadena=cadena + "" + arrEstudiantes.get(i).getNombre() + arrEstudiantes.get(i).getNotaFinal();
		}
			
	}
		return cadena;
	}
	
	
	
		
	
	
	
}
