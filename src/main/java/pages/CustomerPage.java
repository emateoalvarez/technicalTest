package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class CustomerPage extends PageObject {
    @FindBy(xpath="//i[@class='s-sidebar-icon fa fa-anchor']")
    private WebElementFacade lblNorthwind;

    @FindBy(xpath = "//i[@class='s-sidebar-icon fa fa-credit-card']")
    private WebElementFacade lblCustomer;

    @FindBy(xpath = "//*[@id='GridDiv']/div[2]/div[1]/input")
    private WebElementFacade txtSearchCustomer;

    @FindBy(xpath = "//*[@id='GridDiv']/div[3]/div[5]/div/div/div[1]/a")
    private WebElementFacade txtFindCustomer;
}
