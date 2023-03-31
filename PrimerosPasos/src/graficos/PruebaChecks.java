package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoChecks mimarco = new MarcoChecks();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}


class MarcoChecks extends JFrame{
	
	public MarcoChecks() {
		
		setBounds(550,300,550,350);
		
		setVisible(true);
		
		LaminaCheck milamina = new LaminaCheck();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}


class LaminaCheck extends JPanel{
	
	public LaminaCheck() {

		setLayout(new BorderLayout());
		
		Font miletra = new Font("Serif",Font.PLAIN,24);
		
		texto = new JLabel("en un lugar...");
		
		texto.setFont(miletra);
		
		JPanel laminatexto= new JPanel();
		
		laminatexto.add(texto);
		
		add(laminatexto,BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrilla");
		
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminachecks = new JPanel();
		
		laminachecks.add(check1);
		
		laminachecks.add(check2);
		
		add(laminachecks,BorderLayout.SOUTH);
		
	}
	
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo = 0;
			
			if (check1.isSelected()==true) {
				
				tipo= tipo+1;            //tipo+=Font.BOLD; //1 es para negrilla
			}
			
			if (check2.isSelected()==true) {
				 
				tipo= tipo+2;              //tipo+=Font.ITALIC; //2 es para cursiva
			}
			
			
			texto.setFont(new Font("Serif",tipo,24));
			
			
			
			
			
		}
		
		
	}
	
	
	private JLabel texto;
	private JCheckBox check1,check2;
}