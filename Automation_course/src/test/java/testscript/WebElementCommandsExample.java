package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WebElementCommandsExample extends Base{
	public void getTotal()
	{
		String valueA = "6";
		String valueB = "8";
		WebElement inputfieldA=driver.findElement(By.xpath("//input[@id='value-a']"));
		inputfieldA.sendKeys(valueA);
		WebElement inputfieldB=driver.findElement(By.xpath("//input[@id='value-b']"));
		inputfieldB.sendKeys(valueB);
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));
		getTotalButton.click();
		 
		int actualTotal = Integer.parseInt(valueA)+Integer.parseInt(valueB);
		
		WebElement totalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalValueText = totalText.getText();
		totalValueText = totalValueText.substring(14);
		int totalValue = Integer.parseInt(totalValueText);
		
		if(totalValue == actualTotal) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test fail");
		}
		
		

	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommandsExample webelementcommandsexample=new WebElementCommandsExample();
		webelementcommandsexample.initializeBrowser();
		webelementcommandsexample.getTotal();
		

	}

}
