package error;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class alter {

	
		public static void main(String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVYA\\Downloads\\selenium\\jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver fg=new ChromeDriver();
			fg.manage().window().maximize();
			fg.get("https://demoqa.com/alerts");
			//alert
			fg.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/button")).click();
			Alert a=fg.switchTo().alert();
			System.out.println(a.getText());
			Thread.sleep(4000);
			a.accept();
			/*confirm box
			fg.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/button")).click();
			
		    Thread.sleep(3000);
		    a.accept();
	*/
			fg.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/div[2]/button")).click();
			System.out.println(a.getText());
			Thread.sleep(3000);
			a.dismiss();
			System.out.println(fg.findElement(By.id("confirmResult")).getText());
			//prompt box
			fg.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[4]/div[2]/button")).click();
			System.out.println(a.getText());
			a.sendKeys("JENO");
			Thread.sleep(4000);
			a.accept();
			System.out.println(fg.findElement(By.id("promptResult")).getText());
			fg.navigate().to("https://www.mycontactform.com/samples.php");
			fg.findElement(By.name("btnSubmit")).click();
			System.out.println(fg.findElement(By.id("right_col_top_err")).getText());
			String text=fg.findElement(By.id("right_col_top_err")).getText();
			if( text.contentEquals("login succeess")) {
				System.out.println("login pass");
				
			}
			else {
				System.out.println("login fail");
			}
			
			
		}

	}


