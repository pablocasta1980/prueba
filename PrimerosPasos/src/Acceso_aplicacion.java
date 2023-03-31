import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave= "pablo ";
		String pass="";
		
		
		while(clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("introduce clave");
			
			if(clave.equals(pass)==false) {
				System.out.println("clave incorrecta");
											
			}
			
		}
		
		System.out.println("clave correcta");
		

	}

}
