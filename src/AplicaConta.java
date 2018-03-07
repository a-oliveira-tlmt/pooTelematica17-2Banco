import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AplicaConta{
	static int op;
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList <ContaPoupanca> contaspoupanca = new ArrayList<ContaPoupanca>();
	static ArrayList <ContaCorrente> contascorrente = new ArrayList<ContaCorrente>();
	
	private static void mostraData(){
		Date hoje = new Date();
		String formato = "E dd/MM/yyyy HH : mm";
		SimpleDateFormat formatter = new SimpleDateFormat(formato);
		System.out.println("\n\t\tHoje eh: "+ formatter.format(hoje));
	}
	
	private static void menuCorrente(){
			mostraData();	
			String menuCorrente = "\n\t\t1 - Criar conta corrente\n\t\t2 - Creditar\n\t\t3 - Debitar\n\t\t4 - Saldo\n\t\t5 - Listar contas corrente\n\t\t6 - Excluir conta\n\t\t0 - Voltar\n";
			System.out.println(menuCorrente);		
			System.out.print("\n\t\tEntre com a opcao: ");
			int opcao = sc.nextInt();
			switch(opcao){
			   case 1:	
				System.out.print("\t\tNovo titular: ");
				String nome = sc.next();
				System.out.print("\t\tNumero da conta: ");
				int num = sc.nextInt();
				contascorrente.add(new ContaCorrente(num, nome));
				System.out.println("\t\tOperacao realizada de com sucesso !");
				break;					
			   case 2:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				System.out.print("\t\tQuantia: ");
					double quantia = sc.nextDouble();
				for(ContaCorrente c: contascorrente){
					if(num == c.numero){
						c.depositar(quantia);
						System.out.println("\t\tOperacao realizada com sucesso !");
					}
				}
				break;
			   case 3:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				for(ContaCorrente c: contascorrente){
					if(num == c.numero){
						System.out.print("\t\tQuantia: ");
						quantia = sc.nextDouble();		
						c.sacar(quantia);
					}
				}
				break;
			   case 4:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				for(ContaCorrente c: contascorrente){
					if(num == c.numero)
					System.out.println("\t\tSeu saldo eh de: " + c.obterSaldo());
				}
				break;
			   case 5:
				System.out.println("\t\t============== CONTAS CORRENTES CADASTRADAS ============");
				for(ContaCorrente c: contascorrente)
				   System.out.print("\t\tNome: " + c.titular + "\n\t\tNumero: " + c.numero + "\n\t\tData: "+ c.data + "\n\t\t-----------------\n");
				break;
				case 6:
					System.out.print("\t\tEntre com o numero da sua conta: ");
					num = sc.nextInt();
					for(ContaCorrente c: contascorrente){
						if(c.numero == num)
							contascorrente.remove(c);
					}
					break;
			  case 0:
				menuPrincipal();
				break;
		 	  default:System.out.println("\t\tOperacao invalida !");
			}
	}
			
	private static void menuPoupanca(){
		mostraData();
		String menuPoupanca = "\n\t\t1 - Criar conta poupanca\n\t\t2 - Creditar\n\t\t3 - Debitar\n\t\t4 - Saldo\n\t\t5 - Aplicar rendimentos\n\t\t6 - Listar contas poupanca\n\t\t7 - Ver aniversario\n\t\t8 - Excluir poupanca\n\t\t0 - Voltar\n";
		System.out.println(menuPoupanca);
		System.out.print("\n\t\tEntre com a opcao: ");
		int opcao = sc.nextInt();
		switch(opcao){
			case 1:
				System.out.print("\t\tNovo titular: ");
				String nome = sc.next();
				System.out.print("\t\tNumero da conta: ");
				int num = sc.nextInt();
				contaspoupanca.add(new ContaPoupanca(num, nome));
				System.out.println("\t\tOperacao realizada de com sucesso !");					
				break;
			case 2:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				System.out.print("\t\tQuantia: ");
				double quantia = sc.nextDouble();
				for(ContaPoupanca c: contaspoupanca){
					if(num == c.numero){
						c.depositar(quantia);
						System.out.println("\t\tOperacao realizada com sucesso !");
					}
				}
				break;
			case 3:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				System.out.print("\t\tQuantia: ");
				quantia = sc.nextDouble();		
				for(ContaPoupanca c: contaspoupanca){
					if(num == c.numero){
						c.sacar(quantia);
					}
				}
			break;
			case 4:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				for(ContaPoupanca c: contaspoupanca){
					if(num == c.numero){
						System.out.println("\t\tSeu saldo eh de: " + c.obterSaldo());
					}
				}
				break;
			case 5:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				for(ContaPoupanca c: contaspoupanca){
					if(num == c.numero){
						c.aplicarRendimentos();
						System.out.println("\t\tOperacao realizada com sucesso !");
					}
				}
				break;
			case 6:
				System.out.println("\t\t============== POUPANCAS CADASTRADAS ===============");
				for(ContaPoupanca c: contaspoupanca)
					System.out.print("\t\tNome: " + c.titular + "\n\t\tNumero: " + c.numero + "\n\t\tData: " + c.data + "\n\t\t----------------\n");
				break;
			case 7:
				System.out.print("\t\tNumero da conta: ");
				num = sc.nextInt();
				for(ContaPoupanca c: contaspoupanca){
					if(num == c.numero){
						System.out.println("\t\tAniversario: " + c.data);
					}
				}
				break;
			case 8:
				System.out.print("\t\tEntre com o numero da sua conta: ");
				num = sc.nextInt();
				int cont = 0;
				for(ContaPoupanca c: contaspoupanca){
					if(c.numero == num)
						contaspoupanca.remove(cont);
						cont++;
				}
				break;		
			case 0:
				menuPrincipal();
				break;
			default:System.out.println("\t\tOpcao invalida !");
			}
	}
		
	private static int menuPrincipal(){
		mostraData();
		String menu = "\n\t\t1 - Conta Corrente\n\t\t2 - Conta Poupanca\n\t\t0 - Sair\n";	
		System.out.println(menu);
		System.out.print("\t\tEntre com a opcao: ");		
		op = sc.nextInt();
		
		return op;
	}
	
	public static void main(String[] args){
		menuPrincipal();
		do{
		  switch(op){
			case 1:
				menuCorrente();break;
			case 2:
				menuPoupanca();break;
			case 0:
				break;
			default:System.out.println("\t\tOpcao invalida !");
			}
		}while(op != 0);	  
		System.exit(0);
	}
}