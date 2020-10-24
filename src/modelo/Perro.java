package modelo;

import java.sql.Date;

public class Perro implements Comparable {

	private String nombre;
	private int id;
	private int edad;
	private Date fecha;
	private String raza;


	
	

		
	
	public Perro (String nombre, int id, int edad, Date fecha, String raza) {
		
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.fecha = fecha;
		this.raza = raza;
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}



public int compare(Object perro1, Object perro2) {
		
		Perro perroN1 = (Perro) perro1 ;  Perro perroN2 = (Perro) perro2 ; 
		
		return perroN1.compareTo (perroN2);
	}




@Override
public int compareTo(Object arg0) {
	
	Perro Nuevo = (Perro) arg0;
	
	return this.nombre.compareTo(Nuevo.getNombre());
}


	
} //CLASE
