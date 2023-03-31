import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre:");
		
		String edad= JOptionPane.showInputDialog("introduce tu edad: ");
		
		int edad_usuario= Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("hola "+ nombre_usuario+" tienes " +edad_usuario+" años");

	}

}
