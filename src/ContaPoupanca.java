
public class ContaPoupanca extends Conta{

	private double variacao;

	public ContaPoupanca(int numero, String titular) {
		super(numero, titular);
		this.variacao = 0;
	}
	
	public boolean testaEstouro(float quantia){
		if(this.saldo - quantia < 0){
			System.out.println("Saldo Insuficiente. Permissão Negada.");
			return true;
		}
		else{
			System.out.println("Transação permitida.");
			return false;
		}
		
	}
	
	public boolean creditar(float){
		
		
		
	}
	
}
