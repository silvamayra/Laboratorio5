import java.util.ArrayList;
/*
 * *Esta clase crea un arraylist paramanejar los datos
 *@Authors: Oliver Graf  17190
 *
 * Mayra Silva 17276
 
 * @File name: Main.java
 * @Date and Project: laboratorio 5 (8/11/2017)
 */

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
public class DbConnection {
	MongoClient mongo;
	MongoDatabase database;
	MongoCollection<Document> estudiantes;
	public DbConnection() {
		try {
			mongo = new MongoClient( "localhost" , 27017 );
			database = mongo.getDatabase("MinEdu");
			estudiantes = database.getCollection("Estudiantes");
			System.out.println("Conexion establecida");
		}catch(Exception e) {
			System.out.println("Error en la conexion");
		}
			
	}
	//Metodo para a�adir a un estudiante a la base de datos de mongo
	public void addListEstudiante(ArrayList<Estudiante> estudiantes){
		for(Estudiante es: estudiantes) {
			Document estudiante = new Document("title", "MongoDB") 
				      .append("id", es.dpi)
				      .append("nombre", es.nombre) 
				      .append("nota_final", es.notaFinal) 
				      .append("by", "tutorials point");  
			this.estudiantes.insertOne(estudiante); 
		}
		
	}
	
	public void addEstudiante(Estudiante estudiante){
		
		Document es = new Document("title", "MongoDB") 
			      .append("id", estudiante.dpi)
			      .append("nombre", estudiante.nombre) 
			      .append("nota_final", estudiante.notaFinal) 
			      .append("by", "tutorials point");  
		this.estudiantes.insertOne(es); 
	
		
	}
	

	
	

}
