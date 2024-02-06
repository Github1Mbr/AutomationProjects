package Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtigerproject {
	
	public static void main(String[] args) {

		// Lanuch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://localhost:8888/");

		// Step 2: Login to vtiger
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		// step 3 navigate to contact link
		driver.findElement(By.partialLinkText("Contacts")).click();

		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		
		WebElement singleselectdropdown=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select sel=new Select(singleselectdropdown);
		sel.selectByValue("Prof.");
		
		
		
				
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vignesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
				
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		System.err.println("1");
		
				driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img")).click();
				WebElement singledropdown1=driver.findElement(By.linkText("Sign Out"));
				singledropdown1.click();
				Select sel1=new Select(singleselectdropdown);
				sel1.selectByValue("Sign Out");
	}

}