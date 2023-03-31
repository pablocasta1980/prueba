import java.util.Scanner;

public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Entrada= new Scanner(System.in);
		
		System.out.println("Digite su edad: ");
		int edad= Entrada.nextInt();
		
		System.out.println("edad: "+ edad);
		
		
		if(edad<18) {
			System.out.println("eres adolscente");
		}
		else if(edad<40) {
			System.out.println("eres joven");
			
		}
		else if(edad<65) {
			System.out.println("maduro");
		}
		else {
			System.out.println("cuidate");
		}

	}

}
