/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 01_1DAW_Alum
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1
        List listaNula = null;
        System.out.println(listaNula);
        //2
        List lista = new ArrayList();
        System.out.println(lista);
        //3
        Persona p1 = new Persona("Paco");
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Luis");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        //4
        System.out.println(lista.getLast());
        
        //5
        Persona persona;
        persona = (Persona)lista.getFirst();
        persona.setNombre("Paco");
        
        //6
        int indiceCentral = lista.size()/2 -1;
        lista.remove(indiceCentral);
        System.out.println(lista);
        
        //8
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        //9
        Persona ale = new Persona("Ale");
        lista.add(ale);
        if (lista.contains(ale))
            System.out.println("Ale esta en la lista");
        
        //10
        lista.clear();
        if (lista.isEmpty())
	System.out.println("Está vacía.");
        System.out.println(lista
        );
    }
    
}
