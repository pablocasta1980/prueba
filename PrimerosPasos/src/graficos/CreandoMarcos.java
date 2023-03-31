package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1= new miMarco();
		
		marco1.setVisible(true);
		
		//marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class miMarco extends JFrame{
	
	
	public miMarco(){
		
		//setSize(500,300);         // tamaño de la pantalla
		//setLocation(400,300);     // ubicacion de la pantalla
		
		setBounds(550,300,250,250);  //  ubicacion y tamaño
		
		//setResizable(false);      //impide ampliacion del marco
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("        primera");
		
	}
	
	
}