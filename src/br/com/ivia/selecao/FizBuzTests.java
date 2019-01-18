package br.com.ivia.selecao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizBuzTests {	
	
	static int x = 0;
	static int unidade = 37;
	static int dezena = 60;
	static int dezenas = 10*(7+7+7+8+9+8+6+5) + 8*9 + 9*unidade + dezena;
	static int centenas = 100*(9+9+9+9+10+12+9+8) + 99*(9+5) + 10*dezenas + 3;
	//1035 4598
	
	@Test
	public void RetornarMil() {
		x = centenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto20", result);		
	}
	
	@Test
	public void RetornarNovecentos() {
		x = 100*(9+9+9+9+10+12+9+8) + 99*(9+5) + 10*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto19", result);
	}
	
	@Test
	public void RetornarOitocentos() {
		x = 100*(9+9+9+10+12+9+8) + 99*(8+5) + 9*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto18", result);
	}
	
	@Test
	public void RetornarSetecentos() {
		x = 100*(9+9+10+12+9+8) + 99*(7+5) + 8*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto17", result);
	}
	
	@Test
	public void RetornarSeiscentos() {
		x = 100*(9+10+12+9+8) + 99*(6+5) + 7*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto16", result);
	}
	
	@Test
	public void RetornarQuinhentos() {
		x = 100*(10+12+9+8) + 99*(5+5) + 6*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto15", result);
	}
	
	@Test
	public void RetornarQuatrocentos() {
		x = 100*(12+9+8) + 99*(4+5) + 5*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto14", result);
	}
	
	@Test
	public void RetornarTrezentos() {
		x = 100*(9+8) + 99*(3 + 5) + 4*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto13", result);			
	}
	
	@Test
	public void RetornarDuzentos() {
		x = 8*100 + 99*(2+5) + 3*dezenas + 3;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto12", result);	
	}
	
	@Test
	public void RetornarCem() {
		x = 3 + 99*(5 + 1) + 2*dezenas;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto11", result);		
	}
	
	@Test
	public void RetornarNoventa() {
		x = dezenas;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto10", result);
	}
	
	@Test
	public void RetornarOitenta() {
		x = 10*(7+7+8+9+8+6+5) + 7*9 + 8*unidade + dezena;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto9", result);
	}
	
	@Test
	public void RetornarSetenta() {
		x = 10*(7+8+9+8+6+5) + 6*9 + 7*unidade + dezena;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto8", result);
	}
	
	@Test
	public void RetornarSessenta() {
		x = 10*(8+9+8+6+5) + 5*9 + 6*unidade + dezena;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto7", result);
	}
	
	@Test
	public void RetornarCinquenta() {
		x = 10*(9+8+6+5) + 4*9 + 5*unidade + dezena;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto6", result);
	}
	
	@Test
	public void RetornarQuarenta() {
		x = 8*10 + 3*9 + 4*unidade + dezena + 10*(5+6);
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto5", result);
	}

	@Test
	public void RetornarTrinta() {
		x = 6*10 + 2*9 + 3*unidade + dezena + 5*10;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto4", result);
	}
	
	@Test
	public void RetornarVinte() {
		x = 5*10 + 9 + 2*unidade + dezena;
		Letras fb = new Letras();
		String result = fb.Retorno(x);
		assertEquals("Correto3", result);
	}
	
	@Test
	public void RetornarDezena() {
		Letras fb = new Letras();
		String result = fb.Retorno(unidade + dezena);
		assertEquals("Correto2", result);
	}
	
	@Test
	public void RetornarUnidade() {
		Letras fb = new Letras();
		String result = fb.Retorno(unidade);
		assertEquals("Correto",result);
	}
}