package graficos;

import java.awt.*;

import javax.swing.*;

public class LibreDisposicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoLibre mimarco = new MarcoLibre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoLibre extends JFrame{
	
	public MarcoLibre() {
		
		setBounds(450,350,800,500);
		
		LaminaLibre milamina = new LaminaLibre();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
	
	
}



class LaminaLibre extends JPanel {
	
	
	public LaminaLibre() {
		
		setLayout(new EnColumnas());
		
		/*JButton boton1 = new JButton("boton 1");		
		JButton boton2 = new JButton("boton 2");		
		boton1.setBounds(50, 50, 120, 25);		
		boton2.setBounds(200, 100, 120, 25);
		add(boton1);		
		add(boton2);*/
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel tel = new JLabel("Telefono: ");
		
		JTextField c_nombre = new JTextField();
		JTextField c_apellido = new JTextField();
		JTextField c_edad = new JTextField();
		JTextField c_tel = new JTextField();
		
		/*nombre.setBounds(100, 100, 100, 20);
		apellido.setBounds(100, 130, 100, 20);
		c_nombre.setBounds(160, 100, 100, 20);
		c_apellido.setBounds(160, 130, 100, 20);*/
		
		add(nombre);
		add(c_nombre);
		
		add(apellido);
		add(c_apellido);
		
		add(edad);
		add(c_edad);
		
		add(tel);
		add(c_tel);
		
		
		
	}
	
}


class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		
		int d = micontenedor.getWidth();
		
		x=d/2;
		
		int contador = 0;
		
		int n = micontenedor.getComponentCount();
		
		for (int i= 0; i<n; i++) {
			
			contador++;
			
			Component c = micontenedor.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
			if(contador%2 == 0) {
				
				x=d/2;
				y+=40;
			}
			
		}
		
	}
	
	private int x;
	
	private int y=20;
	
	
}
