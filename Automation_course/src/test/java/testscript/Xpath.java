package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	public void xpathLocators()
	{
		WebElement radiobuttonsdemo=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement showselectedvaluebutton=driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement getresultsbutton=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement showmessage=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		WebElement showmessagebutton2=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement gettotal=driver.findElement(By.xpath("//button[@id='button-two']//ancestor::form"));
		WebElement divheadertop=driver.findElement(By.xpath("//div[@class='header-top']//child::div[@class='container']"));
		WebElement showmessagebuttonfollowing=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement showmessagebuttonpreceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div"));
		WebElement descendant=driver.findElement(By.xpath("//div[@class='form-group']//descendant::label"));
		WebElement entermessageinputfield=driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpath xpath=new Xpath();
		xpath.initializeBrowser();
		xpath.xpathLocators();
		xpath.driverQuit();

	}

}
