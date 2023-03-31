package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco = new MarcoConFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("prueba con Fuentes");
		setSize(400,400);
		LaminaConFuentes milamina = new LaminaConFuentes();
		add(milamina);
		
		milamina.setBackground(SystemColor.window);  //relleno de color de las ventanas de windows
		milamina.setForeground(Color.GREEN);
		
		//milamina.setBackground(Color.PINK);  //rellenar la lamina
		
		
	}
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		//g2.setColor(Color.BLUE);
		
		g2.drawString("Pablo", 100, 100);
		
		
		g2.setFont(new Font("Arial",Font.ITALIC,14));
		
		g2.setColor(new Color(100,100,250));
		
		g2.drawString("Curso de java", 150,20);
		
		
		
		
	}
}
