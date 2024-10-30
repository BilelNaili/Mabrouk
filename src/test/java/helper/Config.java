package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions actions;
	public static void confChrome() {
		System.setProperty("webdriver.chromedriver", "c:/chromedriver.exe");
	}
	public static void maxWin() {
		driver.manage().window().maximize();
	}
	public static void quitWind() {
		driver.quit();
	}
	public static void attente (int s) {
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

}
