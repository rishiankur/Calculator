import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class Main {

	public static void main(String[] args) {
		Reporter.log("Main Method Start Executing");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://nav.elance.com");
		 Reporter.log("URL Opens Up");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		 
		 driver.findElement(By.id("SignInLnk")).click();
		 driver.findElement(By.id("login_name")).sendKeys("vagarwalhire1");
		 driver.findElement(By.id("passwd")).sendKeys("Computer12");
		 driver.findElement(By.id("passwd")).submit();
		 
		 driver.findElement(By.id("challengeAnswerId")).sendKeys("noida");
		 driver.findElement(By.id("challengeAnswerId")).submit();
		 
		 // ************** New Job Post ******************* //
		 
		 /*driver.findElement(By.id("PostYourJob_lnk")).click();
		 driver.findElement(By.id("ttlField")).sendKeys("NewJobPost");
		 
		 for(int i =0;i<10;i++)
		 {
		 driver.findElement(By.id("descField")).sendKeys("The quick brown fox jumps over the little lazy dog." + "\n");
		 }
		 
		 Select a = new Select(driver.findElement(By.id("catIdField")));
		 a.selectByVisibleText("IT & Programming");
		 
		 Select b = new Select(driver.findElement(By.id("subcatIdField")));
		 b.selectByVisibleText("Software Application");
		 
		 WebElement d =  driver.findElement(By.id("autocomplete_text"));
		 d.sendKeys(".NET");
		 d.click();
		 
		 Select e = new Select(driver.findElement(By.id("hourlyRate")));
		 e.selectByVisibleText("About $30 to $40 / hr");
		 
		 
		 driver.findElement(By.id("weeklyHours")).sendKeys("40");
		 
		 Select f = new Select(driver.findElement(By.id("wkDurField")));
		 f.selectByVisibleText("3-4 weeks");
		 
		 driver.findElement(By.id("continue-post")).click();
		 
		 driver.findElement(By.xpath("//*[@id='featuredUpsellContent']/div/div/a[1]")).click();
		 
		 driver.findElement(By.cssSelector("#PostThisJob > span")).click();*/
		 
		 //*************************POST JOB ENDS*************************//
		 
		// driver.findElement(By.xpath("//*[@id='nav-m-home']/a")).click();
		 
		 //driver.findElement(By.xpath("//*[@id='projectCard52016619']")).click();  
		 
		 driver.findElement(By.cssSelector("div.info > div > div.left > a")).click();
		 //driver.findElement(By.xpath("//*[@id='projectCard52016619']/div[3]/div[1]/div[1]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id='proposal-info-items']/div[9]/a[2]")).click(); 
		 
		 Set<String> windows = driver.getWindowHandles();
		
		 Iterator<String> iterate = windows.iterator();
		   
		 String abc = iterate.next();
		 	
		 for(int i = 0; i<windows.size(); i++)
		 {
	     System.out.println(windows.get(i).getAttribute("id"));		  
		 }
		  
		/* for(String z : windows)
		 {*/
			// driver.switchTo().window(z);
			 driver.findElement(By.id("invite-elance-area-placeholder")).sendKeys("ankurrishi20");
			 driver.findElement(By.id("invite-elance-area-placeholder")).submit();
			// driver.switchTo().defaultContent();
		// }
		 
		 /*WebElement block = driver.findElement(By.xpath("//*[@id='footer']"));
		 List<WebElement> links = block.findElements(By.tagName("a"));
		 
		 String[] newlinks = new String[(links.size())];
		 int i = 0;
		 
		 for(WebElement e : links)
		 {
			 newlinks[i] = e.getText();	
			 System.out.println(e.getText());
			 System.out.println("***********************************");
			 i++;
		 }
		 
		 for(String a : newlinks)
		 {
			String link_name = a.toString();			
			driver.findElement(By.linkText(a)).click();
			System.out.println(link_name);
			driver.navigate().back();
		 }*/
		 
		 /*Set<Cookie> cookie  = driver.manage().getCookies();
		 for(Cookie e : cookie)
		 {
			 System.out.println(e.getName());
		 }*/
		 
		// driver.quit();
	}

}
