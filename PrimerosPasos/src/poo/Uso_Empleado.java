package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRIMER FORMA DE INCIAR EL METODO CONSTRUCTOR
		
		/*Empleado empleado1 = new Empleado("pablo",80000,2000,11,17);
		Empleado empleado2 = new Empleado("paola",85000,1999,12,15);
		Empleado empleado3 = new Empleado("vivi",81000,2002,3,27);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.print("sueldo nuevo de "+ empleado1.getNombre()+" es: "+empleado1.getSueldo());
		System.out.print(" la fecha de ingreso es: " + empleado1.getFechaContrato());
		
		System.out.println();
		System.out.print("sueldo nuevo de "+ empleado2.getNombre()+" es: "+empleado2.getSueldo());
		System.out.print("la fecha de ingreso es: " + empleado2.getFechaContrato());
		
		System.out.println();
		System.out.print("sueldo nuevo de "+ empleado3.getNombre()+" es: "+empleado3.getSueldo());
		System.out.print("la fecha de ingreso es: " + empleado3.getFechaContrato());*/
		
		
		jefatura jefe_RRHH=new jefatura("Juan", 55000, 2006,9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		
		
		Empleado[] misEmpleados= new Empleado[6];      //String [] array= new String[3];
												   //Empleado es una clase,estamos creando un array
		                                           //de tipo Empleado
		
		misEmpleados[0]= new Empleado("pablo",85000,2000,11,17);
		misEmpleados[1]= new Empleado("pedro",80000,1990,12,23);
		misEmpleados[2]= new Empleado("julia",90000,2012,05,14);
		misEmpleados[3]= new Empleado("viviana");
		misEmpleados[4]= jefe_RRHH;//polimorfismo en accion. principio de sustitucion
		misEmpleados[5]= new jefatura("maria",55000,2008,11,25);
		
		//double a = 52.22
		// int b = (int) a;  cast para convertir un double a un entero
		
		jefatura jefa_finanzas= (jefatura) misEmpleados[5];  //cast para convertir a objeto tipo jefatura
		
		jefa_finanzas.estableceIncentivo(5000);
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar vacaciones"));
		
		
		
		System.out.println("la jefa de finanzas " + jefa_finanzas.getNombre() + " tiene un bonus de " + 
		jefa_finanzas.estableceBonus(1500));
		
		System.out.println(misEmpleados[3].getNombre() + " tiene  un bonus de :" +
		misEmpleados[3].estableceBonus(200));
		
		
		for (int i=0;i < misEmpleados.length; i++) {
			
			misEmpleados[i].subeSueldo(0);
		}
		
		/*for (int i=0;i < misEmpleados.length; i++) {
			
			
			
			misEmpleados[i].getNombre();
			System.out.println("el nuevo salario de "+ misEmpleados[i].getNombre() + " es de " +
			misEmpleados[i].getSueldo() + " su fecha de ingreso fue " + misEmpleados[i].getFechaContrato());
			
			
		}*/
		
		System.out.println("");
		System.out.println("CON CICLO FOR EACH");
		System.out.println("");
		
		for(Empleado aumento : misEmpleados) {
			
			aumento.subeSueldo(5);  
			
		}
		
		Arrays.sort(misEmpleados);  //interface implementada en Empleado IMPLEMENTS COMPARABLE metodo compare to
		
		for(Empleado datos : misEmpleados) {
			
			System.out.println("nombre: " + datos.getNombre() + " sueldo: " + datos.getSueldo() +
					" su fecha de ingreso fue " + datos.getFechaContrato() );
			//en datos.getSueldo define o llama de acuerdo a si es empleado o jefe
		}
		System.out.print(Empleados.DameIdSiguiente());
		
	}

}


class Empleado implements Comparable,Trabajadores{
	
	
	
	
	
	
	public Empleado(String nom,double sue,int agno,int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();		
		IdSiguiente++;
		Id=IdSiguiente;
		
	
		
	}
	
public double estableceBonus(double gratificacion){
		
		double prima=1000;
		
		return prima + gratificacion + prima + Trabajadores.bonus_base;
		
	}



	
	public Empleado(String nom) {
		
		this(nom,30000,2000,01,01);
		
	}
	
	
	public String getNombre() {  //GETTER
		return nombre + " Id " +Id;
	}
	
	public static String dameSiguienteId(){
		return " el id es " + IdSiguiente;
	}
	
	public double getSueldo() { //GETTER
		
		return sueldo;
	}
	
	public Date getFechaContrato() { //GETTER
		
		return altaContrato;
	}
	
	
	public void subeSueldo(double porcentaje) {  //SETTER
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;

	}
	
	public int compareTo(Object miObjeto) {  //metodo de la interface sort
		
		Empleado otroEmpleado=(Empleado)miObjeto;
		
		if(this.Id<otroEmpleado.Id) {
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			return 1;
		}
		
		return 0;
		
		
		
	}
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
	
	
	

}


class jefatura extends Empleado implements Jefes{
	
	public jefatura(String nom,double sue,int agno,int mes,int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {
		
		return "un miembro tomo la decision de:" + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
	public void estableceIncentivo(double b) {  //SETTER
		
		incentivo=b;
	}
	
	
	public double getSueldo() {
		
		double sueldojefe=super.getSueldo();
		
		return sueldojefe+incentivo;
	}
	
	
	
	
	private double incentivo;
	
	
}







