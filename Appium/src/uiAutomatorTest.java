import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class uiAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
		int t =((FindsByAndroidUIAutomator) driver).findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println(t);


	}

}
