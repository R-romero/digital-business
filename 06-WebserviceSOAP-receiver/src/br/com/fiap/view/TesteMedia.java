package br.com.fiap.view;

import br.com.fiap.bo.CursoBOStub;
import br.com.fiap.bo.CursoBOStub.CalcularMedia;
import br.com.fiap.bo.CursoBOStub.CalcularMediaResponse;

public class TesteMedia {

	public static void main(String[] args) {
		try {
			CursoBOStub stub = new CursoBOStub();
			
			CalcularMedia calcM = new CalcularMedia();
			
			calcM.setAm(10);
			calcM.setNac(10);
			calcM.setPs(10);
			
			CalcularMediaResponse resp = stub.calcularMedia(calcM);
			System.out.println(resp.get_return());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
