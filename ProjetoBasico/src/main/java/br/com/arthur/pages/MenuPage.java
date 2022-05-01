package br.com.arthur.pages;

import br.com.arthur.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarTela_inserirConta(){
        clicarLink("Contas");
        clicarLink("Adicionar");
    }

    public void acessarTela_listarContas(){
        clicarLink("Contas");
        clicarLink("Listar");
    }

    public void voltarTelaInicial(){
        clicarLink("Seu Barriga");
    }
}
