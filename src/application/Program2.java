package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		
		String titularConta = sc.nextLine();	
		System.out.println("Tem deposito inicial (y/n)? ");
		char response = sc.next().charAt(0);
	
		if (response == 'y') {
			System.out.println("Entre com o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titularConta, depositoInicial);
		}
		else {
			conta = new Conta(numero, titularConta);
		}
		
		System.out.println();
		System.out.println("Numero da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double depositoVelho = sc.nextDouble();
		conta.deposito(depositoVelho);
		System.out.println("Valor do saldo atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double saqueVelho = sc.nextDouble();
		conta.saque(saqueVelho);
		System.out.println("Valor do saldo atualizado: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}
