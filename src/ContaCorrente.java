
public class ContaCorrente extends Conta{

	private double chequeEspecial;
	
	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
		this.chequeEspecial = 0;
	}
	
	public boolean testaEstouro(float quantia){
		if(this.saldo - quantia < this.chequeEspecial){
			System.out.println("Saldo Insuficiente. Permissão Negada.");
			return true;
		}
		else{
			System.out.println("Transação permitida.");
			return false;
		}
	}
	
	public void sacar(float quantia){
		
		if(!testaEstouro(quantia)){
			saldo -= quantia;
			//gerar log resposta
		}
		
	}
	
	public boolean transferir(double quantia, String destino){
		
		if(!testaEstouro(quantia)){
			//abrir conexao com o destino;
			//enviar Agencia e atribuir resposta a String agenciaAtiva;
			//if(agenciaAtiva == "OK"){
			   //enviar Conta e atribuir resposta a uma String contaAtiva;
			   //if(contaAtiva == "OK"){
			      //enviar Double.toString(quantia) e atribuir resposta a uma string Recebido;
			      //if(recebido == "OK")
			         //sacar(quantia);
			      //else{
			         //abortar operação - desfazer conexão
			      //}
			   
			
		}
		
		
		
	}
	
}
