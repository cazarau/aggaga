package poms;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class NewWindow {
	    private WebDriver driver;

	    public NewWindow(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void select() {
	        driver.findElement(By.linkText("New Window")).click();
	    }

	    public void goToWindow(String windowTitle) {
	        for (String windowHandle : driver.getWindowHandles()) {
	            driver.switchTo().window(windowHandle);
	            if (driver.getTitle().equals(windowTitle)) {
	                break;
	            }
	        }
	    }
	}