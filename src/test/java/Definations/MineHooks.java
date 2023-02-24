package Definations;

import BaseOnee.baseOneeee;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MineHooks {

    @Before
    public void starting(){
        WebDriverManager.chromedriver().setup();
        baseOneeee.driver = new ChromeDriver();

        baseOneeee.wait = new WebDriverWait(baseOneeee.driver,20);
    }

    @After
    public void closing(){
        baseOneeee.driver.quit();
    }

}
