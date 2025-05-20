
public class Main {

	public static void main(String[] args) {
		Cliente misael = new Cliente();
		misael.setNome("Misael");
		misael.setCpf("123.456.789-00");

		Conta cc = new ContaCorrente(misael);
		Conta poupanca = new ContaPoupanca(misael);

		cc.depositar(1000);
		cc.transferir(150, poupanca);
		
		ContaPoupanca rendimento = new ContaPoupanca(misael);
		rendimento.renderJuros(poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
