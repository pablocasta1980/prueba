package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj();
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		
		System.exit(0);

	}

}


class Reloj{
	
	
	
	
	
	public void enMarcha(int intervalo,final boolean sonido) { //se declara final porque el metodo accede a sonido
		
		 class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				System.out.println("la hora es: " + ahora);
				
				if(sonido==true) {
					
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
		}
		
		ActionListener oyente = new DameLaHora2(); 
			
		Timer mitemporizador = new Timer(intervalo, oyente);
		
		mitemporizador.start();
		
	}
	
	
	
	
}




