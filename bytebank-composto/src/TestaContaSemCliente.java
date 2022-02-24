
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoMauro = new Conta();
		
		contaDoMauro.titular = new Cliente();
		contaDoMauro.titular.cpf = "222.222.222-22";
		contaDoMauro.titular.nome = "Mauro";
		
		System.out.println(contaDoMauro.titular.nome);
		System.out.println(contaDoMauro.titular.cpf);
	}
}
