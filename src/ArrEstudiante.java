import java.util.ArrayList;

public class ArrEstudiante {
	private ArrayList<Estudiante> arrEstudiantes;

	/**
	 * @param arrEstudiantes
	 */
	public ArrEstudiante() {
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
	public void addEstudiante() {
		Estudiante nuevo=new Estudiante();
		arrEstudiantes.add(nuevo);
	}
	
	public int compareTo(Object other) {
		
		
		
	}
	
	
		
	
	
	
}
