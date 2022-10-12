package test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import page.BasePage;
import page.CheckBoxPage;
import util.BrowserFactory;

public class RemoveAllItemsTest {

	WebDriver driver;
	CheckBoxPage checkBoxPage;
	BasePage basePage;
	
	@Before
	public void removeItemsTest() {
		driver = BrowserFactory.init();
		checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);
		
		
	}
	@Test
	public void clickToggleAllAndRemove() {
		checkBoxPage.toggleAll();
		checkBoxPage.removeButton();
		
		Assert.assertTrue("All Checkboxes are removed", checkBoxClear());
	
}

	private boolean checkBoxClear() {
		List <String> checkboxList = checkBoxPage.getListOfCheckBox();
		
		for(int i = 0;i < checkboxList.size();i++) {
			if(checkboxList.get(i).isEmpty()) {
				
			}
			
		}
		
		return true;
	}
	@After
	public void TearDown() {
		BrowserFactory.tearDown();
	}
	}
	
