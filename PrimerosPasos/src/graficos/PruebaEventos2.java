package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones2 mimarco = new MarcoBotones2();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoBotones2 extends JFrame{
	
	
	public MarcoBotones2() {
		
		setTitle("Botones y eventos");
		setBounds(700,300,500,300);
		LaminaBotones2 milamina = new LaminaBotones2();
		add(milamina);
		
	}
	
	
}



class LaminaBotones2 extends JPanel {
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones2() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		botonRojo.addActionListener(Rojo);
		
		botonAmarillo.addActionListener(Amarillo);
		
		botonAzul.addActionListener(Azul);  
	}
	
	
	
	private class ColorFondo implements ActionListener{ //como va a ser nuestrea clase oyente implementa ActionListener
		//se implementa como clase interna
		
		public ColorFondo(Color c) {
			
			colorDeFondo = c;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
		
	}

	
}








