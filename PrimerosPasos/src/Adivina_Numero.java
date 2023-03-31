import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio= (int) (Math.random()*100);
		
		Scanner entrada=new Scanner (System.in);
		int numero=0;
		int intentos=0;
		
		/*do { forma de ejecutarlo con un do-while
		 * 
		 *     aseguramos que el programa se ejecute el programa una vez
					}while(numero!=aleatorio);*/
		
		while(numero!=aleatorio) {
			
			intentos++;
			System.out.println("Introduce numero");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("el numero es menor");
			}
			else if(aleatorio>numero) {
				
				System.out.println("el numero es mayor");
			}
			
		}
		
		System.out.println("acertaste\n"+"numero de intentos:"+intentos);
		
		
		

	}

}
