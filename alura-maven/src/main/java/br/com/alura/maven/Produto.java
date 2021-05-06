package br.com.alura.maven;

public class Produto {

	private String name;
	private double price;

	public Produto(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Object getPrecoComJuros() {
		return this.price * 1.10;
	}

}
