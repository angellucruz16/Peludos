package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.Comparator;

public class Fundacion implements Comparator {



	private Perro [] perros;
	private int [] idUno;
	private int [] idDos;
	private String [] raza;
	private String [] nombreFinal;
	private int [] edadFinal;
	private Date[] fecha;
	private int [] idFinal;
	private String [] razaFinal;
	private Date[] fechaFinal;



	public Fundacion () {

		perros = new Perro [10];
		idUno = new int [10];
		idDos = new int [10];
		raza = new String [10];
		nombreFinal = new String [10];
		edadFinal = new int [10];
		fecha  = new Date [10];
		idFinal = new int [10];
		razaFinal = new String [10];
		fechaFinal = new Date [10];

		read (); 
		organizador ();



		for (int i = 0; i < perros.length; i++) {

			perros [i] = new Perro  (nombreFinal [i] ,idFinal [i], edadFinal [i], fechaFinal[i], razaFinal [i]);
		}

	}	//FUNDACION

	public void read () {

		try {

			FileReader filereaderUno =new FileReader("data/datosUno.txt");    
			FileReader filereaderDos =new FileReader("data/datosDos.txt");  

			BufferedReader bufferedreaderUno = new BufferedReader(filereaderUno);
			BufferedReader bufferedreaderDos = new BufferedReader(filereaderDos);

			String lineUno = bufferedreaderUno.readLine();
			String lineDos = bufferedreaderDos.readLine();

			int i=0;

			while (lineUno != null && lineDos != null) {

				String [] atributosUno = lineUno.split(",");
				String [] atributosDos = lineDos.split(",");

				int idUno = Integer.parseInt(atributosUno [0]);
				String nombre = atributosUno [1];
				int edad = Integer.parseInt  (atributosUno [2]);

				this.idUno [i] = idUno;

				int idDos = Integer.parseInt(atributosDos [0]);


				String raza = atributosDos [2];
				String fecha = atributosDos [3];

				this.idDos [i] = idDos;

				lineUno=bufferedreaderUno.readLine();
				lineDos=bufferedreaderDos.readLine();
				i++;

			} //WHILE
		} 
		catch (Exception e) {


		} //CATCH

	} //READ

	public void organizador () {

		for (int i=0; i< idUno.length; i++) {
			for ( int j=0; j< idUno.length; j++) {

				if (idUno [i] == idDos [j] ) {
					idFinal [i] = idUno [i] ;

					razaFinal [i] = raza [j];
					fechaFinal [i] = fecha [j];

				} //IF
			} //FOR
		}//FOR

	}//ORGANIZADOR

	public int[] OrganizarIdNaturalPorIncercion () throws FileNotFoundException, UnsupportedEncodingException {

		int current;
		int i;

		for (int j = 1; j < idFinal.length; j++) {
			current = idFinal [j]; 
			i = j-1;
			while ( i > -1 && idFinal [i] > current) {

				idFinal [1+i] = idFinal [i];
				i--;
				
			}	//WHILE
			
			idFinal [1+i] = current;
			
		} //FOR
		
			PrintWriter writer = new PrintWriter ("Id Organizado", "UTF-8" ); //UTF SIRVE COMO CODIFICADOR
			writer.println(idFinal);
			
			return idFinal;
			
	}//	ORGANIZAR ID NATURAL
		
		public void OrganizarEdadNaturalPorIncercion () {

		int current;
		int i;

		for (int j = 1; j < edadFinal.length; j++) {
			current = edadFinal [j]; 
			i = j-1;
			while ( i > -1 && edadFinal [i] > current) {

				edadFinal [1+i] = edadFinal [i];
				i--;
				
			}	//WHILE
			
			edadFinal [1+i] = current;
			
		} //FOR
		
	} //ORGANIZAR EDAD NATURAL
		
		
		
		
	@Override

	public int compare(Object perro1, Object perro2) {
		
		Perro perroN1 = (Perro) perro1 ;  Perro perroN2 = (Perro) perro2 ; 
		
		return perroN1.compareTo (perroN2);
	} //compare
	
	public void OrganizarNombreNaturalPorIncercion () throws FileNotFoundException, UnsupportedEncodingException {
		
			String current;
			int i;

			for (int j = 1; j < nombreFinal.length; j++) {
				current = nombreFinal [j]; 
				i = j-1;
				while ( i > -1 && nombreFinal [i].compareTo(current) > 0) {

					nombreFinal [1+i] = nombreFinal [i];
					i--;
					
				}	//WHILE
				
				nombreFinal [1+i] = current;
				
			} //FOR
			
			PrintWriter writer = new PrintWriter ("Nombre Organizado", "UTF-8" ); //UTF SIRVE COMO CODIFICADOR
			writer.println(nombreFinal);
			
	} //ORGANIZAR NOMBRE NATURAL
	
	public void OrganizarRazaNaturalPorIncercion () throws FileNotFoundException, UnsupportedEncodingException {
		
		String current;
		int i;

		for (int j = 1; j < razaFinal.length; j++) {
			current = razaFinal [j]; 
			i = j-1;
			while ( i > -1 && razaFinal [i].compareTo(current) > 0) {

				razaFinal [1+i] = razaFinal [i];
				i--;
				
			}	//WHILE
			
			razaFinal [1+i] = current;
			
		} //FOR
		
		PrintWriter writer = new PrintWriter ("Raza Organizado", "UTF-8" ); //UTF SIRVE COMO CODIFICADOR
		writer.println(razaFinal);
		
	}////ORGANIZAR RAZA NATURAL
	
	public void OrganizarFechaNaturalPorIncercion () throws FileNotFoundException, UnsupportedEncodingException {
		
		Date current;
		int i;

		for (int j = 1; j < fechaFinal.length; j++) {
			current = fechaFinal [j]; 
			i = j-1;
			while ( i > -1 && fechaFinal [i].compareTo(current) > 0) {

				fechaFinal [1+i] = fechaFinal [i];
				i--;
				
			}	//WHILE
			
			fechaFinal [1+i] = current;
			
		} //FOR
		
		PrintWriter writer = new PrintWriter ("Fecha Organizado", "UTF-8" ); //UTF SIRVE COMO CODIFICADOR
		writer.println(fechaFinal);
		
	} //ORGANIZAR FECHA NATURAL

} //CLASS
