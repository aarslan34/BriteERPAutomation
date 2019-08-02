package com.BriteERP.pages;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMPage {

    public CRMPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath ="//button[@aria-label='list']")
    public WebElement listElement;

    @FindBy(css = "[class='btn btn-icon fa fa-lg fa-table o_cp_switch_pivot']")
    public WebElement pivotElement;

    @FindBy(css = "[class='o_pivot_header_cell_opened']")
    public WebElement expandTotalElement;

    @FindBy(xpath = "//li//a[text()='Opportunity']")
    public WebElement opportunityDropdown;

    @FindBy(xpath = "//tr[2]/td[9]")
    public WebElement secondRevenueList;

    @FindBy(xpath = "//a[contains(text(), 'Opportunity')]")
    public WebElement selectOpportunity;

    @FindBy(xpath = "//tr[4]/td[2]")
    public WebElement secondRevenuePivot;




}
