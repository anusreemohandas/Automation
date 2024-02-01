package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorExample extends Base{
	public void locator()
	{
		//id
		WebElement selectallbutton=driver.findElement(By.id("button-two"));
		WebElement getfirstselected=driver.findElement(By.id("button-first"));
		WebElement getallselected=driver.findElement(By.id("button-all"));
		WebElement total=driver.findElement(By.id("message-two"));
		WebElement autoclosablebutton=driver.findElement(By.id("autoclosable-btn-success"));
		
		//classname
		WebElement headerelement=driver.findElement(By.className("card-header"));
		WebElement bodyelement=driver.findElement(By.className("card-body"));
		WebElement logo=driver.findElement(By.className("top-logo"));
		WebElement topsectionelement=driver.findElement(By.className("mb-sec"));
		WebElement section=driver.findElement(By.className("clearfix"));
		
		//linktext
		
		WebElement listboxelement=driver.findElement(By.linkText("List Box"));
		WebElement alertelement=driver.findElement(By.linkText("Alerts and Modals"));
		WebElement datepicker=driver.findElement(By.linkText("Date Pickers"));
		WebElement inputformelement=driver.findElement(By.linkText("Input Form"));
		WebElement home=driver.findElement(By.linkText("Home"));
		
		//partial link text
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocatorExample locatorexample=new LocatorExample();
		locatorexample.initializeBrowser();
		locatorexample.locator();
		locatorexample.driverQuit();

	}

}
