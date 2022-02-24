package br.com.bytebank.banco.test;

import java.util.ArrayList;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		//Inicializa o array com os valores default de cada tipo
		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}

	}

}
