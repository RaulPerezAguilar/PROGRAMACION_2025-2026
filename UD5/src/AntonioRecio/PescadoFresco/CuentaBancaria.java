/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AntonioRecio.PescadoFresco;
import java.util.Scanner;

/**
 *
 * @author 01_1DAW_Alum
 */
public class CuentaBancaria {
    private String titular;
    private int saldo; 
Scanner sc = new Scanner(System.in);
public String getTitular() {
    return titular;
}

public int getSaldo() {
    return saldo;   
}

public void ingresar(double saldo) {
    System.out.println();
    int ingreso = sc.nextInt();
    if (ingreso > 0) {
    saldo = saldo + ingreso;
    } else {
    System.out.println("Ingreso insuficiente o erroneo");
    }
}

public void retirar(double saldo) {
    int retirada = 0;
    if (retirada < saldo) {
    saldo = saldo - retirada;
    } else {
    System.out.println("Saldo insuficiente");
    }
}

}
