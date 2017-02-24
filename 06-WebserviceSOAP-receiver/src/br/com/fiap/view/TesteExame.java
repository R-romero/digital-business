package br.com.fiap.view;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalcularExame;
import br.com.fiap.bo.CursoBOStub.CalcularExameResponse;

public class TesteExame {

	public static void main(String[] args) {
		try{
			CursoBOStub stub = new CursoBOStub();
			
			CalcularExame valores = new CalcularExame();
			valores.setMedia(5);
			valores.setExame(7);
			
			CalcularExameResponse response = stub.calcularExame(valores);
			System.out.println(response.get_return());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
