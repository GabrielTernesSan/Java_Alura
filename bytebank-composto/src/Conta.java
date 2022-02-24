

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public String saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return "Operação realizada com sucesso!!";
		} else {
			return "Saldo insuficiente!";
		}
	}
	
	public String tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return "Operação realizada com sucesso!!";
		} else {
			return "Saldo insuficiente!";
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
