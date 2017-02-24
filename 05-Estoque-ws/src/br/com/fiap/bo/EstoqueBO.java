package br.com.fiap.bo;

import java.util.HashMap;

import org.apache.axis2.AxisFault;

import br.com.fiap.inventario.Estoque;

public class EstoqueBO {
	
	private static HashMap<Integer, Estoque> banco;

	public EstoqueBO(){
		banco = new HashMap<>();
		banco.put(401, new Estoque(401, "Camiseta Masculina Manga Curta Branca", 12.50, 10));
		banco.put(402, new Estoque(402, "Camiseta Masculina Manga Curta Rosa", 15.50, 7));
	}
	
	public Estoque ConsultarProduto(int codProduto) throws AxisFault{	
			Estoque est = banco.get(codProduto);
		if(est == null){
			throw new AxisFault("Produto não encontrado");
		}
		return est;
	}
}