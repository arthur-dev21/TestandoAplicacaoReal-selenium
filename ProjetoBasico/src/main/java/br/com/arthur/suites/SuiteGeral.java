package br.com.arthur.suites;

import br.com.arthur.core.BaseTest;
import br.com.arthur.core.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.arthur.pages.LoginPage;
import br.com.arthur.tests.ContaTest;
import br.com.arthur.tests.MovimentacaoTest;
import br.com.arthur.tests.RemoverMovimentacaoContaTest;
import br.com.arthur.tests.ResumoTest;
import br.com.arthur.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({

	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {

	

}
