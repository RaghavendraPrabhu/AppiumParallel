package myPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BankingTest extends BaseTest {

	@Test(priority = 1)
	public void Menus1() throws InterruptedException {

		try {
			getDriver().scrollToExact("MÓVIL BANKING").click();
			Thread.sleep(3000l);
			System.out.println("User Clicked MÓVIL BANKING !");
			System.out.println("**************************************************************************");
		} catch (Exception e) {
			e.printStackTrace();
			getDriver().scrollToExact("MÓVIL BANKING").click();
		}

	}

	@Test(priority = 2)
	public void ValidLogin() throws Exception {

		String usr1 = "levandy";
		String usr2 = "spezzotti";
		String usr3 = "fdelarosam";
		String usr4 = "ipena000";
		String usr5 = "lcastilloglez";
		String usr6 = "MichelleBrown";
		String usr7 = "jeneesepena";

		try {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editUsername")).sendKeys(usr4);
			Thread.sleep(3000l);
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editPassword")).sendKeys("321321");
			Thread.sleep(3000l);

			System.out.println("TEST CASE - 3 ");
			System.out.println("User Enters Valid Credentials : " + usr4 + "& Valid Password : 321321 ");

			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
			Thread.sleep(10000l);

		} catch (Exception e) {
			e.printStackTrace();
		}

		Error();
		
		
	}
	
	public void Error() throws Exception{
		
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("android:id/alertTitle")));
		if (element.isDisplayed()) {
			System.out.println("El Servido no responde ! OR Something Has gone wrong");
			getDriver().findElement(By.id("android:id/button1")).click();
			Thread.sleep(5000l);
			AlertWindow();
		}
	}

	public void AlertWindow() throws Exception {

		System.out.println("TEST CASE - 3_1");
		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnLogin")).click();
		Thread.sleep(10000l);
		Error();
	}

	
	
	public void ValidCodigo() throws Exception {

		System.out.println("TEST CASE - 6");
		System.out.println("User Entering Valid Codigo");

		try {
			getDriver().findElement(By.id("com.popular.app.androidbeta:id/editText1")).sendKeys("321321");
			Thread.sleep(3000l);

			getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnContinuar")).click();
			Thread.sleep(10000l);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 4)
	public void ValidPin() throws InterruptedException {

		for (int i = 1; i <= 4; i++) {
			getDriver().sendKeyEvent(8);
			Thread.sleep(100l);
		}
		getDriver().findElement(By.id("com.popular.app.androidbeta:id/btnCreatePin")).click();

		Thread.sleep(10000l);
	}

	@Test(priority = 5)
	public void ConfirmPin() throws InterruptedException {

		for (int i = 1; i <= 4; i++) {
			getDriver().sendKeyEvent(8);
			Thread.sleep(100l);
		}

		Thread.sleep(10000l);
	}
}
