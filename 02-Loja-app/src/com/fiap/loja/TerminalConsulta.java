package com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiap.TO.EstoqueTO;

import br.com.fiap.bo.EstoqueBO;
import br.com.fiap.config.PropertySingleton;


public class TerminalConsulta {
	//Implementing sfl4
		private static Logger log = LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		log.warn("Application START");
		
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Calendar dataHoje = Calendar.getInstance();
		
		
		System.out.println(PropertySingleton.getInstance().getProperty("filial") + formataData.format(dataHoje.getTime()));
		System.out.println("*******************************");
		log.debug("Usuário insere o código do produto desejado:");
		System.out.println("Digite o codigo do produto:");
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		EstoqueBO estBo = new EstoqueBO();
		log.debug("É consultado no banco a entry com o código indicado, armazenando-a em um TransferObject");
		EstoqueTO to = estBo.ConsultarProduto(codigo);
		log.debug("Caso o objeto retornado seja nulo, retorna-se um erro");
		if(to == null){
			log.error("Produto não registrado");
		}else{log.debug("Caso seja encontrado uma entrada equivalente no banco, retorna-se o toString @Override do TO");
			System.out.println(to);	
		}
		
		
		sc.close();
		log.warn("Application END");
	}

}
