package Script;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import poms.Googlepages;

public class sesion1 {
		
private WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		Googlepages gp = new Googlepages(driver);
		Thread.sleep(3000);
		gp.typeOnSearchBar("Nintendo wikipedia");
		
		//busqueda google
		Thread.sleep(1000);
		gp.clickFirstResult();
		gp.printFirstResult();
		
	}
	
	@After
	public void teardown() {
		
		//driver.quit();
	}
}