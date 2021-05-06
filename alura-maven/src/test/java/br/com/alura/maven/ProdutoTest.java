package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void testPrice() {
		Produto produto = new Produto("JUICE", 10.0);
		assertEquals(11.0, produto.getPrecoComJuros());
		
	}
	
}
