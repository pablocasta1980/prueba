package graficos;

import java.awt.Frame;
import java.awt.event.*;

import javax.swing.*;


public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				

	}

}


class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setBounds(300,300,500,350);
		setVisible(true);
		setTitle("Marco");
		
		CambiaEstado nuevo_estado = new CambiaEstado();
		
		addWindowStateListener(nuevo_estado);
		
	}
	
	
}


class CambiaEstado implements WindowStateListener{
	
	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("la ventana ha cambiado de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("la pantalla esta maximizada");
			
		}else if(e.getNewState()== Frame.NORMAL) {
			
			System.out.println("ventana normal");
			
		}else if(e.getNewState()==Frame.ICONIFIED) {
			
			System.out.println("Ventana minimizada");
			
			
		}
	}
	
	
	
	
}