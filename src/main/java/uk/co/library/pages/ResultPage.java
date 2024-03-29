package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage () {

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[@class='search-header_title']")
    WebElement resultText;
    public String verifyResultText(String result){
        return getTextFromElement(resultText);
    }

}
