package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();
		
		//ActionListener oyente = new DameLaHora();
		
		Timer mitemporizador = new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar");
		
		System.exit(0);
		

	}

}

class DameLaHora implements ActionListener{   //INTERFACE
	
	public void actionPerformed(ActionEvent e) {  //METODO
		
		Date ahora = new Date();
		System.out.println("la hora cada 5 sg:" + ahora);
		//Toolkit.getDefaultToolkit().beep();
		
	}

	
}