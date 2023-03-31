package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class CalculadoraMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadoras mimarco = new MarcoCalculadoras();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}


class MarcoCalculadoras extends JFrame{
	
	public MarcoCalculadoras() {
		
		setTitle("Calculadoras");
		
		setBounds(500,300,450,300);
		
		LaminaCalculadoras milamina2 = new LaminaCalculadoras();
		
		add(milamina2);
		
	}
	
	
}


class LaminaCalculadoras extends JPanel{
	
	public LaminaCalculadoras() {
		
		setLayout(new BorderLayout());
		
		JButton pantalla = new JButton("1");
		
		pantalla.setEnabled(false);
		
		add(pantalla,BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4,4));
		
		ponerBoton1("7");
		ponerBoton1("8");
		ponerBoton1("9");
		ponerBoton1("/");
		
		ponerBoton1("4");
		ponerBoton1("5");
		ponerBoton1("6");
		ponerBoton1("*");
		
		ponerBoton1("4");
		ponerBoton1("4");
		ponerBoton1("4");
		ponerBoton1("4");
		
		ponerBoton1("4");
		ponerBoton1("4");
		ponerBoton1("4");
		ponerBoton1("4");
		
		/*JButton  boton1 = new JButton("1");
		
		milamina2.add(boton1);
		
		JButton  boton2 = new JButton("2");
		
		milamina2.add(boton2);*/  //agregar botones a pedal
		
		
		
		add(milamina2,BorderLayout.CENTER);
		
		
	}
	
	private void ponerBoton1(String rotulo) {
		
		JButton boton = new JButton(rotulo);
		
		milamina2.add(boton);
	}
	
	private JPanel milamina2 = new JPanel();
}
