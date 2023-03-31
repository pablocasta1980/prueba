import javax.swing.JOptionPane;

//CICLO FOR EACH
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//String [] paises= {"argentina", "colombia", "peru", "brazil"};
		/*
		 * paises[0]="argentina";
		 * paises[1]="colombia";   opcion para llenar la matriz
		 * 
		 */
		
		/*
		 * for(int i=0;i<paises.length;i++){
		 *     
		 *     System.out.println("pais: "+ paises[i]);   OPCION CON CICLO FOR
		 * 
		 * }
		 */
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de paises"));
		
		String [] paises=new String[cantidad];
		
		for(int i=0;i<cantidad;i++) {
			
			paises[i]=JOptionPane.showInputDialog("digite pais");
			
		}
		
		//USO CICLO FOR EACH
		int a=0;
		for(String pueblo:paises) {
			a++;
			System.out.println("pais "+(a) +" : "+ pueblo);
		}
	
	}

}
 