package Application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Olá, seja bem vindo ao nosso banco!");
		System.out.print("Por favor, digite seu nome: ");
		String nomeCliente = sc.next();
		System.out.print("Por favor, digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Por favor, digite a agência: ");
		String agencia = sc.next();
		System.out.print("Por favor, informe o seu saldo: ");
		float saldo = sc.nextFloat();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
				+ agencia + ", conta: " + numero + " e seu saldo é de: " + String.format("%.2f", saldo));

		sc.close();
	}

}
