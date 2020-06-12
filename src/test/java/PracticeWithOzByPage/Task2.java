package PracticeWithOzByPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Продукты, деликатесы");
        expectedResult.add("Книги");
        expectedResult.add("Косметика, парфюмерия");
        expectedResult.add("Дом, сад, зоотовары");
        expectedResult.add("Развлечения, творчество");
        expectedResult.add("Канцтовары, учёба");
        expectedResult.add("Сувениры, подарки");
        expectedResult.add("Детям и мамам");
        expectedResult.add("Туризм, отдых, спорт");
        expectedResult.add("Техника, электроника");
        expectedResult.add("Здоровье, медтехника");

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://oz.by");
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        List<WebElement> result = webDriver.findElements(By.xpath("//li[@class = 'main-nav__list__li main-nav__list__li_wnav']"));
        List<String> actualResult = new ArrayList<>();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        for (WebElement element : result){
            actualResult.add(element.getText());
        }

        if (expectedResult.equals(actualResult)){
            System.out.println("Test is PASSED");
        }else{
            System.out.println("Test is FAILED");
        }
        webDriver.quit();
    }
}
