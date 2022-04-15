
public class TesteGetSet {
	
	public static void main(String[] args) {
		
		Conta conta= new Conta(42,1337);
		
		Conta conta2= new Conta(42,1337);
		Conta conta3= new Conta(42,1337);
		Conta conta4= new Conta(42,1337);
		
		//conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
	
	Cliente cliente = new Cliente();
	
	
	cliente.setNome("Avalon Nadotti");
	
	
	conta.setTitular(cliente);	

	System.out.println(conta.getTitular().getNome());
	
	System.out.println(Conta.getTotal());
	}
}
