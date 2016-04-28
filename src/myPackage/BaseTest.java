package myPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	public static ThreadLocal<AndroidDriver> dr = new ThreadLocal<AndroidDriver>();

	static String device1="motorola-xt1022-ZX1B3233FJ";
	static String device2="huawei-chm_u01-4C2YVP157X011379";
	
	@BeforeClass
	@Parameters("deviceName")
	public void beforeMethod(String deviceName) throws MalformedURLException {

		try {
			if (deviceName.equals("motorola-xt1022-ZX1B3233FJ")) {
				AndroidDriver driver = null;
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setCapability("browserName", "Android");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("platformVersion", "4.4.4");
				capabilities.setCapability("udid", "ZX1B3233FJ");
				capabilities.setCapability("deviceName", deviceName);
				capabilities.setCapability("app",
						"E:\\Automation_Projects\\AppiumParallel\\App\\SSC_BPD-Container.apk");
				capabilities.setCapability("app-package", "com.SSC_BPD-Container");
				capabilities.setCapability("app-activity", "com.SSC_BPD-Container.Main");
				URL serverAddress = new URL("http://localhost:4444/wd/hub");
				driver = new AndroidDriver(serverAddress, capabilities);
				setDriver(driver);

			}

			if (deviceName.equals("huawei-chm_u01-4C2YVP157X011379")) {

				AndroidDriver driver = null;
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setCapability("browserName", "Android");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("platformVersion", "4.4.2");
				capabilities.setCapability("udid", "4C2YVP157X011379");
				capabilities.setCapability("deviceName", deviceName);
				capabilities.setCapability("app",
						"E:\\Automation_Projects\\AppiumParallel\\App\\SSC_BPD-Container.apk");
				capabilities.setCapability("app-package", "com.SSC_BPD-Container");
				capabilities.setCapability("app-activity", "com.SSC_BPD-Container.Main");
				URL serverAddress = new URL("http://localhost:4444/wd/hub");
				driver = new AndroidDriver(serverAddress, capabilities);
				setDriver(driver);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/*
	 * public void AfterMethod(){ getDriver().quit(); dr.set(null); }
	 */

	public AndroidDriver getDriver() {
		return dr.get();
	}

	public void setDriver(AndroidDriver driver) {

		dr.set(driver);
	}
	
}
