package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class OrgTest {

	@Test
	public void createOrgTest() {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.id("submitButton")).click();

	}

}
