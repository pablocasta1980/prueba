package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Foco mimarco = new Marco_Foco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco_Foco extends JFrame{
	
	public Marco_Foco() {
		
		setTitle("marco foco");
		setBounds(300,300,600,450);
		setVisible(true);
		
		add(new Lamina_Foco());
		
		
	}
}


class Lamina_Foco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);	
		
		cuadro10 = new JTextField();
		
		cuadro20 = new JTextField();
		
		cuadro10.setBounds(120, 10, 150, 20);
		
		cuadro20.setBounds(120, 50, 150, 20);
		
		add(cuadro10);
		add(cuadro20);
		
		LanzaFocos elFoco = new LanzaFocos();
		cuadro10.addFocusListener(elFoco);
		
		
		
	}
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("en foco...");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("no en foco...");
		}
		
		
	}
	
	JTextField cuadro10;
	JTextField cuadro20;
	
	
}





