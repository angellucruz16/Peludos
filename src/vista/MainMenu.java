
package vista;


import processing.core.PApplet;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import modelo.Fundacion;
import modelo.Perro;
import processing.core.PImage;
public class MainMenu extends PApplet {	

	// PERROS IMAGES
	PImage FONDO;
	PImage PERRO1;
	PImage PERRO2;
	PImage PERRO3;
	PImage PERRO4;
	PImage PERRO5;
	PImage PERRO6;
	PImage PERRO7;
	PImage PERRO8;
	PImage PERRO9;
	PImage PERRO10;
	
	boolean imagen = false;
	
	private Fundacion fundacion;



	public static void main(String[] args) {

		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);

	} // MAIN


	public void settings () {
		size (1980, 1080); //PROFE AGRANDA  LA PANTALLA
                     
		
	} // SETTINGS	

	public void setup () {
		
		FONDO = loadImage ("imagenes/FONDO.png");
		PERRO1 = loadImage ("imagenes/PERRO1.png");
		PERRO2 = loadImage ("imagenes/PERRO2.png");
		PERRO3 = loadImage ("imagenes/PERRO3.png");
		PERRO4 = loadImage ("imagenes/PERRO4.png");
		PERRO5 = loadImage ("imagenes/PERRO5.png");
		PERRO6 = loadImage ("imagenes/PERRO6.png");
		PERRO7 = loadImage ("imagenes/PERRO7.png");
		PERRO8 = loadImage ("imagenes/PERRO8.png");
		PERRO9 = loadImage ("imagenes/PERRO9.png");
		PERRO10 = loadImage ("imagenes/PERRO10.png");
		
	}//SETUP
	
public void draw () {
	
	background(255);
	mousePressed ();
	image (FONDO, 0,0);
} //DRAW

public void mousePressed () {

	println (mouseX, mouseY);

	
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 92 && mouseY < 92 + 70) { //BOTON NOMBRE
			
			
			image (PERRO4, 425,93);
			image (PERRO1, 699,93);
			image (PERRO5, 970,93);
			image (PERRO10, 1252,93);
			image (PERRO3, 1531,93);
	
			image (PERRO7, 425,600);
			image (PERRO2, 699,600);
			image (PERRO8, 970,600);
			image (PERRO6, 1252,600);
			image (PERRO9, 1534,600);
		}
	
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 195 && mouseY < 195 + 60) {  //BOTON RAZA
			
			image (PERRO7, 425,93);
			image (PERRO9, 699,93);
			image (PERRO8, 970,93);
			image (PERRO3, 1252,93);
			image (PERRO10, 1531,93);
	
			image (PERRO2, 425,600);
			image (PERRO5, 699,600);
			image (PERRO4, 970,600);
			image (PERRO1, 1252,600);
			image (PERRO6, 1534,600);
		}
		
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 296 && mouseY < 296 + 60) { //BOTON ID
			
	
			imagen = true;	
			
			if (imagen == true) { 
			
				image (PERRO1, 425,93);
				image (PERRO2, 699,93);
				image (PERRO3, 970,93);
				image (PERRO4, 1252,93);
				image (PERRO5, 1531,93);
		
				image (PERRO6, 425,600);
				image (PERRO7, 699,600);
				image (PERRO8, 970,600);
				image (PERRO9, 1252,600);
				image (PERRO10, 1534,600);
	
		} // IF
		} //IF BOTON
		
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 398 && mouseY < 398 + 60) { // BOTON EDAD
		
			image (PERRO9, 425,93);
			image (PERRO5, 699,93);
			image (PERRO8, 970,93);
			image (PERRO2, 1252,93);
			image (PERRO7, 1531,93);
	
			image (PERRO4, 425,600);
			image (PERRO10, 699,600);
			image (PERRO6, 970,600);
			image (PERRO1, 1252,600);
			image (PERRO3, 1534,600);
			
		}
		
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 499 && mouseY < 499 + 60) { // BOTON NACIMIENTO
			
			image (PERRO9, 425,93);
			image (PERRO5, 699,93);
			image (PERRO8, 970,93);
			image (PERRO2, 1252,93);
			image (PERRO7, 1531,93);
	
			image (PERRO4, 425,600);
			image (PERRO10, 699,600);
			image (PERRO6, 970,600);
			image (PERRO1, 1252,600);
			image (PERRO3, 1534,600);
			
		}
		
}//MOUSEPRESSED

	}// MAINMENU
