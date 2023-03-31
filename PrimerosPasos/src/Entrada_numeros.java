import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=10000.0;
		
		System.out.printf("%1.3f",x/3);
		
		String num1=JOptionPane.showInputDialog("introduce un numero: ");
		
		double num2=Double.parseDouble(num1);
		
		
		System.out.println("numero:"+num2);
		
		
		System.out.print("la raiz cuadrada de "+num2+"  es:");
		System.out.printf("%1.3f",Math.sqrt(num2));
		
		
		
			
		

	}

}
