package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceRegistration {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cam\\IdeaProjects\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.findElement(By.name("Register")).click();
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("123kam");
        driver.findElement(By.id("LastName")).sendKeys("patel");
       // driver.findElement(By.className("inputs date-of-birth"));
        driver.findElement(By.className("DateOfBirthDay")).sendKeys("9");

    }

}
