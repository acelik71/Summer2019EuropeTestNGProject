
package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public String getPageSubTitle() {
        return null;
    }

    public void navigateToModule(String activities, String calendar_events) {
    }
}