package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaGold;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta cg = new ContaGold(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cg.depositar(300);
		cg.sacar(400);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cg.imprimirExtrato();
	}

}
