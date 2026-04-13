package EJ2;

import EJ1.*;

public class Persona {
	String nombre;
	String apellido;
	private int edad;
	private float estatura;
	private DiaDeLaSemana dia;
	private Sexo sexo;
	
            Persona(String nombre){
                this.nombre = nombre;
            }
            
            
	Persona() {
		nombre = "Francisco";
		edad = 54;
	}
	
	Persona(String nombre, String apellido, int edad, float estatura, Sexo sexo){
		this.sexo = sexo;
	}
	
	Persona(String nombre, String apellido, int edad, float estatura, DiaDeLaSemana dia, Sexo sexo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.sexo = sexo;
	}
	
	void saludar() {
		System.out.println("Hola");
	}
	
	void cumplirAños() {
		edad += 1;
	}
	
	void crecer(float incremento) {
		estatura = estatura + incremento;
	}
	
	public enum Sexo {
		MASCULINO, FEMENINO, NO_BINARIO
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (edad >= 0) 
			this.edad = edad;
	}
	
	public float getEstatura() {
		return estatura;
	}
	
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo s) {
		this.sexo = s;
	}
        
           
           public String toString() {
               return nombre;
           }
}