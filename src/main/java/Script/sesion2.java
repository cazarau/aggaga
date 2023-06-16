package Script;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import poms.Googlepages;

public class sesion2 {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",  "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);
		
		
	}
	
	@Test
	public void test () throws InterruptedException {
		driver.get("https://www.google.com/");
		Googlepages gp = new Googlepages(driver);
		Thread.sleep(3000);
		//Busqueda en google
		gp.typeOnSearchBar("Wikipedia");
		//click en primer resultado
		//gp.clickFirstResult();//funcion
		gp.clickResultById(1);
		//gp.printTitle()
		gp.print3();
		gp.print2();
		gp.print1();
	}
	
	@After
	public void teardown() {
		
		//driver.quit()
	}
	
	public void Sesion2() {
		//TODO Auto-generated constructor stub
	}
}