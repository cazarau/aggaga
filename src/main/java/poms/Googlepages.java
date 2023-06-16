package poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
	public class Googlepages {
		WebDriver driver;
		String searchBarId = "APjFqb"; 
		String firstResult = "//h3[text()='Wikipedia']";
		String secondResult = "//h3[text()= 'Nintendo - Wikipedia']";
		String searchBarId1 = "mw-page-title-main"; 
		String resultsClass = "//h3[@class='LC20lb MBeuO DKV0Md']";
		
		public Googlepages(WebDriver driver) {
			super();
			this.driver = driver;
		}
		
		public Googlepages() {
			//Todo auto-generated constructor stub
		}
	public void typeOnSearchBar(String value) {
		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	public void clickFirstResult() {
		WebElement fr = driver.findElement(By.xpath(firstResult));
		fr.click();
	}

	public void printFirstResult() {
		// TODO Auto-generated method stub
		WebElement fr = driver.findElement(By.xpath(firstResult));
		System.out.println(fr.getText());
	}

	public void clickSecondResult() {
		WebElement fr = driver.findElement(By.xpath(secondResult));
		fr.click();
	}

	public void printSecondResult() {
		// TODO Auto-generated method stub
		WebElement searchBar = driver.findElement(By.className(searchBarId1));
		System.out.println(searchBar.getText());
	}

	public void clickResultById(int i) {
		 List <WebElement> list = driver.findElements(By.xpath(resultsClass));
		list.get(i).click();
		
	}

	public void print3() {
		// TODO Auto-generated method stub
	}
	public void print2() {
		// TODO Auto-generated method stub
	}	
	public void print1() {
		//TODO Auto-generated method stub
	}
		
	}

