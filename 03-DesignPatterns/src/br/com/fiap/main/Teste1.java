package br.com.fiap.main;

import br.com.fiap.config.PropertySingleton;

public class Teste1 {

	public static void main(String[] args) {
		//Ler e exibir uma configuração
		System.out.println(PropertySingleton.getInstance().getProperty("mensagem"));

	}

}
