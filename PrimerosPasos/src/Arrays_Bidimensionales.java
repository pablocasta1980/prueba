import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] matriz=new int [5][5];
		Scanner entrada=new Scanner(System.in);
		//int entrada1=Integer.parseInt(JOptionPane.showInputDialog("digite:"));//"solo practicar"
		
		
		/*
		 * int [] [] matriz={
		 * 
		 *           {4,5,6,6,4,7,4},
		 *           {4,5,6,6,4,7,4},       forma opcional de llenar una matriz
		 *           {4,5,6,6,4,7,4},
		 *           {4,5,6,6,4,7,4},

		 * 
		 * }
		 * 
		 * 
		 */
		
		
		for(int i=0; i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				System.out.println("digite el valor de la posicion "+i+" "+j+":");
				matriz[i][j]=entrada.nextInt(); //(int)(Math.random()*100);
				
			}
		}
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				 System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		  for(int [] fila:matriz) {
			System.out.println();
			 for(int z:fila){
			   System.out.print(z+" ");
			 }
		}
		 
		
		

	}

}
