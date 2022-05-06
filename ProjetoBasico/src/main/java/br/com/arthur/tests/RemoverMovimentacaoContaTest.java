package br.com.arthur.tests;

import br.com.arthur.core.Propriedades;
import br.com.arthur.pages.ContasPage;
import org.junit.Assert;
import org.junit.Test;

import br.com.arthur.core.BaseTest;
import br.com.arthur.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao(){
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}
}
