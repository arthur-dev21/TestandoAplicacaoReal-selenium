package br.com.arthur.pages;

import br.com.arthur.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarTela_InserirConta(){
        clicarLink("Contas");
        clicarLink("Adicionar");
    }
}
