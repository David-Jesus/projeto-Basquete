package Desafio_Publica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemporadaTest {

	Temporada teste = new Temporada();
	@Test
	void testNovoJogo() {
		assertTrue(teste.getJogo().size() == 4);
	}
	@Test
	void testgetPlacar() {
		assertTrue(teste.getPlacar().size() == 4);
	}
	@Test
	void testsgetRecordesMinimos() {
		assertTrue(teste.getRecordesMinimos() == 1);
	}
	@Test
	void testsgetRecordesMaximos() {
		assertTrue(teste.getRecordesMaximos() == 1);
	}

}
