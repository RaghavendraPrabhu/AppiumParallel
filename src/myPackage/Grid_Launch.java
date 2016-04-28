package myPackage;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class Grid_Launch {
	
	public void Launch() throws IOException, InterruptedException {

		try {
			Runtime.getRuntime().exec("cmd /c start C:\\Appium_Parallel\\Start_Grid.bat");
			Thread.sleep(5000l);
			System.out.println("Appium Grid Hub Started Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Appium Grid Hub Starting Failed");
		}

		try {
			Runtime.getRuntime().exec("cmd /c start C:\\Appium_Parallel\\Motorola_Device_1.bat");
			Thread.sleep(15000l);
			System.out.println("Motorola Device Started Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Motorola Device Starting Failed");
		}

		try {
			Runtime.getRuntime().exec("cmd /c start C:\\Appium_Parallel\\Hauwei_Device_2.bat");
			Thread.sleep(15000l);
			System.out.println("Hauwei Device Started Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Motorola Device Starting Failed");
		}

	}

}
