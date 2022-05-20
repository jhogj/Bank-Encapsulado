
public class TesteValores {

	public static void main(String[] args) {
		Conta conta = new Conta (1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta (1337, 16549);
		
		System.out.println(Conta.getTotal());
		//no caso acima a conta ta inconsistente, pois retorna 0, mesmo 
		//tendo limitado a conta a não ser 0 ou numero negativo.
		//para resolver isso, tem que editar em "CONTA" o construtor
		
	}
}
