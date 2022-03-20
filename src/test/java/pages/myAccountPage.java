package pages;

import Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage {
    public myAccountPage() {
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(id = "username")
    public WebElement usernameLoginInput;

    @FindBy(id = "password")
    public WebElement passwordLoginInput;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"page-36\"]/div/div[1]/ul/li")
    public WebElement loginMessageLabel;

    public void goLogin(String username, String password) {
        this.usernameLoginInput.sendKeys(username);
        this.passwordLoginInput.sendKeys(password);
        this.loginButton.click();
    }

}
