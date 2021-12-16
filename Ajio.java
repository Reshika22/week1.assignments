package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		Thread.sleep(3000);
		List<WebElement> listBrand = driver.findElements(By.xpath("//div[@class='facet-body']//input[@name='brand']//following-sibling::label"));
		System.out.println("Brands :");
		for (WebElement eachElement : listBrand) {
			String brand = eachElement.getText();
			System.out.println(brand.substring(0, brand.length()-4));
		}
		System.out.println("\nBag Names :");
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='contentHolder']/div[@class='nameCls']"));
		for (WebElement eachElement : bagNames) {
			String bag = eachElement.getText();
			System.out.println(bag);
		}
	}

}
