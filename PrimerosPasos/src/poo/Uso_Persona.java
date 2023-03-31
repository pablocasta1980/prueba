package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona[] lasPersonas= new Persona[3];
		lasPersonas[0]=new Empleado2("luis",5000,2009,02,25);
		lasPersonas[1]=new Alumno("juan","biologia");
		lasPersonas[2]=new Empleado2("javier",5000,2009,02,25);
		
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre()+","+p.dameDescripcion());
			
			
		}
		
	}



}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String dameNombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	
	
	private String nombre;
	
	
	
}

class Empleado2 extends Persona{
	
	
	public Empleado2(String nom,double sue,int agno,int mes,int dia) {
		
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();		
		++IdSiguiente;
		Id=IdSiguiente;
		
	
		
	}
	
	
	
	public String dameDescripcion() {
		return "Este empleado tiene un id:" +Id+ " con un sueldo: "+sueldo;
	}
	
	
	public double dameSueldo() { //GETTER
		
		return sueldo;
	}
	
	public Date dameFechaContrato() { //GETTER
		
		return altaContrato;
	}
	
	
	public void subeSueldo(double porcentaje) {  //SETTER
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;

	}
	
	
	
	
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
}


class Alumno extends Persona{
	
	public Alumno(String nom,String car) {
		super(nom);
		
		carrera=car;
		
	}
	
	public String dameDescripcion() {
		
		return "este alumno estudia: " + carrera;
	}
	
	private String carrera;
}