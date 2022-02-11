package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cam\\IdeaProjects\\downloads\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
                ;driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("kam2perth@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Tester123");
        driver.findElement(By.className("login-button")).click();
    }
}
