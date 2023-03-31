package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAcciones mimarco = new MarcoAcciones();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}

}


class MarcoAcciones extends JFrame{
	
	
	public MarcoAcciones() {
		
	
		setTitle("Marco Acciones");
		setBounds(600,350,600,300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
		
		
	}
	
}



class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("imagenes/ima.png"),Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("imagenes/ima.png"),Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("imagenes/ima.png"),Color.RED);
		
		/*JButton botonAmarillo = new JButton(accionAmarillo);
		add(botonAmarillo);*/      //una forma de crear un boton
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		
		/*JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		/*KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		
		mapaEntrada.put(teclaAmarillo,"fondo_amarillo");*/ // opcion 1
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondo_amarillo"); //opcion2
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"),"fondo_azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"),"fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		mapaAccion.put("fondo_azul", accionAzul);
		
		mapaAccion.put("fondo_rojo", accionRojo);
		
		
		
	}
	
	private class AccionColor extends AbstractAction{  //clase interna
		
		
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);     //captura el nombre del boton
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION,"poner la lamina de color " + nombre);
			
			putValue("color_de_fondo", color_boton);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c = (Color) getValue("color_de_fondo");
			
			setBackground(c);
			
			
			String nom = (String) getValue(Action.NAME);
			System.out.println(nom);
			
			System.out.println("descripcion: " + getValue(Action.SHORT_DESCRIPTION));
			
		}
		
		
	}
	
	
}


