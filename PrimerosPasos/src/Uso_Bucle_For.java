import java.util.Scanner;

import javax.swing.JOptionPane;
//uso del ciclo for
public class Uso_Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre1;
		String nombre;
		int a=0;
		
		do {
			Scanner entrada=new Scanner(System.in);
			System.out.println("Digite su nombre:");
			nombre1=entrada.next();
			
			
			nombre=JOptionPane.showInputDialog("confirme nombre");
			
			if(nombre.equals(nombre1)) {
				System.out.println("confirmado");
				a=1;
			}else {
				System.out.println("incorrecto");
			}
			
			
			
		}while(a==0);
		
		
		
		for(int i=0;i<10;i+=2) {
			
			System.out.print(nombre+"  ");
			
		}

	}

}
