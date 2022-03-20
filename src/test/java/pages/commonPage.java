package pages;

import Driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class commonPage {

    public commonPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//*[@id=\"menu-item-40\"]/a")
    public WebElement shopMenu;

    @FindBy(xpath="//*[@id=\"menu-item-50\"]/a")
    public WebElement myAccountMenu;

    @FindBy(xpath="//*[@id=\"wpmenucartli\"]/a")
    public WebElement cartItemMenu;


}
