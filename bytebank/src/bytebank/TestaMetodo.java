package bytebank;

public class TestaMetodo {
	public static void main(String []args) {
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.saldo = 100;
		contaDoGabriel.deposita(50);
		System.out.println(contaDoGabriel.saldo);
		
		String resultadoOperacao = contaDoGabriel.saca(20);
		System.out.println(resultadoOperacao);
		System.out.println(contaDoGabriel.saldo);
		
		Conta contaMauro = new Conta();
		contaMauro.deposita(1000);
		
		String resultadoOperacaoTransfere = contaMauro.tranfere(300, contaDoGabriel);
		System.out.println(resultadoOperacaoTransfere);
		System.out.println(contaDoGabriel.saldo);
		
		contaDoGabriel.titular = "Gabriel Ternes";
		System.out.println(contaDoGabriel.titular);
		}
}
