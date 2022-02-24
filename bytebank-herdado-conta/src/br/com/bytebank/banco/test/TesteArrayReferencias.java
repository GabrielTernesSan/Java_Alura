package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		ContaPoupanca cc2 = new ContaPoupanca(11, 22);
		
		Cliente cliente = new Cliente();
		referencias[2]= cliente;
		
		referencias[0] = cc1;
		referencias[1] = cc2;
		System.out.println(referencias[0] + "\n" + referencias[1]);
		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
	
}
