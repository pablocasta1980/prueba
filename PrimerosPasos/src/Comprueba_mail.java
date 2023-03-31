import javax.swing.JOptionPane;
//ciclo for evaluar dentro de un string un caracter
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		int contadorArroba=0;
		int contadorPuntos=0;
		boolean punto=false;
				
		
		while(arroba==false) {
		
		String correo=JOptionPane.showInputDialog("Digite Correo");
		
		for(int i=0;i<correo.length();i++) {
			
			if(correo.charAt(i)=='@') {
				contadorArroba ++;			
				
			}	
			
			if(correo.charAt(0)=='.'||correo.charAt(correo.length()-1)=='.') {
				punto=true;
				
			}
			
			
			
			if(correo.charAt(i)=='.') {
				contadorPuntos++;
			}
					
					
		}
		if(contadorArroba==1&&contadorPuntos>=1) {
			arroba=true;
			
			
		}
		
		if(arroba==false) {
			System.out.println("correo erroneo, digite nuevamente");
			if(punto==true) {
				System.out.println("punto al inicio no es permitido ni a inicio ni final");
			}
			contadorPuntos=0;
			contadorArroba=0;
			punto=false;
			
		}
		
		else {
			System.out.println("correcto");
		}
		
		}

	}

}
