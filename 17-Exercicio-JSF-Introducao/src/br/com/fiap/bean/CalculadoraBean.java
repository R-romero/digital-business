package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraBean {
	private int n1;
	private int n2;
	private int res;
	
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	
	public void calculaRes(){
		res = n1+n2;
	}
	
}
