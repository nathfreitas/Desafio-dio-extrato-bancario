package Defaut;

public class Main {

	public static void main(String[] args) {
		Cliente Maria = new Cliente();
		Maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(Maria);
			cc.depositar(200);
			
		Conta poupanca = new ContaPoupanca(Maria);

			cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
