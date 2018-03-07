
import java.util.ArrayList;
import java.util.Date;

public class MinhaContaSimples {
	
	private String nome;
	private int numero;
	private double saldo;
	private ArrayList<String> registros;
	
	public MinhaContaSimples(String nomeDoCabocloDaConta,
			int n, double valorQualquer) {
		this.nome = nomeDoCabocloDaConta;
		this.numero = n;
		this.saldo = valorQualquer;
		this.registros = new ArrayList<String>();
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Saldo: " + this.saldo;
	}

	public void depositar(double i) {
		this.saldo = this.saldo + i;
		this.registros.add(new Date().toString() 
				+ "- Depositou " + i + " reais.");
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void transferir(MinhaContaSimples contaQualquer,
			double valorTransferido) {
		
		if (this.saldo >= valorTransferido) {
			this.saldo = this.saldo - valorTransferido;
			contaQualquer.depositar(valorTransferido);
			
			this.registros.add(new Date().toString() 
					+ "- Transferiu " + valorTransferido
					+ " reais para " + contaQualquer.getNome());
			
		
		} else {
			System.out.println("Voc� est� LISO!!");
		}
		
		
	}

	private String getNome() {
		return this.nome;
	}

	public void efetuarExtrato() {
		System.out.println("##################");
		System.out.println("Extrato de " + this.nome);
		
		for (String registro : this.registros) {
			System.out.println(registro);
		}
		
		System.out.println("###FIM DO EXTRATO###");
		
		
	}
	
	
}
