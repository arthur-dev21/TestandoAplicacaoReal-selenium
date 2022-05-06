package br.com.arthur.core;

import java.io.File;
import java.io.IOException;

import br.com.arthur.pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	@Rule
	public TestName testName = new TestName();
	private  LoginPage page = new LoginPage();

	@Before
	public  void inicializa(){
		page.acessarTelaInicial();

		page.setEmail("arthurkenned21@gmail.com");
		page.setSenha("123");
		page.entrar();
	}



	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			DriverFactory.killDriver();
		}

	}

}
