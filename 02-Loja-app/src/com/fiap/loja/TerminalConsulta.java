package com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.fiap.TO.EstoqueTO;

import br.com.fiap.config.PropertySingleton;


public class TerminalConsulta {

	public static void main(String[] args) {

		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dataHoje = Calendar.getInstance();
		
		
		System.out.println(PropertySingleton.getInstance().getProperty("filial") + formataData.format(dataHoje.getTime()));
		System.out.println("*******************************");
		
		System.out.println("Digite o codigo do produto:");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		EstoqueBO estBo = new EstoqueBO();
		EstoqueTO to = estBo.ConsultarProduto(codigo);
		System.out.println(to);
		
		sc.close();
	}

}
