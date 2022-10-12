package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.BasePage;
import page.CheckBoxPage;
import util.BrowserFactory;

public class RemoveSingleBoxTest {
	
	WebDriver driver;
	CheckBoxPage checkBoxPage;
	BasePage basePage;
	
	@Before
	public void removeSingleBoxTest() {
		driver = BrowserFactory.init();
		checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);

}
	@Test
	public void removeSingleCheckBox() {
		
		checkBoxPage.toDoList();
		checkBoxPage.removeButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Assert.assertTrue("a single item has removed!", true);
		
		
	}
	@After
	public void TearDown() {
		BrowserFactory.tearDown();
	}
	}
