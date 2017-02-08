package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/***
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class Console {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Data para o laoyout da aplicação
		Calendar dataHoje = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("FIAP            " + sdf.format(dataHoje.getTime()));
		System.out.println("***************************");
		System.out.print("Digite o código:");
		//Lê o código inserido pelo usuário
		int codigo = scanner.nextInt();
		switch (codigo) {
		case 401:
			System.out.println("Camiseta Masculina Manga Curta Branca");
			break;
		case 402:
			System.out.println("Camiseta Feminina Manga Longa Rosa");
			break;
		default:
			System.out.println("Produto não cadastrado!");
			break;
		}
		
		scanner.close();
	}
	
}
