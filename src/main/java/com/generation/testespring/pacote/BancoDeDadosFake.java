package com.generation.testespring.pacote;

import java.util.logging.Logger;

public class BancoDeDadosFake {
	
	private static final Logger LOGGER = Logger.getLogger(BancoDeDadosFake.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciou conexao");
	}
	
	public static void finalizarConexao() {
		LOGGER.info("Finalizou a conexao");
	}

}
