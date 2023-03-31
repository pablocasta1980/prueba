package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ejemplo_radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio2 mimarco2 = new Marco_radio2();
		
		mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_radio2 extends JFrame{
	
	public Marco_radio2() {
		
		setVisible(true);
		
		setBounds(550,300,500,350);
		
		Lamina_radio2 milamina = new Lamina_radio2();
		
		add(milamina);
		
	}
	
}


class Lamina_radio2 extends JPanel{
	
	public Lamina_radio2() {
		

		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En algun lugar de un gran pais...");
		
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		
		add(texto,BorderLayout.CENTER);
		
		lamina_botones = new JPanel();
		
		migrupo = new ButtonGroup();
		
		colocar_Botones("pequeño",false,10);
		colocar_Botones("mediano",true,12);
		colocar_Botones("grande",false,18);
		colocar_Botones("muy grande",false,26);
		
		add(lamina_botones,BorderLayout.SOUTH);
	
	}
	
	public void colocar_Botones(String nombre,boolean seleccionado,final int tamagno) {
		
		JRadioButton boton =new JRadioButton(nombre,seleccionado);
		
		migrupo.add(boton);
		
		lamina_botones.add(boton);
		
		ActionListener mievento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
				}
			};
		
		
		boton.addActionListener(mievento);
	}
	
	
	private JLabel texto;
	
	private JRadioButton boton1,boton2,boton3,boton4;
	
	private ButtonGroup migrupo;
	
	private JPanel lamina_botones;
	
	
	
}

