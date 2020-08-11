import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		WebElement source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement Destination=driver.findElementsByClassName("android.view.View").get(1);
	
		TouchAction t=new TouchAction(driver);
		//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(Destination)).release().perform();
		t.longPress(element(source)).moveTo(element(Destination)).release().perform();

	}

 }
