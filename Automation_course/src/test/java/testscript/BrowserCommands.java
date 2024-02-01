package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommands extends Base {
	public void browserCommands()
	{
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String pagesrc=driver.getPageSource();
	}
	public void navigationCommands()
	{
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserCommands browsercommands= new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommands();
		browsercommands.navigationCommands();
		//browsercommands.locators();
		browsercommands.driverQuit();
	
	}

}
