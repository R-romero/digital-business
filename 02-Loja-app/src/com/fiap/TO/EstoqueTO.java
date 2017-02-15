package com.fiap.TO;

import java.io.Serializable;
import java.text.DecimalFormat;

@SuppressWarnings("serial")
public class EstoqueTO implements Serializable {
	
	private int cod;
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	private String nome;
	private double preco_unit;
	private int qtd_estoque;
	

	
	public EstoqueTO(int cod, String nome, double preco_unit, int qtd_estoque) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.preco_unit = preco_unit;
		this.qtd_estoque = qtd_estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco_unit() {
		return preco_unit;
	}

	public void setPreco_unit(double preco_unit) {
		this.preco_unit = preco_unit;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	
	@Override
	public String toString(){
		DecimalFormat df = new DecimalFormat("R$#,###.00");
		return "Nome:" + getNome() + "\n" +
				   "Preço Unitário:" + df.format(getPreco_unit()) + "\n" +
				   "Quantidade em Estoque:" + getQtd_estoque();
	}

	}
	
