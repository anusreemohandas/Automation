package testscript;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	
	public void fileUploadUsingSendKeys(WebElement element,String filepath)
	{
		element.sendKeys(filepath);
	}
	public void fileUploadUsingRobotClass(WebElement element,String filepath)
	{
		element.click();
		
	}

}
