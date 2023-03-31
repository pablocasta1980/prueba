package graficos;

import java.awt.*;

import javax.swing.*;

public class MarcoMEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEmergenteM mimarco = new MarcoEmergenteM();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoEmergenteM extends JFrame{
	
	public MarcoEmergenteM() {
		
		setBounds(100,100,300,250);
		
		LaminaEmergenteM milamina = new LaminaEmergenteM();		
		
		add(milamina);
		
		setVisible(true);
	}
	
}


class LaminaEmergenteM extends JPanel{
	
	
	public LaminaEmergenteM() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar miBarra = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		
		JMenu estilo = new JMenu("Estilo");
		
		JMenu tamagno = new JMenu("Tamaño");
		
		miBarra.add(fuente);
		
		miBarra.add(estilo);
		
		miBarra.add(tamagno);
		
		laminaMenu.add(miBarra);
		
		add(laminaMenu,BorderLayout.NORTH);
		
		JTextPane miarea = new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		
		//-----------------------------------------------------------------
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		JMenuItem opcion3 = new JMenuItem("Opcion 3");
		
		emergente.add(opcion1);
		
		emergente.add(opcion2);
		
		emergente.add(opcion3);
		
		miarea.setComponentPopupMenu(emergente);
		
	}
	
}
