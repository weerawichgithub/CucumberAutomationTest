package pages;

import Driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import static Driver.Driver.driver;


public class homePage {

    By sliderSection = By.xpath("//*[@id='n2-ss-6']/div");
    By arrivalImgSlide = By.xpath("//h3");

    public homePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/nav/a")
    public WebElement homeMenuLink;

    @FindBy(xpath = "//*[@id=\"tab-description\"]/h2")
    public WebElement productPage;

    @FindBy(xpath = "//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")
    public WebElement arrivalImg;

    @FindBy(xpath = "//*[@id=\"product-165\"]/div[2]/form/button")
    public WebElement addBasketBtn;

    public void chkURL(String url) {
        try {
            int respCode = 200;

            HttpURLConnection huc = null;

            huc = (HttpURLConnection) (new URL(url).openConnection());

            huc.setRequestMethod("HEAD");

            huc.connect();

            respCode = huc.getResponseCode();

            if (respCode >= 400) {
                System.out.println(url + " is a broken link");
            } else {
                System.out.println(url + " is a valid link");
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void chkSliderSection(int number) {
        List<WebElement> sliders = driver.findElements(sliderSection);

        int numberOfSliders = sliders.size();
        Assert.assertEquals(numberOfSliders, number);
        System.out.println("\t\t: - Number of sliders = " + numberOfSliders);
    }

    public void chkArrivals(int number) {
        List<WebElement> arrivals = driver.findElements(arrivalImgSlide);

        for(WebElement bookArrivals : arrivals) {
            System.out.println("\t\t:\t o " + bookArrivals.getText());
        }
        Assert.assertEquals(arrivals.size(),number);

    }


}