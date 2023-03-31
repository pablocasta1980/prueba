package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche Renault=new Coche();  //INSTANCIAR UNA CLASE.EJEMPLAR DE CLASE
		                            // new Coche() es el constructor de la clase Coche
		//System.out.println("este coche tiene " + Renault.ruedas +" ruedas");
		
		
		System.out.println(Renault.getDatosGenerales());
		
		
		Renault.setRuedas(3);
		System.out.println("tiene: "+Renault.getRuedas()+" ruedas");
		
		
		Renault.setColor(JOptionPane.showInputDialog("digita color del coche"));
		System.out.println(Renault.getColor());
		
		
		Renault.setconfigura_asientos(JOptionPane.showInputDialog("Desea asientos de cuero"));			
		System.out.println(Renault.getDime_asientos());
		
		Renault.setClimatizador(JOptionPane.showInputDialog("Desea climatizador"));
		System.out.println(Renault.getClimatizador());
		
		System.out.println(Renault.set_get_Dime_peso_coche());
		
		System.out.println("el precio del coche es: " + Renault.precio_coche() + " dolares");*/
		
		
		Coche miCoche1= new Coche();
		
		miCoche1.setColor("verde");
		
		
		Furgoneta miFurgoneta1 = new Furgoneta(5,250);
		
		miFurgoneta1.setColor("azul");
		
		miFurgoneta1.setconfigura_asientos("si");
		
		miFurgoneta1.setClimatizador("si");
		
		
		System.out.println(miCoche1.getDatosGenerales()+"\n"+miCoche1.getColor());
		
		
		System.out.println(miFurgoneta1.getDatosGenerales()+miFurgoneta1.getDimeDatosFurgoneta() + "\n" + miFurgoneta1.getDime_asientos());
		
		
		
		

	}

}
