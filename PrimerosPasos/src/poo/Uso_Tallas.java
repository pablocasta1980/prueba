package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uso_Tallas {
	
	
	//enum Talla{pequeña,mediana,grande};
	
	enum Talla{
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		public String dameAbreviatura() {
			
			return abreviatura;
		}
		
		private String abreviatura;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Entrada= new Scanner(System.in);
		
		System.out.println("Digite talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String entrada_datos= Entrada.nextLine().toUpperCase();
		
		Talla la_talla= Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("talla: "+ la_talla);
		System.out.println("abreviatura:" + la_talla.dameAbreviatura());
	
		
		
		
		
		
		

	}

}
