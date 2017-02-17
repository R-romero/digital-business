package br.com.fiap.bo;

import java.util.HashMap;

import com.fiap.TO.EstoqueTO;

public class EstoqueBO {
	
	private static HashMap<Integer, EstoqueTO> banco;

	public EstoqueBO(){
		banco = new HashMap<>();
		banco.put(401, new EstoqueTO(401, "Camiseta Masculina Manga Curta Branca", 12.50, 10));
		banco.put(402, new EstoqueTO(402, "Camiseta Masculina Manga Curta Rosa", 15.50, 7));
	}
	
	public EstoqueTO ConsultarProduto(int codProduto){	
		return banco.get(codProduto);
	}
}