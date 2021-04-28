package demo;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	@Test
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "/Users/canermetin/Downloads/chromedriver");
WebDriver driver =new ChromeDriver();

driver.get("http://gittigidiyor.com");
driver.manage().window().maximize();
driver.get("https://www.gittigidiyor.com/uye-girisi");
WebElement UserName = driver.findElement(By.id("L-UserNameField"));
UserName.sendKeys("mail adresi");
WebElement Password = driver.findElement(By.id("L-PasswordField"));
Password.sendKeys("parola");
WebElement LoginKey = driver.findElement(By.id("gg-login-enter"));
LoginKey.click();

WebElement SearchBox = driver.findElement(By.name("k"));
SearchBox.sendKeys("bilgisayar",Keys.RETURN);
Thread.sleep(3000);
driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
Thread.sleep(3000);
driver.get("https://www.gittigidiyor.com/bilgisayar-tablet/amd-ryzen-3-pro-4350g-3-8ghz-8gb-ram-240gb-ssd-oyuncu-bilgisayari_pdp_611029068");
Thread.sleep(1500);
//WebElement AddBasket = driver.findElement(By.name("frm_add_chard"));
//AddBasket.click();
WebElement AdBasket = driver.findElement(By.cssSelector("#add-to-basket"));
AdBasket.click();
WebElement AddBasket = driver.findElement(By.cssSelector("#add-to-basket"));
AddBasket.click();










	}
	

}
