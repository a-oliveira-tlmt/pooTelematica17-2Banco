

public class Principal {
	
	public static void main(String[] args) {
		MinhaContaSimples conta1 = 
				new MinhaContaSimples("joao", 1, 0);
		
		conta1.depositar(5000);
		
		MinhaContaSimples conta2 = 
				new MinhaContaSimples("maria", 2, 1000);
		
		conta1.transferir(conta2, 500);
		
		conta1.efetuarExtrato();
		
		conta2.efetuarExtrato();
		
//		System.out.println(conta1.getSaldo());
		
//		System.out.println(conta1.toString());
//		System.out.println(conta2.toString());
	}

}
