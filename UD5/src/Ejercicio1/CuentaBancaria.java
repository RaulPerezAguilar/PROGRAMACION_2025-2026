package ejercicio1;

class CuentaBancaria {
	// atributos privados
	private String titular;
	private double saldo;
	
	// metodos publicos
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad>0);
			this.saldo = this.saldo + cantidad;
	}
	
	public void retirar(double cantidad) {
		if (cantidad < saldo);
			saldo = saldo - cantidad;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// constructores
	public CuentaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
}