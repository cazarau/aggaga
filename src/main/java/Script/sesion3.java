package Script;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import poms.Googlepages;
import poms.TAP;


public class sesion3 {

	
private WebDriver driver;

	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);
		
	}
	
	
	@Test
	public void test() throws InterruptedException 	{
		driver.get("https:/www.google.com");
		Googlepages gp = new Googlepages(driver);
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		//Busqueda en google
		gp.typeOnSearchBar("test automation practice");
		//Click en primer resultado
		gp.clickResultById(0);
		//Click en boton para alerta
		tap.clickAlertButton();	
		//Acepta alerta
		Thread.sleep(1000);
		tap.acceptAlert();
	}
		
}