package graficos;

import javax.swing.*;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio_sintaxis mimarco = new Marco_radio_sintaxis();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_radio_sintaxis extends JFrame{
	
	public Marco_radio_sintaxis() {
		
		setVisible(true);
		
		setBounds(550,300,500,300);
		
		Lamina_radio_sintaxis milamina = new Lamina_radio_sintaxis();
		
		add(milamina);
		
	}
	
}


class Lamina_radio_sintaxis extends JPanel{
	
	public Lamina_radio_sintaxis() {
		
		
		ButtonGroup migrupo1 = new ButtonGroup();
		
		ButtonGroup migrupo2 = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("azul",false);
		
		JRadioButton boton2 = new JRadioButton("rojo",true);
		
		JRadioButton boton3 = new JRadioButton("verde",false);
		
		JRadioButton boton4 = new JRadioButton("falso",false);
		
		JRadioButton boton5 = new JRadioButton("verdadero",false);
		
		migrupo1.add(boton1);
		
		migrupo1.add(boton2);
		
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		
		migrupo2.add(boton5);
		
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
		add(boton5);
		
	}
	
}