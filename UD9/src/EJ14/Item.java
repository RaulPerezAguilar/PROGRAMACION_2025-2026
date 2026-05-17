package EJ14;

import java.io.Serializable;

/*
 * Clase Item
 * Implementa Serializable para poder guardarse en un archivo binario.
 */
public class Item implements Serializable {

    // Recomendado para clases serializables
    private static final long serialVersionUID = 1L;

    // Atributos del objeto
    private String nombre;
    private double peso;
    private double valor;

    // Constructor
    public Item(String nombre, double peso, double valor) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }

    // Getter del valor (lo usaremos para calcular el total)
    public double getValor() {
        return valor;
    }

    // Método toString para mostrar información del objeto
    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", valor=" + valor +
                '}';
    }
}