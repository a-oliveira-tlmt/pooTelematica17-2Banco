
public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public Pessoa(String n, int i, String cpfNovo) {
		this.nome = n;
		this.idade = i;
		this.cpf = cpfNovo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return this.nome + "- " + 
				this.idade + "- " + this.cpf;
	}
}
