package com.BriteERP.tests;

import com.BriteERP.pages.CRMPage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.SeleniumUtils;
import com.BriteERP.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRMTest extends TestBase {

     /*
    Acceptance Criteria:
    *
    1.Verify that second opportunity’ Expected Revenue value on the Pivot board should be the same
    as the Expected revenue column value on the list board.
     */

    @Test
    public void CRMTest1(){
        LoginPage loginPage = new LoginPage();
        CRMPage crmPage = new CRMPage();
        String username = ConfigurationReader.getProperty("username");
        String password =ConfigurationReader.getProperty("password");
        loginPage.login(username, password);
        SeleniumUtils.waitPlease(3);
        SeleniumUtils.navigateToModule("CRM");
        SeleniumUtils.waitPlease(3);
        crmPage.listElement.click();
        String secondRevenueList = crmPage.secondRevenueList.getText();
        System.out.println(secondRevenueList);
        crmPage.pivotElement.click();
        SeleniumUtils.waitPlease(3);
        SeleniumUtils.doubleClick(crmPage.expandTotalElement);
        SeleniumUtils.waitPlease(3);
        crmPage.selectOpportunity.click();
        SeleniumUtils.waitPlease(5);
        String secondRevenuePivot = crmPage.secondRevenuePivot.getText();

        System.out.println(secondRevenuePivot);
        Assert.assertEquals(secondRevenueList, secondRevenuePivot);

    }



}
