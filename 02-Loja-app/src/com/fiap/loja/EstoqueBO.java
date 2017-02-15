package com.fiap.loja;

import com.fiap.TO.EstoqueTO;

public class EstoqueBO {
	
	
	public EstoqueTO ConsultarProduto(int codProduto){
		EstoqueTO to = null; 
		switch (codProduto) {
		case 401:
			return to = new EstoqueTO(401, "Camiseta Masculina Manga Curta Branca", 12.50, 10);
		case 402:
			return to = new EstoqueTO(402, "Camiseta Masculina Manga Curta Rosa", 15.50, 7);
		default:
			System.out.println("Produto não cadastrado!");
			break;
	}
		return to;
	
}
}