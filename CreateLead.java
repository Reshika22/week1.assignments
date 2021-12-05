package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	//WebDriver will always open a new browser

	public static void main(String[] args) throws InterruptedException {

		//Setup the chromedriver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();

		//Launch the chromedriver
		ChromeDriver driver = new ChromeDriver();		
		//EdgeDriver driver = new EdgeDriver();

		//Load the URL(method --> get --> "http:://")
		driver.get("http://leaftaps.com/opentaps");

		//Maximize the browser
		driver.manage().window().maximize();

		//locators

		//Create Lead Section 1
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");//username enter
		driver.findElement(By.id("password")).sendKeys("crmsfa"); //password enter
		driver.findElement(By.className("decorativeSubmit")).click(); // submit button click
		driver.findElement(By.linkText("CRM/SFA")).click(); // crm/sfa button click
		driver.findElement(By.linkText("Leads")).click();  // leads tab click
		driver.findElement(By.linkText("Create Lead")).click(); // create leads option click
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BNYM Technologies"); // enter company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reshika"); // enter first name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabu"); // enter last name

		WebElement elementDropdownSource = driver.findElement(By.id("createLeadForm_dataSourceId")); 
		Select selectSource = new Select(elementDropdownSource);
		selectSource.selectByVisibleText("Website");

		WebElement elementDropdownMarketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selectMarket = new Select(elementDropdownMarketing);
		selectMarket.selectByVisibleText("eCommerce Site Internal Campaign");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Reshika"); 
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Prabu"); 
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms."); 
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/4/93"); 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate Developer"); 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software"); 
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2,00,000"); 

		//WebElement elementDropdown1 = driver.findElement(By.id("createLeadForm_generalCountryGeoId")); 
		//Select select1 = new Select(elementDropdown1);
		//select1.selectByVisibleText("Ireland");
		//select1.selectByValue("IRL");
		//select1.selectByIndex(0);
		WebElement elementDropdownCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select selectCountry = new Select(elementDropdownCountry);
		selectCountry.selectByVisibleText("Ireland"); 

		WebElement elementDropdownCurrency = driver.findElement(By.id("createLeadForm_currencyUomId")); 
		Select selectCurr = new Select(elementDropdownCurrency);
		selectCurr.selectByVisibleText("EUR - Euro");

		WebElement elementDropdownIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select selectInd = new Select(elementDropdownIndustry);
		selectInd.selectByValue("IND_SOFTWARE");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("35"); 

		WebElement elementDropdownOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selectOwn = new Select(elementDropdownOwner);
		selectOwn.selectByVisibleText("Partnership");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("10020345"); 
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("###"); 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("We are a small start-up company.Our job is to develop and test Web Applications"); 
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("We follow strict timings in work."); 

		//Create Lead section 2 -->Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("D913"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("D9"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8976598076"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("00353"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Reshika"); 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("reshika@gmail.com"); 
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.bnymellon.com/"); 

		//Create Lead Section 3 -->Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Reshika"); 
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Prabu"); 
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("100,Cloantarf Avenue"); 
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Malahide Road,Howth"); 
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dublin"); 

		WebElement elementDropdownState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectState = new Select(elementDropdownState);
		selectState.selectByVisibleText("Dublin");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("D9K8R2"); 
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("00353"); 
		//Thread.sleep(3000);

		driver.findElement(By.name("submitButton")).click(); // submit button click

		//Get the title
		String title = driver.getTitle();
		System.out.println("Title of the web page :" + title);
		System.out.println(System.getProperty("webdriver.chrome.driver"));

		// Get first Name and Print
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("First Name : " + firstName);

		driver.close(); //close the browser




	}

}
