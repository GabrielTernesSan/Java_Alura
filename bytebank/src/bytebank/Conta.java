package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public String saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return "Opera��o realizada com sucesso!!";
		} else {
			return "Saldo insuficiente!";
		}
	}
	
	public String tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return "Opera��o realizada com sucesso!!";
		} else {
			return "Saldo insuficiente!";
		}
	}
}
