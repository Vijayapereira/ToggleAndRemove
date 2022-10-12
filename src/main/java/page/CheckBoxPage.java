package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage{
	
	WebDriver driver;
	
	public CheckBoxPage(WebDriver driver) {
		
		this.driver = driver;
	}
	//WebElements List
	//Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement CheckAllBox;
	
	
	//Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']") WebElement RemoveButton;
	
	@FindBy(how = How.XPATH, using = "//div[@id=\"todos-content\"]/form/ul/li") WebElement ToDoList;
	
	public void toggleAll() {
		CheckAllBox.click();
		
	}
	
	public void toDoList() {
		ToDoList.isSelected();
	}
	
	
	public void removeButton() {
		RemoveButton.click();
		
	}
	
	public List<String> getListOfCheckBox(){
		
		List<String> list = new ArrayList<String>();
		
		List<WebElement> columnDataElement = driver.findElements(By.xpath("//*[@id=\"todos-content\"]/form/ul/li[2]"));
		
		for(int i = 0; i < columnDataElement.size(); i++ ) {
			list.add(i, columnDataElement.get(i).getText());
			
		}
		return list;
			
			
			
		
	}
}
