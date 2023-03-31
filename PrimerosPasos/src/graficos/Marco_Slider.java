package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;


public class Marco_Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame_Slider mimarco = new Frame_Slider();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Frame_Slider extends JFrame{
	
	
	public Frame_Slider() {
		
		
		setBounds(550,400,550,350);
		
		Lamina_Slider milamina = new Lamina_Slider();
		
		add(milamina);
		
		setVisible(true);
	}
	
	
	
}



class Lamina_Slider extends JPanel{
	
	
	public Lamina_Slider() {
		
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de la mancha");
		
		add(rotulo,BorderLayout.CENTER);
		
		control = new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif",Font.ITALIC,10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaSlider = new JPanel();
		
		laminaSlider.add(control);
		
		add(laminaSlider,BorderLayout.NORTH);
		
		
		
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//contador++;
			
			//System.out.println("delizante: " + control.getValue());
			
			rotulo.setFont(new Font("Serif",Font.PLAIN,control.getValue()));
			
		}
		
		
	}
	
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int contador;
	
}
