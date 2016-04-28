package myPackage;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Banking extends BaseTest {

	//This is testing application for git
	//This is testing application for git
	//This is testing application for git
	//This is testing application for git
	
	//This is testing application for git
	//This is testing application for git
	//This is testing application for git
	//This is testing application for git
	
	@Test(priority = 1)
	@Parameters({"deviceName"})
	public void Menus1(String deviceName) throws InterruptedException {

		try {
			getDriver().scrollToExact("MÓVIL BANKING").click();
			Thread.sleep(3000l);
			System.out.println("User Clicked MÓVIL BANKING On Device !" + deviceName);
			System.out.println("**************************************************************************");
		} catch (Exception e) {
			e.printStackTrace();
			getDriver().scrollToExact("MÓVIL BANKING").click();
		}

	}
	
	
	@Test(priority = 2)
	@Parameters({"deviceName"})
	public void BlankLogin(String deviceName) throws InterruptedException {

		try {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
			Thread.sleep(3000l);
			System.out.println("TEST CASE - 1 ");
			System.out.println("User Clicked Acceder Button Without Any Credentials On Device !" + deviceName);
			System.out.println("**************************************************************************");
			alertwindow_Blank();
		} catch (Exception e) {
			e.printStackTrace();
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
		}

	}

	public void alertwindow_Blank() throws InterruptedException {

		try {
			getDriver().findElement(By.id("android:id/button1")).click();
			System.out.println("User Clicks Alert Window Continuar Button !");
			Thread.sleep(3000l);
			getDriver().navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
			getDriver().findElement(By.id("android:id/button1")).click();
		}

	}

	@Test(priority = 3)
	@Parameters({"deviceName"})
	public void InvalidLogin(String deviceName) throws InterruptedException {

		try {
			System.out.println("TEST CASE - 2 ");
			System.out.println("User Enters Invalid Credentials On Device " + deviceName);
			System.out.println("**************************************************************************");

			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editUsername")).sendKeys("Levandy11");
			getDriver().navigate().back();
			Thread.sleep(3000l);
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editPassword")).sendKeys("321321");
			getDriver().navigate().back();
			Thread.sleep(3000l);
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
			Thread.sleep(12000l);

			alertwindow_InvalidLogin();
		} catch (Exception e) {
			e.printStackTrace();
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
		}

	}

	public void alertwindow_InvalidLogin() throws InterruptedException {

		try {
			getDriver().findElement(By.id("android:id/button1")).click();
			Thread.sleep(3000l);
			System.out.println("Clearing both login and password text box ");
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editUsername")).clear();
			Thread.sleep(3000l);
			getDriver().navigate().back();
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editPassword")).clear();
			getDriver().navigate().back();
			System.out.println("**************************************************************************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	@Parameters({ "deviceName" })
	public void ValidLogin(String deviceName) throws InterruptedException {

		String usr1 = "levandy";
		String usr2 = "spezzotti";
		String usr3 = "fdelarosam";
		String usr4 = "ipena000";
		String usr5 = "lcastilloglez";
		String usr6 = "MichelleBrown";
		String usr7 = "jeneesepena";

		System.out.println("TEST CASE - 3 ");
		
		if (device1.equalsIgnoreCase(deviceName)) {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editUsername")).sendKeys(usr4);
			Thread.sleep(3000l);
			System.out.println("User Enters Valid Credentials : " + usr4 + " & Valid Password : 321321 ");
		}

		if (device2.equalsIgnoreCase(deviceName)) {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editUsername")).sendKeys(usr2);
			Thread.sleep(3000l);
			System.out.println("User Enters Valid Credentials : " + usr2 + " & Valid Password : 321321 ");
		}

		getDriver().findElement(By.id("com.popular.app.androidbeta:id/editPassword")).sendKeys("321321");
		Thread.sleep(3000l);

		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
		Thread.sleep(12000l);

	}

	@Test(priority = 5)
	@Parameters({ "deviceName" })
	public void BlankCodigo(String deviceName) throws InterruptedException {

		getDriver().scrollTo("Continuar").click();
		Thread.sleep(8000l);
		
		System.out.println("TEST CASE - 4");
		System.out.println("User Entering Blank Codigo On Device " + deviceName);

		alertwindow_BlankCodigo();
		Thread.sleep(5000l);

	}

	public void alertwindow_BlankCodigo() throws InterruptedException {

		try {
			getDriver().findElement(By.id("android:id/button1")).click();
			System.out.println("User Clicks Alert Window Continuar Button !");
			Thread.sleep(3000l);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 6)
	@Parameters({"deviceName"})
	public void WrongCodigo(String deviceName) throws InterruptedException {

		System.out.println("TEST CASE - 5");
		System.out.println("User Entering Wrong Codigo On Device " + deviceName);

		try {

			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editText1")).sendKeys("123456");
			Thread.sleep(1500l);
			getDriver().scrollTo("Continuar").click();
			Thread.sleep(12000l);

			alertwindow_wrongCodigo();

			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editText1")).clear();
			Thread.sleep(3000l);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void alertwindow_wrongCodigo() throws InterruptedException {

		getDriver().findElement(By.id("android:id/button1")).click();
		System.out.println("User Clicks Alert Window Continuar Button !");
		Thread.sleep(3000l);
	}

	@Test(priority = 7)
	@Parameters({"deviceName"})
	public void Valid(String deviceName) throws InterruptedException {

		System.out.println("TEST CASE - 6");
		System.out.println("User Entering Valid Codigo On Device" + deviceName);

		try {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editText1")).sendKeys("321321");
			Thread.sleep(3000l);

			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnContinuar")).click();
			Thread.sleep(10000l);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Submit() throws InterruptedException {
		getDriver().findElement(By.id("android:id/button1")).click();
		Thread.sleep(4000l);
	}

	@Test(priority = 8)
	@Parameters({"deviceName"})
	public void BlankPin(String deviceName) throws InterruptedException {

		System.out.println("TEST CASE - 7");
		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnCreatePin")).click();
		Thread.sleep(5000l);
		System.out.println("User Attempts Blank Pin On Device " + deviceName);

		Submit();

	}

	@Test(priority = 9)
	@Parameters({"deviceName"})
	public void InValidPin(String deviceName) throws InterruptedException {

		System.out.println("TEST CASE - 8");
		
		for (int i = 1; i <= 4; i++) {
			getDriver().sendKeyEvent(8);
			Thread.sleep(100l);
			if (i == 4)
				for (int j = 1; j <= 4; j++) {
					getDriver().sendKeyEvent(9);
					Thread.sleep(100l);
				}
		}
		System.out.println("User Attempts InValid Pin On " + deviceName);
		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnCreatePin")).click();
		Thread.sleep(3000l);

		Submit();
		Thread.sleep(3000l);
	}

	@Test(priority = 10)
	@Parameters({ "deviceName" })
	public void ValidPin(String deviceName) throws InterruptedException {
		System.out.println("TEST CASE - 9");
		System.out.println("User Attempts Valid Pin");

		if (deviceName.equalsIgnoreCase(device1)) {
			for (int i = 1; i < 9; i++) {
				getDriver().sendKeyEvent(8);
				Thread.sleep(100l);
			}
			System.out.println("User Enters Valid Pin On " + deviceName);
		}

		if (deviceName.equalsIgnoreCase(device2)) {
			for (int i = 1; i < 9; i++) {
				getDriver().sendKeyEvent(8);
				Thread.sleep(100l);
			}
			System.out.println("User Enters Valid Pin On " + deviceName);
		}

		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnCreatePin")).click();

		// getDriver().scrollTo("Guardar").click();

		Thread.sleep(10000l);

	}

	@Test(priority = 11)
	@Parameters({"deviceName"})
	public void InvalidConfirmPin(String deviceName) throws InterruptedException {

		System.out.println("TEST CASE - 10");
		System.out.println("WelCome Screen Displayed On Device " + deviceName);


		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnSuccess")).click();
		Thread.sleep(3000l);

		for (int i = 1; i < 5; i++) {
			getDriver().findElement(By.xpath("//android.widget.TextView[@text=2]")).click();
		}

		System.out.println("User Attempts Invalid Confirm Pin On Device " + deviceName);
		Thread.sleep(8000l);

		getDriver().findElement(By.id("android:id/button1")).click();
		Thread.sleep(4000l);
	}

	@Test(priority = 12)
	@Parameters({"deviceName"})
	public void ConfirmPin(String deviceName) throws InterruptedException {

		System.out.println("TEST CASE - 11");
		System.out.println("User Attempts Valid Confirm Pin On Device " + deviceName);

		for (int i = 1; i < 5; i++) {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/grid_item_label")).click();
			Thread.sleep(100l);
		}

		Thread.sleep(12000l);
		
		System.out.println("User On Account Listing Page" + deviceName);

	}

	@Test(priority = 13)
	@Parameters({"deviceName"})
	public void AccountTypes(String deviceName) throws InterruptedException {
		
		if(device1.equalsIgnoreCase(deviceName)){
			System.out.println("User Scroll Account On Device " + deviceName);
			
			List<WebElement> title = getDriver().findElementsById("com.popular.app.androidbeta:id/txtaccType");
			int titlecount = title.size();
			
			WebElement LastElement = title.get(titlecount-1);
			
			int xStart = LastElement.getLocation().getX() + LastElement.getSize().getWidth() / 2 ;
			int yStart = LastElement.getLocation().getY() + LastElement.getSize().getHeight() / 2 ;
			
			getDriver().swipe(xStart, yStart, xStart, yStart -700 , 6000) ; 
			
		}
		
		if(device2.endsWith(deviceName)){
			System.out.println("User Scroll Account On Device " + deviceName);
			
			List<WebElement> title = getDriver().findElementsById("com.popular.app.androidbeta:id/txtaccType");
			int titlecount = title.size();
			
			WebElement LastElement = title.get(titlecount-1);
			
			int xStart = LastElement.getLocation().getX() + LastElement.getSize().getWidth() / 2 ;
			int yStart = LastElement.getLocation().getY() + LastElement.getSize().getHeight() / 2 ;
			
			getDriver().swipe(xStart, yStart, xStart, yStart -700 , 6000) ; 
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
