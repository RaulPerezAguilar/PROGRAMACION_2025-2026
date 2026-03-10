package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1 = new CuentaBancaria("Raul", 5000);
		cuenta1.setTitular("Raul Perez");
		cuenta1.setSaldo(100000);
		cuenta1.retirar(5);
		System.out.println("Saldo total: " + cuenta1.getSaldo());
	}

}