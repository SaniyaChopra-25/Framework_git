import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;




public class gestures extends appiumFirst {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver= capabilities();
		//implicit timeout: Will check if the object is not present it will wait for desired time and then break
		//If application is too slow we can use Thread.Sleep
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("").click();
		/*new UiSelector Class is the class for checking the properties  like clickable,checkable,focusable,checked, enabled, focused, scrollable,
	    long clickable, selected.
	      new UiSelector().clickable(true)*/
		
		driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true");
//Tap: This is basic click that we do and is one form of gesture
//Touch Action is the class used for such gestures
		TouchAction t =new TouchAction(driver);
		WebElement expandList= driver.findElementByXPath("");
		//perform is important to do touch actions
		t.tap(tapOptions().withElement(element(expandList))).perform();
//Long press and open sub menu
		driver.findElementByXPath("").click();
		WebElement pn= driver.findElementByXPath("");
//It will long press an option for 2 seconds and then release it(Here the options are concatenated)
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
//Check if sub menu is visible
		System.out.println(driver.findElementById("").isDisplayed());
//Swipe: Here means long pressing at a particular position and moving the control to another position and then releasing it
	
		WebElement firstposition= driver.findElementByXPath("");
		WebElement secondposition= driver.findElementByXPath("");
		t.longPress(longPressOptions().withElement(element(firstposition)).withDuration(ofSeconds(2))).moveTo(element(secondposition)).release().perform();
		// Scrolling till a particular element say Web View
		//findElementByAndroidUIAutomator()"attribute=Value"
		//new UiScrollable(new UiSelector()).scrollIntoView(text(\"Web View\"))  : This is android API code
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Web View\"))");
		
// Drag and Drop
		t.longPress(longPressOptions().withElement(element(firstposition))).moveTo(element(secondposition)).release().perform();	
		//OR
		t.longPress(element(firstposition)).moveTo(element(secondposition)).release().perform();	
		
	}

}
