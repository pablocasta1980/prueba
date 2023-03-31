package graficos;

import javax.swing.*;

import java.awt.event.*;

public class Tipos_Cuadros_Dialogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadro_Dialogos mimarco = new Cuadro_Dialogos();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}


class Cuadro_Dialogos extends JFrame{
	
	public Cuadro_Dialogos() {
		
		setBounds(500,300,400,250);
		
		add(new Lamina_Cuadros_Dialogos());
		
	}
	
}


class Lamina_Cuadros_Dialogos extends JPanel{
	
	public Lamina_Cuadros_Dialogos() {
		
		boton1 = new JButton("boton 1");
		
		boton2 = new JButton("boton 2");
		
		boton3 = new JButton("boton 3");
		
		boton4 = new JButton("boton 4");
		
		boton1.addActionListener(new Accion_Botones());
		boton2.addActionListener(new Accion_Botones());
		boton3.addActionListener(new Accion_Botones());
		boton4.addActionListener(new Accion_Botones());
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
	}
	
	private class Accion_Botones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==boton1) {
				
				System.out.println("has pulsado el boton 1");
				
				//JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "mensaje prueba");
				
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "mensaje prueba","Advertencia",3);
				
			}else if(e.getSource()==boton2) {
				
				System.out.println("has pulsado el boton 2");
				
				//JOptionPane.showInputDialog("Introduce nombre");
				
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this,"Introduce tu nombre","Introduccion Datos",2);
				
				
				
			}else if(e.getSource()==boton3) {
				
				System.out.println("has pulsado el boton 3");
				
				JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this,"Elige Opcion","V Confirmar", 1);
				
				
			}else  {
				
				System.out.println("has pulsado el boton 4");
				
				JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this,"elige","V de opciones",1, 1, null,null,null);
				
				
			}
			
		}
		
		
		
	}
	
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
}

