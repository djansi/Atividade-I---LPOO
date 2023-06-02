package estudo1;

public class teste {
	
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ();
		Cliente cliente2 = new Cliente();
		
		Conta conta = new Conta ();
		Conta conta2 = new Conta ();
		
		
		
		
						
		
							
		      //INSERÇÕES
						//JOAO
						cliente.inserirnome("João Paulo");
						cliente.inserirdata ("01/02/1980");
						cliente.inserirtipoconta("M");
						cliente.inserirtel(91234432);
						
						conta.inserirnumero(4321-9);
						conta.inserirtitular("João Paulo");
						conta.inserirtipoconta("Conta Corrente");
						conta.inserirsaldo(1245);
						
						
						//MARIA
						cliente2.inserirnome("Antonia Silva");
						cliente2.inserirdata ("20/08/1988");
						cliente2.inserirtipoconta("F");
						cliente2.inserirtel(998677689);
						
						conta2.inserirnumero(4345-5);
						conta2.inserirtitular("Antonia Silva");
						conta2.inserirtipoconta("Conta Corrente");
						conta2.inserirsaldo(3450);
						
						
			
				//CONSULTAS
						//JOAO
						System.out.println ("\nNome: " + cliente.nome);
						System.out.println ("Data de Nascimento: " + cliente.data);
						System.out.println ("Sexo: " + cliente.sexo);
						System.out.println ("Telefone: " + cliente.telefone);
						
						System.out.println ("Numero Conta: " + conta.numero);
						System.out.println ("Titular Conta: " + conta.titular);
						System.out.println ("Tipo Conta: " + conta.tipoconta);
						System.out.println ("Saldo: " + conta.saldo);
						
						
						
						//MARIA
						System.out.println ("\nNome: " + cliente2.nome);
						System.out.println ("Data de Nascimento: " + cliente2.data);
						System.out.println ("Sexo: " + cliente2.sexo);
						System.out.println ("Telefone: " + cliente2.telefone);
						
						System.out.println ("Numero Conta: " + conta2.numero);
						System.out.println ("Titular Conta: " + conta2.titular);
						System.out.println ("Tipo Conta: " + conta2.tipoconta);
						System.out.println ("Saldo: " + conta2.saldo);
						
						
						
						
						
						
					
						
		
		
		
		
		
		
		
		
		
	
		
		
		

		
		
		
		

	}

}
