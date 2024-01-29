package com.generation.testespring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.DisplayName.class) //onde colocamos o @DisplayName e a ordenação sera pelo displayName(ordem crescente)
//@TestMethodOrder(MethodOrderer.Random.class) //ordem aleatória de execução dos métodos teste
//@TestMethodOrder(MethodOrderer.MethodName.class) //ordenar pelo nome do método ordem alfabetica
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//ordenar pelo caminho id passado no @order
public class EscolhendoOrdemTeste {
	//os métodos serão executados respeitando a ordenação dentro da anotação @Order(X)
	@Order(4)
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
	}
	
	@Order(3)
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
	}
	
	@Order(2)
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);
	}
	
	@Order(1)
	@Test
	void validaFluxoD() {
		Assertions.assertTrue(true);
	}

}
