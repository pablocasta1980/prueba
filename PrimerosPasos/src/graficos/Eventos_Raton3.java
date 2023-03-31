package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton3 mimarco = new MarcoRaton3();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton3 extends JFrame{
	
	public MarcoRaton3() {
		
		setTitle("eventos raton");
		setBounds(700,300,600,450);
		setVisible(true);
		
		EventosRaton3 Eventosraton = new EventosRaton3();
		
		addMouseMotionListener(Eventosraton);
		
		
	}
}


class EventosRaton3 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("moviendo");
	}
	
	
	
	
	
	
	
}
