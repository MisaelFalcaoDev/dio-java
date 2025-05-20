
public class ContaPoupanca extends Conta {

	double taxaRendimento = 0.05f;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void renderJuros(Conta conta) {
		double rendimento = conta.saldo * taxaRendimento;
		conta.saldo += rendimento;
	}


	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
