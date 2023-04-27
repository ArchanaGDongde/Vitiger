package util;

import java.net.MalformedURLException;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() throws MalformedURLException{
    	
    	
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver(),webDriverManager.getApplicationUrl());
       // pageObjectManager = new PageObjectManager(webDriverManager.getDriver(),webDriverManager.getSelGridData());

    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
