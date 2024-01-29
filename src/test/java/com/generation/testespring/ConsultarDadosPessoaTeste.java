package com.generation.testespring;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.generation.testespring.pacote.BancoDeDadosFake;

public class ConsultarDadosPessoaTeste {

	@BeforeAll //Altes de todos os outros métodos
	static void configuraConexao() {
		BancoDeDadosFake.iniciarConexao();
	}
	
	//@BeforeEach - antes de cada método da classe
	//AfterEach - despois de cada método da classe
	
	@Test
	void validarDadosDeRetorno() {
		
		Assertions.assertTrue(true);
	}
	
	@AfterAll //depois de todos os métodos da classe
	static void finalizarConexao() {
		BancoDeDadosFake.finalizarConexao();
		System.out.println("rodou o finalizar conexao");
	}
}
