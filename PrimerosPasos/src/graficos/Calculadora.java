package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}


class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		
		add(milamina);
		//pack(); //da un tamaño por defecto se elimina el setBounds
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		
		Image miIcono = mipantalla.getImage("imagenes/Logo_Negro.jpg");
		
		setIconImage(miIcono);
		
	}
	
	
}


class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla,BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new InsertaNumero();
		
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("/",orden);
		
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("*",orden);
		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("-",orden);
		
		ponerBoton("0",insertar);
		ponerBoton(",",orden);
		ponerBoton("=",orden);
		ponerBoton("+",orden);
		
		/*JButton  boton1 = new JButton("1");
		
		milamina2.add(boton1);
		
		JButton  boton2 = new JButton("2");
		
		milamina2.add(boton2);*/  //agregar botones a pedal
		
	
		
		add(milamina2,BorderLayout.CENTER);
		
		ultimaOperacion= "=";
	}
	
	
	private void ponerBoton(String rotulo,ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
	}
	
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			String entrada = e.getActionCommand();
			
			if(principio) {
				
				pantalla.setText("");
				principio =false;
				
			}
			
			pantalla.setText(pantalla.getText()+entrada);

		}	
		
	}
	
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion = e.getActionCommand();
			
			//System.out.println(operacion);
			
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion = operacion;
			
			principio=true;
			
			
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) {
				
				resultado+=x;
				
				
			}else if(ultimaOperacion.equals("-")) {
				
				resultado-=x;
				
			}else if(ultimaOperacion.equals("*")) {
				
				resultado*=x;
				
			}else if(ultimaOperacion.equals("/")) {
				
				resultado=Math.sqrt(x);
				
			}else if(ultimaOperacion.equals("=")) {
				
				resultado=x;
			}
			
			pantalla.setText(""+resultado);
		}
		
		
	}
	
	
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
	
	
	
}