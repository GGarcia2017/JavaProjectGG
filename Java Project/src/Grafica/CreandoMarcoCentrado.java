package Grafica;

import java.awt.*;
import java.awt.*;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {

		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado () {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tama�oPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tama�oPantalla.height;
		
		int anchoPantalla = tama�oPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle ("Marco Centrado");
		
		Image miIcono = mipantalla.getImage("src/Grafica/Icono.png");
		
		setIconImage(miIcono);
	}
	
}