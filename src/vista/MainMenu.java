
package vista;


import processing.core.PApplet;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import modelo.Fundacion;
import modelo.Perro;
import processing.core.PImage;
public class MainMenu extends PApplet {	

	// MENU IMAGES
	PImage FONDO;
	PImage P1;
	PImage P2;
	PImage P3;
	PImage P4;
	PImage P5;
	PImage P6;
	PImage P7;
	PImage P8;
	PImage P9;
	PImage P10;

	private Fundacion fundacion;



	public static void main(String[] args) {

		String[] processingArgs = {"MainMenu"};
		MainMenu mySketch = new MainMenu();
		PApplet.runSketch(processingArgs, mySketch);

	} // MAIN


	public void settings () {
		size (1920, 1080);
                     
		
	} // SETTINGS	

	public void setup () {
		
		FONDO = loadImage ("imagenes/FONDO.png");
		P1 = loadImage ("imagenes/P1.png");
		P2 = loadImage ("imagenes/P2.png");
		P3 = loadImage ("imagenes/P3.png");
		P4 = loadImage ("imagenes/P4.png");
		P5 = loadImage ("imagenes/P5.png");
		P6 = loadImage ("imagenes/P6.png");
		P7 = loadImage ("imagenes/P7.png");
		P8 = loadImage ("imagenes/P8.png");
		P9 = loadImage ("imagenes/P9.png");
		P10 = loadImage ("imagenes/P10.png");
		
	}//SETUP
	
public void draw () {
	
	background (0);
	
	image (FONDO, 0,0);
	
	
} //DRAW

public void mousePressed () {

	println (mouseX, mouseY);

	
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 92 && mouseY < 92 + 70) { //BOTON NOMBRE
			
			try {
				fundacion.OrganizarNombreNaturalPorIncercion();
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 195 && mouseY < 195 + 60) {  //BOTON RAZA
			
			try {
				fundacion.OrganizarRazaNaturalPorIncercion();
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 296 && mouseY < 296 + 60) { //BOTON ID
			
			try {
				fundacion.OrganizarIdNaturalPorIncercion();
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 398 && mouseY < 398 + 60) { // BOTON EDAD
		
			fundacion.OrganizarEdadNaturalPorIncercion();
			
		}
		
		if (mouseX > 91 && mouseX < 91 + 241
				&& mouseY > 499 && mouseY < 499 + 60) { // BOTON NACIMIENTO
			
			try {
				fundacion.OrganizarFechaNaturalPorIncercion();
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}//MOUSEPRESSED

	}// MAINMENU
