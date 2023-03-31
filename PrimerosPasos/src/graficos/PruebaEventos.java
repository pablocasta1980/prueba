package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoBotones extends JFrame{
	
	
	public MarcoBotones() {
		
		setTitle("Botones y eventos");
		setBounds(700,300,700,500);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		Image miIcono = mipantalla.getImage("imagenes/Logo_Negro.jpg");
		
		setIconImage(miIcono);
		
	}
	
	
}



class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	
	
	
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		botonRojo.addActionListener(this);
		
		botonAmarillo.addActionListener(this);
		
		botonAzul.addActionListener(this);  //this se refiere a que se implemente en LaminaBotones.e esta clase
											//addAction significa al hacer clic
											//botonAzul es quien desencadena la accion
											//this es el objeto oyente
		
		
	}


	public void actionPerformed(ActionEvent e) { //ActionEvent se refiere a eventos del raton
	
		
		
		Object botonPulsado = e.getSource();
		
		if(botonPulsado == botonAzul) {
			
			setBackground(Color.BLUE);
			
		}else if(botonPulsado == botonAmarillo){
			
			setBackground(Color.YELLOW);
			
		}else {
			
			if(botonPulsado == botonRojo) {
				
				setBackground(Color.RED);
			}
		}
		
		
	}
	
}


