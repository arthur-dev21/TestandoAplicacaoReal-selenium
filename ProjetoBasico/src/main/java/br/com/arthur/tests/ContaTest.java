package br.com.arthur.tests;

import br.com.arthur.core.BaseTest;
import br.com.arthur.pages.ContaPage;
import br.com.arthur.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class ContaTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContaPage contaPage = new ContaPage();
    @Test
    public void testInserirConta(){
        menuPage.acessarTela_InserirConta();
        contaPage.setNome("Conta Test");
        contaPage.clicarBotao_Salvar();

        Assert.assertEquals("Conta adicionada com sucesso!",contaPage.obterMensagem_Sucesso());
    }
}
