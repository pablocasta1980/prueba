package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setTitle("eventos con raton");
		setBounds(700,300,600,450);
		setVisible(true);
		
		EventosDeRaton EventoRaton = new EventosDeRaton();
		addMouseListener(EventoRaton);
		
		
	}
}


/*class EventosDeRaton implements MouseListener{....}
 * 
 * con esta clase adaptadora solo llamas los metodos que necesites
 * 
*/
class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("has dado click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("presionas");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("levantaste");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("has entrado");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("has salido");
	}
	
	
}