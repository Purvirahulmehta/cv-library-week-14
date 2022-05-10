package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    //    Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
//    salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
//    Methods - enterJobTitle(String jobTitle), enterLocation(String location),
//    selectDistance(String distance), clickOnMoreSearchOptionLink(),
//    enterMinSalary(String minSalary), enterMaxSalary(String maxSalary), selectSalaryType(String
//                                                                                                 sType), selectJobType(String jobType),
//    clickOnFindJobsButton().
    public HomePage() {

        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//input[@id='keywords']")
        WebElement jobTitleField;
        @FindBy(xpath = "//input[@id='location']")
        WebElement locationField;
        @FindBy(xpath = "//select[@id='distance']")
        WebElement distanceDropDownField;
        @FindBy(xpath = "//*[contains(text(),'Accept')]")
        WebElement cookies;
        @FindBy(xpath ="//button[@id='toggle-hp-search']" )
       // @FindBy(xpath ="//button[@id='more-search-options']")
        WebElement moresearchoptionsField;
        @FindBy(xpath ="//input[@class='hp-sal-min form__input']")
        WebElement salaryMinimumField;
        @FindBy(xpath = "//input[@class='hp-sal-max form__input']")
        WebElement salaryMaximumField;
        @FindBy(xpath ="//select[@id='salarytype']")
        WebElement salaryTypeDropDownField;
        @FindBy(xpath = "//select[@id='tempperm']")
        WebElement jobTypeDropDownField;
        @FindBy(xpath = "//input[@id='hp-search-btn']")
        WebElement findJobsTabField;


        public void enterJobTitle(String jontitle) {

            sendTextToElement(jobTitleField,jontitle);
        }
        public void enterLocation(String location) {

            sendTextToElement(locationField,location);
        }
        public void selectDistance(String distance) {
            selectByValueFromDropDown(distanceDropDownField,distance);
        }
        public void clickOnCookies(){
            clickOnElement(cookies);
        }

        public void clickOnMoreSearchOptionLink() {
            clickOnElement(moresearchoptionsField);
        }
        public void enterMinSalary(String minSalary) {
            sendTextToElement(salaryMinimumField,minSalary);
        }
        public void enterMaxSalary(String maxSalary) {
            sendTextToElement(salaryMaximumField,maxSalary);
        }
        public void selectSalaryType(String sType){
            selectByVisibleTextFromDropDown(salaryTypeDropDownField,sType);
        }
        public void selectJobType(String jobType) {
            selectByValueFromDropDown(jobTypeDropDownField,jobType);
        }
        public void clickOnFindJobsButton() {
            clickOnElement(findJobsTabField);
        }
    public void clickOnAcceptCookie(){
       // Reporter.log("Clicking on Accept Cookies : " + acceptCookies.toString());
        switchToiFrame("gdpr-consent-notice");
        clickOnElement(cookies);
    }




    }


