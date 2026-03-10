package Ejercicio2;

import Ejercicio2.Persona.Sexo;

public class Ciudad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiaDeLaSemana miercoles = DiaDeLaSemana.MIERCOLES;
		
		Persona juan = new Persona("Juan", "Pérez", 20, 1.8f, Persona.Sexo.MASCULINO);
		juan.nombre = "Juan";
		System.out.println(juan.getNombre());
		System.out.println(juan.getApellido());
		
		juan.setSexo(Sexo.FEMENINO);
		System.out.println(juan.getSexo());
		
		juan.setEdad(-1);
		System.out.println(juan.getEdad());
	}

}