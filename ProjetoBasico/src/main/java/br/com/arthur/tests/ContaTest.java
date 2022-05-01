package br.com.arthur.tests;

import br.com.arthur.core.BaseTest;
import br.com.arthur.dadosTest.DadosConta;
import br.com.arthur.pages.ContasPage;
import br.com.arthur.pages.MenuPage;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void deve1_InserirConta(){
        menuPage.acessarTela_inserirConta();
        contasPage.setNome(DadosConta.contaAdcionar1);
        contasPage.salvar();
        Assert.assertEquals("Conta adicionada com sucesso!",contasPage.obterMensagemSucesso());
    }

    @Test
    public void deve2_AlterarConta(){
            menuPage.acessarTela_listarContas();
            contasPage.clicarAlterarConta(DadosConta.contaAdcionar1);
            contasPage.setNome(DadosConta.contaAlterar2);
            contasPage.salvar();

        Assert.assertEquals("Conta alterada com sucesso!",contasPage.obterMensagemSucesso());

    }
    @Test
    public void deve3_DeletarConta(){
        menuPage.acessarTela_listarContas();
        contasPage.clicarDeletarConta(DadosConta.contaAlterar2);
    }



}
