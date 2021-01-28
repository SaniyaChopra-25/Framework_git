import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Advanced extends realDeviceTest  {
	
	public static void main(String[] args) throws MalformedURLException {
	
	AndroidDriver <AndroidElement> driver= deviceCapability();
	
	driver.get("https://www.facebook.com/");
	driver.findElementByXPath("//button[@value='Log In']").click();
	driver.findElementByXPath("//input[@name='email']").sendKeys("saniyachopra18@gmail.com");
	driver.findElementByXPath("//input[@name='pass']").sendKeys("Jaisairam25@");
	driver.findElementByXPath("//button[@value='Log In']").click();
	

}
}