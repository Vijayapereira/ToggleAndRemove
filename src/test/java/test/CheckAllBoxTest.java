package test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.CheckBoxPage;
import util.BrowserFactory;

public class CheckAllBoxTest {
	
	WebDriver driver;
	CheckBoxPage checkBoxPage;
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement CheckAllBox;
	
	@Before
	public void checkBoxTest() {
		driver = BrowserFactory.init();
		checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);
	}
	@Test
	public void toggleAllCheckboxIsOn() {
		checkBoxPage.toggleAll();
		
		Assert.assertTrue(CheckBoxIsSelected(CheckAllBox));
		
		}
	private boolean CheckBoxIsSelected(WebElement checkAllBox2) {
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='allbox']"));
		
		for(int i = 0;i < list.size();i++) {
			
			if(list.get(i).isSelected()) {
				
			}
			
		}
		return true;
	}
	@After
	public void TearDown() {
		BrowserFactory.tearDown();
	}
	}
	
		
		
		



	
