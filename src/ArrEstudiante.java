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
	 
	
	
	
		
	
	
	
}
