import java.util.Scanner;
//USO CICLO FOR EACH
public class Uso_ArraysIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.out.println("digite la cantidad de aleatorios:");
		
		Scanner entrada= new Scanner(System.in);
		
		int cantidad=entrada.nextInt();
		
		int [] aleatorio= new int[cantidad];
		
		
		for(int i=0;i<cantidad;i++) {
			
			aleatorio[i]=(int)Math.round((Math.random()*1000));		
			
			
		}
		
		int a=0;
		for(int numero:aleatorio) {
			a++;
			System.out.print(" "+numero);
			if (a==cantidad/2) {
				System.out.println();
				
			}
		}
		
		
		
	}

}
