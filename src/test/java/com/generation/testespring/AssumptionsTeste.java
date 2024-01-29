package com.generation.testespring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class AssumptionsTeste {

	@Test
	void validarAlgoSomenteNoUsuarioX() {
		//Assumptions.assumeTrue("tijac".equals("tijacx")); só executa se a condição for falsa
		Assumptions.assumeTrue("tijac".equals("tijacx"));
		//aqui a ideia é ele só faz o assertions se o usuario da maquina for o escrito acima
		Assertions.assertEquals(10, 5);
		
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "USER", matches = "tijacque")//condição para entrar no método
	void validarAlgoSomenteSe() {
		Assertions.assertEquals(8, 4);
	}
	
	@Test
	@DisabledIfEnvironmentVariable(named = "USER", matches = "tijacque")//condição para entrar no método
	void validarAlgoSomenteSeDois() {
		Assertions.assertEquals(8, 4);
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)//condição para entrar no método apenas se estiver em windows
	void validarAlgoSomenteSeTres() {
		Assertions.assertEquals(8, 8);
	}
	
	@Test
	@EnabledOnOs({OS.WINDOWS, OS.LINUX})//condição para entrar no método apenas se estiver em windows
	void validarAlgoSomenteSeQuatro() {
		Assertions.assertEquals(8, 8);
	}
	
	
}
