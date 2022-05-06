package br.com.arthur.tests;

import br.com.arthur.core.Propriedades;
import org.junit.Assert;
import org.junit.Test;

import br.com.arthur.core.BaseTest;
import br.com.arthur.pages.HomePage;
import br.com.arthur.pages.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}
}
