package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ejemplo_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio mimarco = new Marco_radio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_radio extends JFrame{
	
	public Marco_radio() {
		
		setVisible(true);
		
		setBounds(550,300,500,350);
		
		Lamina_radio milamina = new Lamina_radio();
		
		add(milamina);
		
	}
	
}


class Lamina_radio extends JPanel{
	
	public Lamina_radio() {
		

		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En algun lugar de la mancha de cuyo nombre...");
		
		add(texto,BorderLayout.CENTER);
		
		ButtonGroup migrupo = new ButtonGroup();
		
		boton1 = new JRadioButton("pequeño",false);
		
		boton2 = new JRadioButton("mediano",true);
		
		boton3 = new JRadioButton("grande",false);
		
		boton4 = new JRadioButton("muy grande",false);
		
		JPanel lamina_radio = new JPanel();
		
		Evento_radio mievento = new Evento_radio(); // boton1.addActionListener(new Evento_radio());
		boton1.addActionListener(mievento);
		boton2.addActionListener(mievento);
		boton3.addActionListener(mievento);
		boton4.addActionListener(mievento);
		
		
		
		
		migrupo.add(boton1);
		
		migrupo.add(boton2);
		
		migrupo.add(boton3);
		
		migrupo.add(boton4);
		
		lamina_radio.add(boton1);
		
		lamina_radio.add(boton2);
		
		lamina_radio.add(boton3);
		
		lamina_radio.add(boton4);
		
		add(lamina_radio,BorderLayout.SOUTH);
		
	
	}
	
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==boton1) {
				
				System.out.println("boton 1");
				texto.setFont(new Font("Serif",Font.PLAIN,10));
				
				
				
			}else if(e.getSource()==boton2) {
				
				System.out.println("boton 2");
				texto.setFont(new Font("arial",Font.PLAIN,14));
				
				
			}else if(e.getSource()==boton3) {
				
				System.out.println("boton 3");
				texto.setFont(new Font("times",Font.PLAIN,18));
				
				
			}else if(e.getSource()==boton4) {
				
				System.out.println("boton 4");
				texto.setFont(new Font("Serif",Font.PLAIN,36));
			}
			
		}
		
		
	}
	
	
	
	private JLabel texto;
	
	private JRadioButton boton1,boton2,boton3,boton4;
	
	
	
}


