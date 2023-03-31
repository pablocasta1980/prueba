package graficos;


import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco = new MarcoConTexto ();
		
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		setSize(650,450);
		setLocation(400,200);
		setTitle("primerTexto");
		Lamina miLamina = new Lamina();
		add(miLamina);
		
	}
}
	
class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);  //se debe llamar al constructor para ejercicios mas complejos
		g.drawString("estamos aprendiendo", 4, 9); //texto mas posicion
		
	}
}
	
