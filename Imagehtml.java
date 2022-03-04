package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imagehtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leafground.com/pages/Image.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[1]")).click();
		drive.findElement(By.xpath("(//ul[@class='wp-categories-list']//a)[4]")).click();
		System.out.println(drive.findElement(By.xpath("(//div[@class='row']//img)[2]")).isEnabled());
		drive.findElement(By.xpath("(//div[@class='large-6 small-12 columns']//img)[3]")).click();
		
	}

}
