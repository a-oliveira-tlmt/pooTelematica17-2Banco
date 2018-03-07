import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta{
	protected int numero;
	protected double saldo;
	protected String titular;

	protected Date hoje = new Date();
	String formato = "dd/MM/yyyy";
	SimpleDateFormat formatter = new SimpleDateFormat(formato);
	protected String data = formatter.format(hoje);
	
	public Conta(int numero, String titular){ 
		this.numero = numero;
		this.saldo = 0;
		this.titular = titular;
		this.data = data;
	}
	public double obterSaldo(){
		return this.saldo;
	}
}