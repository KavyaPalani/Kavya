package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonhtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leafground.com/pages/Button.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.findElement(By.id("home")).click();
		drive.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]")).click();
		System.out.println("The position :" +drive.findElement(By.id("position")).getLocation());
		System.out.println("The Color is :" +drive.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("The Size is :" +drive.findElement(By.id("size")).getSize());
	}

}
