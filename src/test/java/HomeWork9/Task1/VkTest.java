package HomeWork9.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VkTest {
    private WebDriver webDriver = new ChromeDriver();
    private static String USERNAME;
    private static String PASSWORD;

    @BeforeClass
    public void setUpData() {
        USERNAME = "";
        PASSWORD = "s";
    }

    @Test
    public void vkTest() {
        webDriver.manage().window().maximize();
        webDriver.get("https://vk.com/");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);

        WebElement usernameField = webDriver.findElement(By.xpath("//input[@id='index_email']"));
        usernameField.sendKeys(USERNAME);

        WebElement passwordField = webDriver.findElement(By.xpath("//input[@id='index_pass']"));
        passwordField.sendKeys(PASSWORD);

        WebElement loginButton = webDriver.findElement(By.xpath("//button[@id='index_login_button']"));
        loginButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='stories_feed_title clear_fix']")));
        WebElement messages = webDriver.findElement(By.xpath("//*[@id='l_msg']"));
        messages.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='im_dialogs_search']")));
        WebElement searchField = webDriver.findElement(By.xpath("//input[@id='im_dialogs_search']"));
        searchField.sendKeys("Денис Пацанков");

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_im_dialog_link")));
        WebElement dialog = webDriver.findElement(By.xpath("//li[@data-list-id='168719824cr']"));
        dialog.click();

        WebElement messageField = webDriver.findElement(By.xpath("//div[@role='textbox']"));
        messageField.sendKeys("MessageForSend");

        WebElement sendButton = webDriver.findElement(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']"));
        sendButton.click();

        if (webDriver.getPageSource().contains("MessageForSend")) {
            System.out.println("Сообщение получено");
        } else {
            System.out.println("Сообщение не получено");
        }
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}


