package graficos;

import java.awt.event.*;

import javax.swing.*;


public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(100,200, 500, 350);
		

		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(700,200, 500, 350);

	}

}


class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		//setBounds(300,300,500,350);
		setVisible(true);
		
		/*M_Ventana oyente_ventana= new M_Ventana();   //una opcion llamar al oyente
		addWindowListener(oyente_ventana);
		*/
		
		addWindowListener(new M_Ventana());				//segunda opcion de llamar al oyente
		
	}
	
	
}


class M_Ventana extends WindowAdapter{              //class M_Ventana implements WindowListener{
													//de esta forma se deben implementar todos los metodos
	
	
	
													//class M_Ventana extends WindowAdapter{ 
													//con esta puedo utilizar solo los metodos que necesito
	
	/*public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");       //metodo eliminado de y no muestra error
		
	}*/

	public void windowClosing(WindowEvent e) {
		
		System.out.println("Ventana cerrando");
		
	}

	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
	}

	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana Minimizada");
		
	}

	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
		
	}

	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activa");
		
	}

	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana Desactivada");
		
	}
	
	
	
}







