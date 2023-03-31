package graficos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas mimarco = new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}


class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("imagenes/Logo_Negro.jpg");
		setIconImage(miIcono);
		
		setTitle("Marco");
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
		
		
		
	}
	
	
}


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		char letra = e.getKeyChar();
		
		System.out.print(letra);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//int codigo = e.getKeyCode();
		
		//System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	
	
	
	
	
}



