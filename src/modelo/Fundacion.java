package modelo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Fundacion {

	private Perro [] perro;
	private int [] idUno;
	private int [] idDos;
	private String [] raza;
	private String [] nombreFinal;
	private int [] edadFinal;
	private String [] fecha;
	private int [] idFinal;
	private String [] razaFinal;
	private String [] fechaFinal;
	
	
	
	
	
	public Fundacion () {

		idUno = new int [10];
		idDos = new int [10];
		raza = new String [10];
		nombreFinal = new String [10];
		edadFinal = new String [10];
		fecha = new String [10];
		idFinal = new String [10];
		razaFinal = new String [10];
		fechaFinal = new String [10];
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

				line=bufferedreader.readLine();

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
					fechaFinal [i] = fecha [i];
					
				} //IF
			} //FOR
		}//FOR

	}//ORGANIZADOR

} //CLASS
