package entities;

public class Conta {

	private int numero;
	private String titularConta;
	private double saldo;

	public Conta(int numero, String titularConta) {
		this.numero = numero;
		this.titularConta = titularConta;
	}

	public Conta(int numero, String titularConta, double depositoInicial) {
		this.numero = numero;
		this.titularConta = titularConta;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantidade) {
		saldo += quantidade;
	}

	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}

	public String toString() {
		return "Conta "
				+ numero
				+ ", titularConta: "
				+ titularConta
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}
}