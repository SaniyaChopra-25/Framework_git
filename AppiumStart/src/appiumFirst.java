import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/*Important points:
	Go to above path to open an emulator C:\Users\Saniya.Chopra\AppData\Local\Android\Sdk\emulator
	1.Starting the emulator:  emulator -avd name of emulator
	2.To get the system information: systeminfo.exe 
	3.installing npm: npm install -g appium
	4.Starting appium server: appium
	5.Ctrl+C to stop Appium Server
	6. UI Automator only works when Appium server is stopped
	7.Android UI automator: We need to have attribute and value, in Java we cannot have "" inside other "" so we need to add \ before every"
    8.new UiSelector Class is the class for checking the properties  like clickable,checkable,focusable,checked, enabled, focused, scrollable,
    long clickable, selected.
      new UiSelector().clickable(true)
      Please note this is android code and is independent of an app.
    9.findElementByAndroidUIAutomator().size() to get the size of elements we are looking for 
   10. To open UI automator Viewer go to below path and select uiautomatorviewer C:\Users\Saniya.Chopra\AppData\Local\Android\Sdk\tools\bin
   11. For an app there are 2 things which are important Package and activity*/
public class appiumFirst {
	/* Step 1: We need all the capabilities
	   Step 2: We need to invoke the Emulator
	   Step 3: Add AutomationName:
	   Android updated its internal framework to uiautomator2 
	   and through Appium code, we need to tell that we need to access uiautomator2 elements of Android.
	   Step 4: We need to invoke the APP
	   Step 5: We need to have the connection to Appium Server*/

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		File f= new File("src");
		File fs= new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SaniyaEmulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
return driver;
	}

}
