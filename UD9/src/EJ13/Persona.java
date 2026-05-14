package EJ13;

import java.io.Serializable;

//Clase Persona
class Persona implements Serializable {
 private String nombre;

 public Persona(String nombre) {
     this.nombre = nombre;
 }

 public String getNombre() {
     return nombre;
 }
}
