package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco = new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("prueba de colores");
		setSize(400,400);
		LaminaConColor milamina = new LaminaConColor();
		add(milamina);
		
		milamina.setBackground(SystemColor.window);  //relleno de color de las ventanas de windows
		
		//milamina.setBackground(Color.PINK);  //rellenar la lamina
		
		
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200, 150);
		
		g2.setPaint(Color.BLACK);  //pinto contorno de cuadro
		
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		//g2.setPaint(Color.BLACK);  //selecciono color
		g2.setPaint(new Color(110,140,100).darker()); //seleccion de colores RGB //brighter()
		
		elipse.setFrame(rectangulo);//creo la figura
		
		//Color micolor=new Color(128,250,123);
		//g2.setPaint(micolor)      //otro metodo de crear colores
		
		g2.fill(elipse); //relleno
		
		
		
		
	}
}

