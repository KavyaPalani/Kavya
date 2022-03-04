package week2.day2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxhtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leafground.com/pages/checkbox.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		drive.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[2]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		System.out.println("Confirm selenium is checked :" +drive.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected());
		drive.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		drive.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();


	}

}
