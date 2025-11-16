package YatraProject.YatraSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 */
public class BrowserNavigation {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello World!");

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized","disable-notifications");
		ChromeDriver wd = new ChromeDriver(chromeoptions);

		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
		wd.get("https://www.Yatra.com");
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\YatraSelenium\\src\\main\\java\\YatraProject\\YatraSelenium\\YatraData.properties");
			
			By ClosePopUpLocator = By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[2]/div/section[2]/span/img");
		WebElement ClosePopUpCross = wait.until(ExpectedConditions.elementToBeClickable(ClosePopUpLocator));

		ClosePopUpCross.click();

		By DepartureLocator =  By.xpath("//div[@role=\"button\" and @aria-label=\"Departure Date inputbox\"]");
		WebElement DepartureButton = wd.findElement(DepartureLocator);
		DepartureButton.click();
		System.out.println("Clicked on Departure Button");	
		System.out.println("for pull");
		System.out.println("for pull");
		System.out.println("for pull");
		System.out.println("for pull4");
	}


}
