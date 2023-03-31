package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero,climatizador;
	
	
	public Coche() {
		
		//metodo constructor
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
		
		
		
	}


	public int getRuedas() {  //metodo get
		return ruedas;
	}


	public void setRuedas(int ruedas) {//set. sintaxis: public void_nombreMetodo(){codigo}
		this.ruedas = ruedas;
	}
	
	
	public String getDatosGenerales() {   //metod get sintaxis: public_tipoDato_nombre(){codigo +return }      }
		
		return("la plataforma tiene  " + ruedas + " ruedas" + " mide " + (largo/1000) + 
				" mts de largo con un ancho de " + ancho +" cm y un peso de " + peso_plataforma+
				" kg ");
	}


	public String getColor() {
		return "el color del coche es " +color;
	}


	public void setColor(String color_coche) {
		color = color_coche;
	}
	
	
	
	public void setconfigura_asientos(String asientos_cuero) { //SETTER
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;
		}
		else {
			
			this.asientos_cuero=false;
		}
	}
	
	public String getDime_asientos() {
		
		if(asientos_cuero==true) {
			
			return "el coche tiene asientos de cuero";
		}
		else {
			
			return ("el coche tiene asientos de serie");
		}
	}


	public String getClimatizador() { //GETTER
		if(climatizador==true) {
			return "el coche tiene climatizador";
		}else {
			return "el coche no tiene climatizador";
		}
	}


	public void setClimatizador(String climatizador) {  //SETTER
		
		if (climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}	
		
		
	}
	
	
	public String set_get_Dime_peso_coche() { //METODO SET Y GET UNIDOS POCO RECOMENDADO
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		
		if(climatizador==true) {
			
			peso_total=peso_total+20;
		}
		
		return "el peso total del vehiculo es " + peso_total + "kg";
		
		
	}
	
	
	public int precio_coche() {   //GETTER
		
		int precio=10000;
		
		if(asientos_cuero==true) {
			
			precio+=2000;
		}
		
		if(climatizador==true) {
			
			precio+=1500;
		}
		
		return precio;
		
	}
	
  

	
	

}
