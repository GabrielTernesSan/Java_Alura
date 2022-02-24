
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta contaDaIsa = new Conta();
		contaDaIsa.deposita(100);
		System.out.println(contaDaIsa.saca(200));
		System.out.println(contaDaIsa.getSaldo());
		
		/* 
		 * Não mexer com atributos, sempre com os métodos
		 * Fica negativo
		 * contaDaIsa.saldo -= 101;
		 * System.out.println(contaDaIsa.saldo);
		 */
	}
}
