package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PG");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AN");
		/*10. Select value as Employee in Source Using SelectbyVisible text
	   
	   11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
	   
	   
	   13. Select value as Corporation in OwnerShip field Using SelectbyIndex
	   
	   14. Select value as India in Country Field Using SelectbyVisibletext
	    
	   15. Click on create Lead Button Using name Locator
	   
	   16. Get the Title of the resulting Page*/
		
		Select selSource=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		selSource.selectByVisibleText("Employee");
		Select selMarketingCampaign=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		selMarketingCampaign.selectByValue("9001");
		Select selOwnership=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		selOwnership.selectByIndex(4);
		Select selCountry=new Select(driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
		selCountry.selectByVisibleText("India");
		 driver.findElement(By.name("submitButton")).click();
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		
	}

}
