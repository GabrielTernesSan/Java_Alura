
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(654354, 4564);
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
	
		Cliente gabriel = new Cliente();
		
		conta.setTitular(gabriel);
		gabriel.setNome("Gabriel Ternes");
		gabriel.setProfissao("Javeiro");
		
		conta.setTitular(gabriel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
	}
}
