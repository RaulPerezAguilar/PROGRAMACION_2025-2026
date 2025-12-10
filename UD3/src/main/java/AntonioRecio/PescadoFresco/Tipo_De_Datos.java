package AntonioRecio.PescadoFresco;
public class Tipo_De_Datos 
{
    public static void main(String[] args)
    {
        // Declarar variables

        boolean boleano;     // Tipo boolean: solo puede ser true o false
        char caracter;       // Tipo char: almacena un carácter (entre comillas simples)
        byte miByte;         // Tipo byte: número entero pequeño (-128 a 127)
        short miShort;       // Tipo short: entero más grande que byte (-32768 a 32767)
        int entero;          // Tipo int: entero estándar (el más usado)
        long enteroLargo;    // Tipo long: entero de mayor tamaño (añade L al final)
        float decimal;       // Tipo float: número decimal de precisión simple (añade f)
        double doble;        // Tipo double: número decimal de doble precisión

        // Inicializar variables

        boleano = true;        // Asignamos un valor booleano
        caracter = 'A';        // Un carácter individual
        miByte = 10;           // Un número pequeño
        miShort = 300;         // Número entero más grande que un byte
        entero = 1000;         // Entero típico
        enteroLargo = 100000L; // Entero largo (lleva 'L')
        decimal = 3.14f;       // Número decimal float (lleva 'f')
        doble = 2.71828;       // Número decimal double

        // Imprimir por consola

        System.out.println("boolean: " + boleano);
        System.out.println("char: " + caracter);
        System.out.println("byte: " + miByte);
        System.out.println("short: " + miShort);
        System.out.println("int: " + entero);
        System.out.println("long: " + enteroLargo);
        System.out.println("float: " + decimal);
        System.out.println("double: " + doble);
    }
}
