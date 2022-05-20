
public class testaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		//conta.setNumero(1337); não precisa mais pois o construtor foi 
		//definido na linha de cima
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("paulo silveira");	
		conta.setTitular (paulo);
		System.out.println(conta.getTitular().getNome());
		
		//alterar o nome do titular da conta
		
		conta.getTitular().setProfissao("programador");
		//isso aqui de cima é exatamente a msm coisa q isso de baixo:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		System.out.println(conta.getTitular().getNome());
	}
}
