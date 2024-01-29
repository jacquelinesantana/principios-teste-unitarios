package com.generation.testespring;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.generation.testespring.model.Pessoa;

public class ExceptionsTeste {

	//testar exceções, vai testar se o exception esta sendo retornado
	@Test
	void validarCenarioComExcecao() {
		Pessoa x = new Pessoa("José", LocalDate.of(2023, 1, 1));
		//assertDoesNotThrow(() -> 	x.getIdade()); validar que não vai cair na exception
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		x.getIdade());
	}

}
