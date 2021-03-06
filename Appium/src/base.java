import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	//public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver;

		File f=new File("src");
	File fs=new File(f, "ApiDemos-debug.apk");
	//	File fs=new File(f, "General-Store.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AppTestEmulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		//AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;

	}

}
