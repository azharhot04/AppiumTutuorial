import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browsr extends BaseChrom {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities("emulator");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.get("http://google.com");

		
		
		/*
		 * driver.get("http://facebook.com");
		 * driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("9943778544");
		 * driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("vectorfly"
		 * ); driver.findElementByXPath("//button[@name='login']").click();
		 */
		 
		 
		
		  driver.get("http://cricbuzz.com");
		  driver.findElementByXPath("//a[@href='#menu']").click();
		  driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		  System.out.println(driver.getCurrentUrl()); 
		  JavascriptExecutor jse=(JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,400)","");
		  Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Top Stories')]")).getAttribute("class").contains("header"));
		 
	}

}
