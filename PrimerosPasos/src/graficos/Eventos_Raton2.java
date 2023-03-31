package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton2 mimarco = new MarcoRaton2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton2 extends JFrame{
	
	public MarcoRaton2() {
		
		setTitle("eventos raton");
		setBounds(700,300,600,450);
		setVisible(true);
		
		EventosRaton2 Eventosraton = new EventosRaton2();
		
		addMouseListener(Eventosraton);
		
		EventosRaton3 Eventosraton2 = new EventosRaton3();
		
		addMouseMotionListener(Eventosraton2);
		
		
	}
}


class EventosRaton2 extends MouseAdapter{
	
	
	/*public void mouseClicked(MouseEvent e) {
		
		//System.out.println("coordenada x: " + e.getX() + " Coordenada Y : " + e.getY());
		System.out.println(e.getClickCount());
		
	}*/
	
	
	
	public void mousePressed(MouseEvent e) {
		
		//System.out.println(e.getModifiersEx()); //me muestra el valor de la constante del boton presionado
		
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("has presionado el boton izquierdo");
			
			
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("has presionado rueda raton");
			
		}else if(e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("has presionado boton derecho");
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
	
	
	
	
}}