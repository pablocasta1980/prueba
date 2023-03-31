package graficos;

import java.awt.Font;

import javax.swing.*;

public class MarcoSlider_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame_Slider1 mimarco= new Frame_Slider1();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}


class Frame_Slider1 extends JFrame{
	
	public Frame_Slider1() {
		
		setBounds(550,400,550,350);
		
		Lamina_Slider1 milamina = new Lamina_Slider1();
		
		add(milamina);
		
		setVisible(true);
		
	}
}



class Lamina_Slider1 extends JPanel{
	
	public Lamina_Slider1() {
		
		JSlider control = new JSlider(0,100,50);  //(SwingConstants.VERTICAL
		
		//control.setOrientation(SwingConstants.VERTICAL);
		
		control.setMajorTickSpacing(50);
		
		control.setMinorTickSpacing(25);
		
		control.setPaintTicks(true);
		
		control.setFont(new Font("Serif",Font.ITALIC,12));
		
		control.setPaintLabels(true);
		
		control.setSnapToTicks(true);
		
		add(control);
		
	}
}
