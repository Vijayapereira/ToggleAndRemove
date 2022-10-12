package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement CheckAllBox;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		
	}
	public void explicitWait(WebElement element, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\\\"todos-content\\\"]/form/ul/li[1]")));
	}

}
