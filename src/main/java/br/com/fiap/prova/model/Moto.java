package br.com.fiap.prova.model;

public class Moto {

	private String cor;
	private double preco;
	private String modelo;
	private int aro;
	private String placa;
	private int ano;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public Moto(String cor, double preco, String modelo, int aro, String placa, int ano) {
	
		this.cor = cor;
		this.preco = preco;
		this.modelo = modelo;
		this.aro = aro;
		this.placa = placa;
		this.ano = ano;
	}
	
	
	
}

