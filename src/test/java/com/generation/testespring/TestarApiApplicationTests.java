package com.generation.testespring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.generation.testespring.model.Pessoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

@SpringBootTest
class TestarApiApplicationTests {

	@Test
	@DisplayName("Valores iguais")
	void compararValores() {
		assertEquals(2, 2);
	}
	
	@Test
	@DisplayName("Nomes iguais")
	void CompararNomes() {
		assertEquals("Rita", "Rita");
	}
	
	@Test
	@DisplayName("Idade esta correta")
	void compararIdades() {
		Pessoa a = new Pessoa("Rita",LocalDate.of(2022, 1, 1));
		assertEquals(a.getIdade(), 2);
	}
	
	@Test
	void deveCalcularIdadeCorretamente() {
		//condição
		Pessoa j = new Pessoa("Jessica", LocalDate.of(1982, 5, 12));
		
		Assertions.assertEquals(41, j.getIdade() );
	}
	
	@Test
	void deveSerMaiorDeIdade() {
		Pessoa rita = new Pessoa("Rita", LocalDate.of(1982, 5, 12));
		Assertions.assertTrue(rita.getIdade()>=18);
		
		Pessoa joao = new Pessoa("João", LocalDate.of(2020, 5, 12));
		Assertions.assertFalse(joao.getIdade()>=18);
		
		
		
	}
	
	@Test
	void validarLancamentos() {
		int[] primeirosLancamentos = {10,20,30,40,50,60};
		int[] segundoLancamento = {10,20,30,40,50,60};
		int[] terceiroLancamento = {5,-1,6,70,10,150};
		
		//pergunta se o primeiro array é igual ao segundo passado nos parametros
		Assertions.assertArrayEquals(primeirosLancamentos, segundoLancamento);
		
		//pergunta se o primeiro array é não igual ao segundo passado nos parametros.
		Assertions.assertNotEquals(primeirosLancamentos, terceiroLancamento);
		
	}
	
	@Test
	void validarSeObjetoEstaNulo() {
		Pessoa pessoa = null;
		
		Assertions.assertNull(pessoa);
		
		pessoa = new Pessoa("Marley",LocalDate.of(2018, 01, 01));
		
		Assertions.assertNotNull(pessoa);
	}
	
	@Test
	void validarNumerosTiposDiferentes() {
		double valor1 = 5.0;
		
		float valor2 = 5.0f;
		
		Assertions.assertEquals(valor1, valor2);
	}
	

}
