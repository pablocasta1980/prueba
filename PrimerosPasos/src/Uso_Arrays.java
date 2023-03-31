//arreglos


public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz=new int[5];
		//int mi:matriz[]=new int[5]; segunda opcion de declarar
		/*
		 * mi_matriz[0]=5;
		 * mi_matriz[1]=2;
		 * mi_matriz[2]=90;
		 * mi_matriz[3]=98;
		 * mi_matriz[4]=5;
		 * 
		 * 
		 * mi_matriz[]={5,2,90,98,5}; opciones de rellenar una matriz
		 * 
		 */
		
		
		
		for(int i=0;i<mi_matriz.length;i++) {
			
			mi_matriz[i]=(int)(Math.random()*100);
		}
		
		for(int j=0;j<mi_matriz.length;j++) {
			
			System.out.println("valor de la posicion " + (j+1)+" del arreglo es: "+mi_matriz[j]);
		}

	}

}
