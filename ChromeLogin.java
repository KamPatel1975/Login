package seleniumsession;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class ChromeLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cam\\IdeaProjects\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("kam2perth@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Tester123");
        driver.findElement(By.className("login-button")).click();
}}
