import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public FirstSeleniumScript() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		System.out.println("Calling the web driver manage() and window maximze method to maximize the window");
		driver.manage().window().maximize();
		
		System.out.println("Calling the driver get method with the URL parameter to open the browser");
		//driver.get("https://wordpress.com/log-in"); 
		driver.get("https://www.bcit.ca/");
		
		System.out.println("\n");
		System.out.println("Test Case To verify home page is opened without any error and displays the actual title\n");
		System.out.println("Calling the driver getTitle() method to get webpage title\n");
		String actualTitle=	driver.getTitle();
		System.out.println("The actual title of the webpage is" + "\t " + actualTitle);
		
		String expectedTitle="BCIT : : British Columbia Institute of Technology";
		System.out.println("\n\n");
		if(actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test case passed\n\n");
		}
		
		else
		{
			System.out.println("Test failed\n\n ");
		}
		Thread.sleep(4000);
		System.out.println("Testing browser navigation commands");
		System.out.println("Go to another website\n");
		driver.get("https://wordpress.com/log-in"); 
		System.out.println("Calling the driver getCurrentUrl() method to verify the new website address");
		String url =driver.getCurrentUrl();
		System.out.println("The current url is" +  "\t\t" + url + "\n");
		System.out.println("Calling the driver navigate().to() method and passing another url to it" + "\n");
		driver.navigate().to("http://freecrm.com");
		System.out.println("Calling the driver getCurrentUrl() method to verify the new website address" + "\n");
		String url1 =driver.getCurrentUrl();
		System.out.println("Current url after calling the driver navigate to method" + "\t\t" + url1 + "\n"); 
		System.out.println("Calling the driver navigate back  method to verify the new website address" + "\n");
		Thread.sleep(4000);
		driver.navigate().back();
		String url2 =driver.getCurrentUrl();
		System.out.println("The current url after navigating back" + "\t\t" + url2 +  "\n");
		System.out.println("Calling the driver navigate forward command to move one item forward in browser history\n");
		Thread.sleep(4000);
		driver.navigate().forward();
		String url3=driver.getCurrentUrl();
		System.out.println("Current url after the driver navigate forward method call" + "\t\t" + url3 + "\n");
		
		System.out.println("Calling the driver navigate refresh function to refresh current url ");
		Thread.sleep(4000);
		driver.navigate().refresh();

		driver.close();	
	}

}
