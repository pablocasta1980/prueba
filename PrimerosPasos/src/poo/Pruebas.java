package poo;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados [] misEmpleados=new Empleados[2];
		
		for(int i=0;i<misEmpleados.length;i++) {
			
			misEmpleados[i]=new Empleados(JOptionPane.showInputDialog("Digite nombre empleado:" ),
					Integer.parseInt(JOptionPane.showInputDialog("Digite edad:" )));
		}
		
		/*Empleados empleado1 = new Empleados("juan");
		Empleados empleado2 = new Empleados("maria");
		
		
		empleado1.cambiarSeccion("produccion");             //FORMA DE MOSTRAR DATOS
		
		
		System.out.println(empleado1.devuelvedatos());
		System.out.println(empleado2.devuelvedatos());*/
		
		for(Empleados dato:misEmpleados) {
			
			System.out.println(dato.devuelvedatos());      //FORMA DE MOSTRAR DATOS CICLO FOR EACH
			
		}
		
		System.out.println(Empleados.DameIdSiguiente()); //acceso a metodos static
		
		
		
		
		

	}

}


class Empleados{
	
	private final String nombre;
	private String seccion;
	private int edad;
	private int Id;
	private static int IdSiguiente=1;
	
	
	public static String DameIdSiguiente() {
		
		return "el idSiguiente es:" +IdSiguiente;
	}
	
	
	
	public Empleados(String nom,int agnos){
		
		nombre=nom;
		seccion="Administracion";
		edad=agnos;
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	


	public void cambiarSeccion(String seccion) { //SETTER
	
		this.seccion=seccion;
	}
	
	

	public String devuelvedatos() {  //GETTER
	
		return "El nombre es " + nombre + " y pertenece a " + seccion +" tiene:" + edad + " años"
				+" con Id: " + Id;
	
	}
}

