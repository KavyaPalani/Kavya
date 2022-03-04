package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkhtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leafground.com/pages/Link.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.findElement(By.linkText("Go to Home Page")).click();
		drive.findElement(By.xpath("(//ul[@class='wp-categories-list']//a)[3]")).click();
		System.out.println(drive.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		drive.findElement(By.linkText("Verify am I broken?")).click();
		if(drive.getPageSource().contains("HTTP Status 404 – Not Found"))
		{
			System.out.println("Page is broken");
		}
		else
		{
			System.out.println("Pageis working fine");
		}
		drive.get("http://leafground.com/pages/Link.html");
		drive.findElement(By.xpath("(//div[@class='example']//a)[4]")).click();
		
		
	}

}
