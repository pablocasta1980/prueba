package graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

import javax.swing.*;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setVisible(true);;
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("imagenes/Logo_Negro.jpg");
		setIconImage(miIcono);
		
		
		setTitle("Marco con Imagen");
		setBounds(350,10,650,650);
		
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
	}
	
}

class LaminaConImagen extends JPanel{
	
	File miimagen = new File("imagenes/negrita.gif");
	
	public LaminaConImagen() {
		
		try {
			imagen = ImageIO.read(miimagen);		// (new File("Imagenes/Logo Berhlan corazon.jpeg")); //opcion
			
			}
			catch(IOException e) {
				System.out.println("la imagen no se encuentra");
			}
		
	}
	
	
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		
		
		int anchuraImagen = imagen.getWidth(this);   // this el objeto que espera "LaminaConImagen"
		
		int alturaImagen = imagen.getHeight(this);    // this el objeto que espera "LaminaConImagen"
		
		System.out.println(anchuraImagen);
		System.out.println(alturaImagen);
		
		
		g.drawImage(imagen, 0,0, null);
		
		
		for(int i=0;i<=650;i++) {
			
			for(int j=0;j<=650;j++) {
				
				if(i+j>0) {
				
				//g.copyArea(0, 0, 130, 130, i*130, j*130); //una opcion
				
				g.copyArea(0, 0, anchuraImagen, alturaImagen, i*anchuraImagen, j*alturaImagen);//otra opcion
				}
			}
		}
		
		
		
		
		
		
	}
	
	
	
private Image imagen;

	
	
}