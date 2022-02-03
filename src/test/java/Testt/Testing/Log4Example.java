package Testt.Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;

public class Log4Example {
static Logger log = Logger.getLogger(Log4Example.class);
public static void main(String[] args) {
PropertyConfigurator.configure("C:\\Users\\10694225\\Desktop\\Testing\\src\\test\\java\\Test\\Testing\\log4j.properties");
//Setting system properties of ChromeDriver
System.setProperty("webdriver.chrome.driver", "C://Users//Evertz//Documents//Practice//seleniumwebdriver//chromedriver_win32//chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
WebDriver driver = new ChromeDriver(options);
JavascriptExecutor js = (JavascriptExecutor)driver;
driver.get("https://www.browserstack.com/users/sign_in");
log.info("Open browserstack");
driver.manage().window().maximize();
log.info("Maximize window size");
js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
log.info("enter username");
js.executeScript("document.getElementById('user_password').value='password';");
log.info("enter password");
js.executeScript("document.getElementById('user_submit').click();");
log.info("click on login");
driver.close();



}
}