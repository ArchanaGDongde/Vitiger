package managers;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.MgApp;


//import pageObjects.Practice;
public class PageObjectManager {

	private WebDriver webDriver;
	private String baseURL;
	private LoginPage loginPage;
	private MgApp mgapp;
	
	
		
	public PageObjectManager(WebDriver webDriver, String baseURL) {
		this.webDriver = webDriver;
		this.baseURL = baseURL;
	
	}

	public LoginPage getLoginPage() {
		return (this.loginPage == null) ? new LoginPage(webDriver, this.baseURL) : this.loginPage;
				   
	}

	
	public MgApp getMgApp() {
		return(this.mgapp==null)? new MgApp(webDriver,this.baseURL): this.mgapp;
	}
	
}	
	
	



	
	

	


	
	


	
	



