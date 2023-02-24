package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import BaseOnee.baseOneeee;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(baseOneeee.driver, this);

        @FindBy(how = How.ID, using = "user-name")
        public static WebElement userName;

        
    }
}
