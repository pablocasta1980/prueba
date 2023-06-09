package graficos;

import javax.swing.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuFrame mimarco = new MenuFrame();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}


class MenuFrame extends JFrame{
	
	public MenuFrame() {
		
		setBounds(500,300,550,400);
		
		MenuLamina milamina = new MenuLamina();
		
		add(milamina);
		
		setVisible(true);
	}
	
	
	
}


class MenuLamina extends JPanel{
	
	
	public MenuLamina() {
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		
		JMenu edicion = new JMenu("Edicion");
		
		JMenu herramientas = new JMenu("Herramientas");
		
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		
		JMenuItem guardar_como = new JMenuItem("Guardar Como");
		
		JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("imagenes/ima.png"));
		
		JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("imagenes/ima.png"));
		
		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("imagenes/ima.png"));
		
		JMenuItem generales = new JMenuItem("Generales");
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		opciones.add(opcion1);
		
		opciones.add(opcion2);		
		
		archivo.add(guardar);
		
		archivo.add(guardar_como);
		
		edicion.add(cortar);
		
		edicion.add(copiar);
		
		edicion.add(pegar);
		
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		mibarra.add(archivo);
		
		mibarra.add(edicion);
		
		mibarra.add(herramientas);
		
		add(mibarra);
		
		
		
		
	}
}



