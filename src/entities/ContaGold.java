package entities;

public class ContaGold extends Conta {

	public ContaGold(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void sacar(double valor) {
			saldo -= valor; // contas gold nao possuem taxa de 5% e podem sacar o quanto quiser.
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Gold ===");
		super.imprimirInfosComuns();
	}

}
