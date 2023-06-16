package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TAP {
	
		WebDriver driver;
		String alertButtonXpath = "//button[text()='Click Me']";
		String filexXpath = "//select[@name='files']";
		String speedXpath = "//select[@name='speed']";

	public TAP(WebDriver driver) {
		
		super();
		this.driver = driver;

}
	public void clickAlertButton() {
		
		WebElement button = this.driver.findElement(By.xpath(this.alertButtonXpath));
		button.click();
	}
	
	public void acceptAlert() {
		
		this.driver.switchTo().alert().accept();
	}
	
	public String selectCheckBoxByText(String option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(filexXpath)));
		cb.selectByVisibleText(option);
		return value;
	}
	 
	public String selectCheckBoxByIndex(String string) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(speedXpath)));
		
		return value;
}
	
}
