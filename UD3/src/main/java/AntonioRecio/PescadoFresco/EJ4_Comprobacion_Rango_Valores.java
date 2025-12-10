package AntonioRecio.PescadoFresco;

public class EJ4_Comprobacion_Rango_Valores {

    public static void main(String[] args) {

        short max = 32767;          // Valor máximo de short
        short min = -32768;         // Valor mínimo de short

        short siguiente = (short) (max + 1); // Provoca overflow

        System.out.println("Valor máximo de short: " + max);
        System.out.println("Valor mínimo de short: " + min);
        System.out.println("Valor de max + 1: " + siguiente);

        if (siguiente == min) {
            System.out.println("El tipo short es cíclico: después del máximo viene el mínimo.");
        } else {
            System.out.println("El tipo short NO es cíclico.");
        }
    }
}
