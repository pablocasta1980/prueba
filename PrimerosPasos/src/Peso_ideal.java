import javax.swing.JOptionPane;
//ejemplo con el do-while
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String genero="";
		
		int altura;
		
		do {
			
			genero=JOptionPane.showInputDialog("introduzca sexo (H/M):");
			
		}while(genero.equalsIgnoreCase("h")==false&&genero.equalsIgnoreCase("m")==false);
		
		
		
		do {
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("digite su altura:" ));
			
			if(altura>300||altura<50) {
				System.out.println("verifique su altura");
				altura=0;
			}
			
		}while(altura==0);
		
		
		
		
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("h")) {
			
			pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("m")) {
			pesoideal=altura-120;
		}
		
		
		
		System.out.println("tu peso ideal es: " + pesoideal);
		
		
		
		
		
		

	}

}
