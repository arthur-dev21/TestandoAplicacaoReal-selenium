package br.com.arthur.pages;

import br.com.arthur.core.BasePage;
import org.openqa.selenium.By;

public class ContaPage extends BasePage {

    public void setNome(String nome){
        escrever("nome", nome);
    }

    public void clicarBotao_Salvar(){
        clicarBotao(By.xpath("//button[.='Salvar']"));
    }

    public String obterMensagem_Sucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }
}
