
public class TestaBanco {
	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.nome = "Gabriel Ternes";
		gabriel.cpf = "111.111.111-11";
		gabriel.profissao = "Javeiro";
		
		
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.deposita(1000); 
		
		
		contaDoGabriel.titular = gabriel;
		System.out.println(contaDoGabriel.titular.nome);
	}
}
