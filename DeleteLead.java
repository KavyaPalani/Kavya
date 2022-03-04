package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive =new ChromeDriver();
		drive.get("http://leaftaps.com/opentaps/control/login");
		drive.manage().window().maximize();
		drive.findElement(By.id("username")).sendKeys("Demosalesmanager");
		drive.findElement(By.id("password")).sendKeys("crmsfa");
		drive.findElement(By.className("decorativeSubmit")).click();
		drive.findElement(By.linkText("CRM/SFA")).click();
		drive.findElement(By.linkText("Leads")).click();
		drive.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//li[@id='ext-gen240__ext-gen254']//span)[2]")).click();
		Thread.sleep(2000);
		drive.findElement(By.xpath("(//div[@id='ext-gen873']//input)[1]")).sendKeys("81");
		Thread.sleep(2000);
		drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//WebElement elementLeadLink = drive.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		WebElement elementLeadLink = drive.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text=elementLeadLink.getText();
		System.out.println("Lead id:"+ text );
		elementLeadLink.click();
		drive.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[4]")).click();
		drive.findElement(By.linkText("Find Leads")).click();
		drive.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		drive.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Verify - no records found
		if(drive.getPageSource().contains("No records to display"))
		{
			System.out.println("Records deleted successfully");
		}
		else
		{
			System.out.println("Records not deleted");
		}
		
	}

}
