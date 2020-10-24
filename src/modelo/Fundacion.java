package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;

public class Fundacion implements Comparator {

	

	private Perro [] perros;
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

		perros = new Perro [10];
		idUno = new int [10];
		idDos = new int [10];
		raza = new String [10];
		nombreFinal = new String [10];
		edadFinal = new int [10];
		fecha = new String [10];
		idFinal = new int [10];
		razaFinal = new String [10];
		fechaFinal = new String [10];

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
					fechaFinal [i] = fecha [i];

				} //IF
			} //FOR
		}//FOR

	}//ORGANIZADOR

	public void OrganizarIdNatural () {

		

	} //ORGANIZARIDNATURAL
	@Override
	
	public int compare(Object perro1, Object perro2) {
		return ((Perro) perro1).getId() - (((Perro) perro2).getId());
	}

	public int compareNombre(Object perro1, Object perro2) {
		return ((Perro) perro1).getId() - (((Perro) perro2).getId());
	}
	
	public int compareRaza(Object perro1, Object perro2) {
		return ((Perro) perro1).getId() - (((Perro) perro2).getId());
	}
	
	public int compareEdad(Object perro1, Object perro2) {
		return ((Perro) perro1).getId() - (((Perro) perro2).getId());
	}
	
	public int compareFecha(Object perro1, Object perro2) {
		return ((Perro) perro1).getId() - (((Perro) perro2).getId());
	}
	



} //CLASS
