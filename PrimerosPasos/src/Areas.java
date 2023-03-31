import java.util.*;
import javax.swing.*;

//uso de switch case

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("elige una opcion:\n1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo");
		
		int figura= entrada.nextInt();
		
		switch(figura){
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("introduce el lado")) ;	
			
			System.out.println("el area es:"+Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("introduce base: "));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce altura: "));
			System.out.println("el area es:"+ (base*altura));
			
			break;
			
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("introduce la base:"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("introduce Altura:"));
			
			System.out.println("el area del triangulo es: "+ (base*altura/2));
			
			break;
			
			
		case 4:
			
			double radio= Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio:"));
			
			System.out.print("el area del circulo es:");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			
			break;
			
		
		default:
			System.out.println("Opcion incorrecta");
			
		
			
		
	
			
			
			
		}
		
		

	}

}
