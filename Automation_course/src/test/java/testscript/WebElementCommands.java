package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	public void commands()
	{
		String input="Hello";
		WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputtextfield.sendKeys(input);
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(showmessagebutton));
		
		showmessagebutton.click();
		WebElement yourmessagetext=driver.findElement(By.xpath("//div[@id='message-one']"));
		String messagetext=yourmessagetext.getText();
		String backgroundcolorofshowmessagebutton=showmessagebutton.getCssValue("background-color");
		if(messagetext.equals(input))
		{
			System.out.println("Test case success");
		}
		else
		{
			System.out.println("Test case failed");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.commands();
		webelementcommands.driverQuit();
		

	}

}
