package assignment2week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive=new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("Demosalesmanager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Leads")).click();
		drive.findElement(By.linkText("Create Lead")).click();
		drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavya");
		drive.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anjali");
		drive.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		drive.findElement(By.id("createLeadForm_description")).sendKeys("Learning JavaSelenium");
		drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavyasoftech@gmail.com");
		WebElement elementDropdown = drive.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd =new Select(elementDropdown);
		dd.selectByVisibleText("New York");
		drive.findElement(By.name("submitButton")).click();
		drive.findElement(By.linkText("Edit")).click();
		drive.findElement(By.id("updateLeadForm_description")).clear();
		drive.findElement(By.id("updateLeadForm_importantNote")).sendKeys("It is Testing course");
		drive.findElement(By.name("submitButton")).click();
		System.out.println("The Title is: "+drive.getTitle());
	}

}
