package Projects;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class whatsappAutomation {

	public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException 
	{
		//Open the Chrome Browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open the Whatsapp using phone number - Selection
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		WebElement linkMobileNumber = driver.findElement(By.xpath("//*[text()='Link with phone number']"));
		
		//linkMobileNumber.click();
		Actions action = new Actions(driver);
		action.moveToElement(linkMobileNumber).click().perform();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.xpath("//div[contains(text(),'Next')]"));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView()", country);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd "
		    + "p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 f8m0rgwh elxb2u3l']//button")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[contains(text(),'India')]")).click();
		  Thread.sleep(3000);
		
		WebElement phonenumber = driver.findElement(By.xpath("//input[@value='+91 ']")); 
		WebElement phno =driver.findElement(By.xpath("//input[contains(@class,'selectable-text')]"));
		phno.clear();
		phonenumber.sendKeys("8300574079");
		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();		
		System.out.println("Welcome to whatsapp Automation");
		
		//Waiting Time - Enter the manual OTP code
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);
		System.out.println("Selected Profile Photo");
		
		//Profile Photo Change
				System.out.println("change the Profile photo");
				WebElement profilePhoto = driver.findElement(By.xpath("//div[@class='_3WByx']/child::div"));
				profilePhoto.click();
				Thread.sleep(2000);
				WebElement cameraClick = driver.findElement(By.xpath("//span[@data-icon='camera']"));
				cameraClick.click();
				Thread.sleep(2000);
				WebElement uploadPhoto = driver.findElement(By.xpath("//*[text()='Upload photo']"));
				uploadPhoto.click();
				Thread.sleep(3000);
				String file = "C:\\Users\\Balaji\\Downloads\\lord-venkateswara-on-red-curtain-5jbb59cgqn9ripg4.jpg"; 
				StringSelection imagePath = new StringSelection(file);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
				Robot key = new Robot();
				key.keyPress(KeyEvent.VK_CONTROL);
				key.keyPress(KeyEvent.VK_V);
				key.keyRelease(KeyEvent.VK_V);
				key.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(3000);
				key.keyPress(KeyEvent.VK_ENTER);
				key.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				WebElement adjust = driver.findElement(By.xpath("//*[@data-icon='minus']"));
				adjust.click();
				Thread.sleep(3000);
				//adjust.click();
				Thread.sleep(2000);
				WebElement clickTick1 = driver.findElement(By.xpath("//span[@data-icon='checkmark-large']/parent::div"));
				clickTick1.click();
				System.out.println("Successfully Profile Picture updated");
				
				//remove Photo
				System.out.println("Remove the Profile Picture");
			
				Thread.sleep(5000);
				WebElement prfilePic = driver.findElement(By.xpath("//*[@class='_2pktu']"));
				action.moveToElement(prfilePic).perform();
				Thread.sleep(2000);
				WebElement cameraClick1 = driver.findElement(By.xpath("//span[@data-icon='camera']"));
				cameraClick1.click();
				Thread.sleep(2000);
				WebElement removePhoto = driver.findElement(By.xpath("//*[text()='Remove photo']"));
				removePhoto.click();
				Thread.sleep(2000);
				WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']/parent::div/parent::button"));
				remove.click();
				Thread.sleep(2000);
				System.out.println("Successfully Removed the Profile Picture");
				
				System.out.println("Change the Name");
				
				//Change Name
				WebElement name = driver.findElement(By.xpath("(//*[@data-icon='pencil'])[1]"));
				name.click();
				Thread.sleep(2000);
				WebElement enterName = driver.findElement(By.xpath("//*[@class='selectable-text copyable-text']"));
				action.doubleClick(enterName).perform();
				enterName.clear();
				enterName.sendKeys("Bhuvaneshraj");
				Thread.sleep(2000);
				WebElement clickCheckMark = driver.findElement(By.xpath("//*[@data-icon='checkmark']"));
				clickCheckMark.click();
				Thread.sleep(3000);
				System.out.println("Successfully Change the Name");
				
				
				//About
				System.out.println("About information");
				WebElement about = driver.findElement(By.xpath("(//*[@data-icon='pencil'])[2]"));
				about.click();
				Thread.sleep(2000);
				//button[@title='Click to edit About']/child::span
				WebElement enterAbout = driver.findElement(By.xpath("//*[text()='About']/following::div[4]"));
				action.doubleClick(enterAbout).sendKeys("Disaster management").perform();
				Thread.sleep(2000);
				WebElement clickCheck1 = driver.findElement(By.xpath("//*[@data-icon='checkmark']"));
				clickCheck1.click(); 
				Thread.sleep(2000);
				WebElement profileBack = driver.findElement(By.xpath("//*[@class='kk3akd72 iqmas3e4']/child::div/child::span"));
				profileBack.click();
				Thread.sleep(5000);
				System.out.println("Successfully About information updated");
				
				System.out.println("Select the number and sending the message");
			   
				//Selecting a number to send a message 
				WebElement search = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
				Thread.sleep(10000);
				search.sendKeys("93452 09174");
				WebElement contactOpen = driver.findElement(By.xpath("//span[@title='Bbbbb']"));
				contactOpen.click();
				System.out.println("Contact selected successful");
				
				System.out.println("Sending Text Message");
				
				//Sending a Text Message 
				WebElement textMessage1 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
				textMessage1.sendKeys("hello bhuvanesh");
				WebElement textMessagesend1 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
				textMessagesend1.click();
				Thread.sleep(1000);
				System.out.println("Text message 1 sended");
				
				System.out.println("Text message select in star");

				//Star
				Thread.sleep(1000);
				WebElement moveTo = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
				action.moveToElement(moveTo).perform();
				WebElement arrow = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
				arrow.click();
				Thread.sleep(1000);
				WebElement star1 = driver.findElement(By.xpath("//div[@aria-label='Star']"));
				star1.click();
				Thread.sleep(1000);
				System.out.println("Text message 1 sended with star");
					
				WebElement textMessage2 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
				textMessage2.sendKeys("hi bhuvanesh1");
				WebElement textMessagesend2 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
				textMessagesend2.click();
				System.out.println("Text message 2 sended");
				
				Thread.sleep(1000);
				WebElement textMessage3 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
				textMessage3.sendKeys("how bhuvanesh1");
				WebElement textMessagesend3 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
				textMessagesend3.click();
				System.out.println("Text message 3 sended");
				
				System.out.println("Text message 3 sended with star");
			
				//close the chat box
				System.out.println("Close the chat box");
				WebElement starMenu2=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
				starMenu2.click();
				Thread.sleep(2000);
				System.out.println("Menu box selection");
				
				WebElement Starmenuselect2=driver.findElement(By.xpath("//div[text()='Close chat']"));
				Starmenuselect2.click();
				Thread.sleep(1000);
				System.out.println("closing the box");
		
				System.out.println("Select the Communities");
				
		//community
		Thread.sleep(3000);
		WebElement community=driver.findElement(By.xpath("//div[@title='Communities']"));
		community.click();
		
		System.out.println("Communities view all");
		Thread.sleep(3000);
		WebElement communityviewall=driver.findElement(By.xpath("//div[text()='View all']"));
		communityviewall.click();
		
		System.out.println("Select the Communities 3 Dots");
		Thread.sleep(3000);
		WebElement viewallmenu3dot=driver.findElement(By.xpath("//div[@class='p357zi0d kk3akd72 gndfcl4n qnz2jpws']/child::div/child::div/child::span"));
		viewallmenu3dot.click();
		
		System.out.println("Select the Communities info");
		Thread.sleep(3000);
		WebElement Communityinfo1=driver.findElement(By.xpath("//div[text()='Community info']"));
		Communityinfo1.click();
		
		Thread.sleep(3000);
		System.out.println("Select the Communities infoclose");
		WebElement Communityinfoclose1=driver.findElement(By.xpath("(//span[@data-icon='x'])[2]"));
		Communityinfoclose1.click();
		
		Thread.sleep(3000);
		System.out.println("Select the viewall menu 3 dot again");
		WebElement viewallmenu3dotagain=driver.findElement(By.xpath("//div[@class='p357zi0d kk3akd72 gndfcl4n qnz2jpws']/child::div/child::div/child::span"));
		viewallmenu3dotagain.click();
		
		System.out.println("Select the view members");
		Thread.sleep(3000);
		WebElement viewmembers2=driver.findElement(By.xpath("//div[text()='View members']"));
		viewmembers2.click();
		
		System.out.println("View members search");
		Thread.sleep(3000);
		WebElement membersearch1=driver.findElement(By.xpath("//div[@class='_2vDPL']/child::div/child::div/child::p"));
		membersearch1.sendKeys("Bbbb");
		
		System.out.println("View members close");
		Thread.sleep(3000);
		WebElement membersearchclose1=driver.findElement(By.xpath("(//span[@data-icon='x'])[1]"));
		membersearchclose1.click();
		
		Thread.sleep(2000);
		System.out.println(" view member back community");
		WebElement viewallback2=driver.findElement(By.xpath("//span[@data-icon='back']"));
		viewallback2.click();
		
		Thread.sleep(2000);
		System.out.println(" view member back Community back");
		WebElement communityback2=driver.findElement(By.xpath("//span[@data-icon='back']"));
		communityback2.click();
		
		System.out.println(" Select the Status");
		
		//status
		Thread.sleep(3000);
		WebElement status=driver.findElement(By.xpath("//div[@title='Status']"));
		status.click();
		
		System.out.println("Status Back");
		Thread.sleep(2000);
		WebElement statusback=driver.findElement(By.xpath("//span[@data-icon='back']"));
		statusback.click();
		
		System.out.println(" Select the Newsreader");
		
		//newsreader
		Thread.sleep(3000);
		WebElement newsreader=driver.findElement(By.xpath("//div[@title='Channels']"));
		newsreader.click();
		
		WebElement newsreaderaddoption=driver.findElement(By.xpath("//span[@data-icon='plus-large']"));
		newsreaderaddoption.click();
		System.out.println(" Successfully opened the newsreader");
		
		System.out.println(" Select the Create Channel");
		
		//newsreader - create channel
		WebElement createchannel=driver.findElement(By.xpath("//div[text()='Create channel']"));
		createchannel.click();
		
		WebElement createchannelContinue=driver.findElement(By.xpath("//div[text()='Continue']"));
		createchannelContinue.click();
		
		WebElement profilePhotoAddchannelicon = driver.findElement(By.xpath("//div[text()='Add channel icon']"));
		profilePhotoAddchannelicon.click();
		Thread.sleep(2000);
		WebElement cameraTakephoto = driver.findElement(By.xpath("//div[text()='Take photo']"));
		cameraTakephoto.click();
		Thread.sleep(2000);
		WebElement allowpopup = driver.findElement(By.xpath("//*[text()='OK, got it']"));
		allowpopup.click();
		
		//for chromebrowser we need to select popup
		Thread.sleep(2000);
		WebElement cameratakenButton = driver.findElement(By.xpath("//div[@class='p357zi0d gndfcl4n ac2vgrno mh8l8k0y k45dudtp i5tg98hk f9ovudaz przvwfww gx1rr48f f8jlpxt4 hnx8ox4h k17s6i4e ofejerhi os0tgls2 g9p5wyxn i0tg5vk9 aoogvgrq o2zu3hjb hftcxtij rtx6r8la e3b81npk oa9ii99z p1ii4mzz']/child::span"));
		cameratakenButton.click();
		Thread.sleep(2000);
		
		WebElement cameraButtonselectok = driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
		cameraButtonselectok.click();
		Thread.sleep(2000);
		
		System.out.println(" Select the Emoji");
		WebElement nameofnewgroup=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
		nameofnewgroup.sendKeys("bhuvi007");
		
		
		WebElement emog = driver.findElement(By.xpath("//Span[@data-icon='emoji-input']"));
		emog.click();
		Thread.sleep(2000);
		WebElement emogclick = driver.findElement(By.xpath("//Span[@aria-label='😁']"));
		emogclick.click();
		Thread.sleep(2000);
		
		WebElement emogrelease = driver.findElement(By.xpath("//Span[@data-icon='emoji-input']"));
		emogrelease.click();
		Thread.sleep(2000);
		
		
		//Step 17 : send a hint of picture and emji
		
		System.out.println(" Select the Description");
				WebElement description = driver.findElement(By.xpath("(//*[@class='_1N-sl'])[2]/div/child::div[1]"));
				description.sendKeys("Disaster Management");

				Thread.sleep(2000);
				WebElement describechannalemoji = driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[2]"));
				describechannalemoji.click();
				Thread.sleep(2000);
				WebElement describechannalemogclick = driver.findElement(By.xpath("//Span[@aria-label='😁']"));
				describechannalemogclick.click();
				Thread.sleep(2000);
				
				WebElement createchannelbutton = driver.findElement(By.xpath("//div[text()='Create channel']"));
				createchannelbutton.click();
				Thread.sleep(2000);
				
				System.out.println("Channel Created");
				WebElement channelMenu = driver.findElement(By.xpath("(//*[@data-icon='menu'])[2]"));
				channelMenu.click();
				
				Thread.sleep(2000);
				WebElement bhuvi1closechannel=driver.findElement(By.xpath("//div[text()='Close channel']"));
				bhuvi1closechannel.click();
				Thread.sleep(2000);
				WebElement closechannelback=driver.findElement(By.xpath("//span[@data-icon='back']"));
				closechannelback.click();
				
				System.out.println(" Delete the channel");	
				//going for delete the create channel
				Thread.sleep(3000);
				WebElement newsreader1=driver.findElement(By.xpath("//div[@title='Channels']"));
				newsreader1.click();
				
				Thread.sleep(5000);
				WebElement channelsearch=driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[1]"));
				channelsearch.sendKeys("bhuvi007");
				
				Thread.sleep(3000);
				WebElement channelselect=driver.findElement(By.xpath("//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n jn5p3u5s htm4ouj2 b7n2qyd4 ekpn4oxx']"));
				channelselect.click();
				System.out.println("Successfully channel Deleted");
				
				//menu2
				System.out.println(" Select the Channel");
				WebElement channelMenu2 = driver.findElement(By.xpath("(//*[@data-icon='menu'])[2]"));
				channelMenu2.click();
				
				WebElement channelInfo = driver.findElement(By.xpath("//*[text()='Channel info']"));
				channelInfo.click();
				
				System.out.println(" Deleted the Channel");
				WebElement channelDelete = driver.findElement(By.xpath("//*[text()='Delete channel']"));
				channelDelete.click();
				
				WebElement deleteBtn = driver.findElement(By.xpath("//*[text()='Delete']"));
				deleteBtn.click();
				
				WebElement phoneNum = driver.findElement(By.xpath("//input[@value='+91 ']")); 
				phoneNum.sendKeys("8300574079");
				
				WebElement deleteBtn1 = driver.findElement(By.xpath("//*[text()='Delete']"));
				deleteBtn1.click();

				Thread.sleep(120000);				
				
				//newschannel find 
				System.out.println(" Select the Newschannel");
				WebElement newsreaderfindchannel=driver.findElement(By.xpath("//div[@title='Channels']"));
				newsreaderfindchannel.click();
				
				WebElement newsreaderaddoptionfindchannel=driver.findElement(By.xpath("//span[@data-icon='plus-large']"));
				newsreaderaddoptionfindchannel.click();
				
				//newsreader - Find channel
				System.out.println(" Select the Find the channel");
				WebElement findchannel=driver.findElement(By.xpath("//div[text()='Find channels']"));
				findchannel.click();
				
				WebElement findchannelsearch=driver.findElement(By.xpath("//div[@title='Search']"));
				findchannelsearch.sendKeys("India Today");
				
				WebElement selectindiatoday=driver.findElement(By.xpath("(//span[text()='India Today'])[2]"));
				selectindiatoday.click();
				
				System.out.println(" Following the channel");
				WebElement selectindiatodayfollowing=driver.findElement(By.xpath("//div[@class='_1VwoK']/child::div/child::button"));
				selectindiatodayfollowing.click();
				Thread.sleep(3000);
				
				System.out.println(" Unfollowing the channel");
				//unfollow
				WebElement findMenu2 = driver.findElement(By.xpath("(//*[@data-icon='menu'])[2]"));
				findMenu2.click();
				Thread.sleep(1000);
				WebElement findunfollow=driver.findElement(By.xpath("(//div[@class='iWqod _1MZM5 _2BNs3'])[5]"));
				findunfollow.click();
				Thread.sleep(1000);
				WebElement findclosechannelunfollowconform=driver.findElement(By.xpath("(//button[@aria-disabled='false']/child::div/child::div)[2]"));
				findclosechannelunfollowconform.click();
				Thread.sleep(1000);
				System.out.println("Successfully Unfnollowed the channel");
				
				//close
				Thread.sleep(4000);
				WebElement findMenu3= driver.findElement(By.xpath("(//*[@data-icon='menu'])[2]"));
				findMenu3.click();
				
				WebElement findclosechannel=driver.findElement(By.xpath("//div[text()='Close channel']"));
				findclosechannel.click();
				
			
				WebElement closefindchannelback2=driver.findElement(By.xpath("//span[@data-icon='back']"));
				closefindchannelback2.click();
				
				WebElement closefindchannelback3=driver.findElement(By.xpath("//span[@data-icon='back']"));
				closefindchannelback3.click();
			
		System.out.println("Select the New chat");				
		//new-chat-outline
		Thread.sleep(3000);
		WebElement newchatoutline=driver.findElement(By.xpath("//div[@title='New chat']"));
		newchatoutline.click();
		Thread.sleep(2000);
		
		//new group - oustside
		System.out.println("Select the New Group");
				WebElement oustsideoptionnewGroup=driver.findElement(By.xpath("//div[@aria-label='New group']"));
				oustsideoptionnewGroup.click();
				Thread.sleep(2000);
				WebElement oustsideaddcontact=driver.findElement(By.xpath("//input[@placeholder='Search name or number']"));
				oustsideaddcontact.sendKeys("8825698484");

				Thread.sleep(2000);
				WebElement oustsideselectcontact1=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[1]"));
				oustsideselectcontact1.click();

				WebElement oustsideselectcontact2=driver.findElement(By.xpath("//input[@placeholder=' ']"));
				oustsideselectcontact2.sendKeys("9345209174");
				
				Thread.sleep(1000);
				WebElement oustsideselectcontact3=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[1]"));
				oustsideselectcontact3.click();

				Thread.sleep(1000);
				WebElement oustsidemovetocreate=driver.findElement(By.xpath("//span[@data-icon='arrow-forward']"));
				oustsidemovetocreate.click();
				
				System.out.println("hi");
				
				WebElement oustsidenameofnewgroup1=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
				oustsidenameofnewgroup1.sendKeys("Disaster management");
				Thread.sleep(1000);
				//Taking a image
				WebElement oustsideimagecreate1=driver.findElement(By.xpath("//div[text()='Add group icon']"));
				oustsideimagecreate1.click();
				Thread.sleep(1000);
				//emoji
				WebElement oustsideemoji1=driver.findElement(By.xpath("//div[text()='Emoji & sticker']"));
				oustsideemoji1.click();
				Thread.sleep(1000);
				//selecting colour of dp
				
				WebElement oustsidecolour1=driver.findElement(By.xpath("//button[@style='background-color: rgb(172, 252, 172);']"));
				oustsidecolour1.click();
				Thread.sleep(1000);
				//selecting emji
				WebElement oustsidecolouremoji1=driver.findElement(By.xpath("//button[@aria-label='Emojis selector']"));
				oustsidecolouremoji1.click();
				Thread.sleep(1000);
				WebElement oustsidecolouremojisymbol=driver.findElement(By.xpath("//span[@data-emoji='😄']"));
				oustsidecolouremojisymbol.click();
				Thread.sleep(1000);
				//save
				WebElement oustsidesavenewgroup1=driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
				oustsidesavenewgroup1.click();
				Thread.sleep(5000);
				WebElement newgroupsave=driver.findElement(By.xpath("//div[@class='b9fczbqn p357zi0d j1p1mz06 gpgqxepn th20vg8r qfejxiq4']/child::div"));
				newgroupsave.click();
				
				Thread.sleep(1000);
				WebElement oustsiderightmenu = driver.findElement(By.xpath("//span[@class='kiiy14zj']"));
				oustsiderightmenu.click();
				Thread.sleep(1000);
				WebElement oustsidecloseChat = driver.findElement(By.xpath("//*[text()='Close chat']"));
				oustsidecloseChat.click();
				System.out.println("saved the New Group");	
				
				System.out.println("Select the New community");
				//	New community
				WebElement oustsidemenu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
				oustsidemenu.click();
				
				//selecting new community
				WebElement oustsidenewcommunity1=driver.findElement(By.xpath("//div[text()='New community']"));
				oustsidenewcommunity1.click();
				Thread.sleep(2000);
				
				//selecting arrow
				WebElement oustsidenewcommunityarrownext1=driver.findElement(By.xpath("//div[@aria-label='Continue new community creation']"));
				oustsidenewcommunityarrownext1.click();
				
				Thread.sleep(2000);
				
				
				//Community name
				WebElement oustsidenameofnewcommunity1=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
				oustsidenameofnewcommunity1.sendKeys("Vularable area");
				
				Thread.sleep(2000);
				
				//Taking a add community icon image
				WebElement oustsidenewcommunitydp1=driver.findElement(By.xpath("//div[text()='Add community icon']"));
				oustsidenewcommunitydp1.click();
				
				Thread.sleep(2000);
				
				//emoji
				WebElement oustsidenewcommunityemoji1=driver.findElement(By.xpath("//div[text()='Emoji & sticker']"));
				oustsidenewcommunityemoji1.click();
				
				Thread.sleep(2000);
				
				//selecting colour of dp
				
				WebElement oustsidenewcommunitydpcolour=driver.findElement(By.xpath("//button[@style='background-color: rgb(172, 252, 172);']"));
				oustsidenewcommunitydpcolour.click();
				
				Thread.sleep(2000);
				System.out.println("thank you5");
				//selecting emji
				WebElement oustsidecolouremoji=driver.findElement(By.xpath("//span[@data-icon='media-editor-emoji']"));
				oustsidecolouremoji.click();
				
				Thread.sleep(2000);
				
				WebElement oustsidecolouremoji11=driver.findElement(By.xpath("//span[@data-emoji='😄']"));
				oustsidecolouremoji11.click();
				
				Thread.sleep(2000);
				
				WebElement oustsidedpsave=driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
				oustsidedpsave.click();
				
				Thread.sleep(2000);
				System.out.println("thank you5");
				//save
				WebElement oustsidecommsave=driver.findElement(By.xpath("//div[@aria-label='Create community']"));
				oustsidecommsave.click();
			
				Thread.sleep(2000);
				
				System.out.println("thank you5");				
		WebElement oustsideback=driver.findElement(By.xpath("//span[@data-icon='back']"));
		oustsideback.click();
		
		Thread.sleep(5000);
		System.out.println("Closed the Group");
		
		
		System.out.println("program for leftside menu ");
		//This is a program for leftside menu 
		
		//menu
		System.out.println("Select for New Group");
		//new group
			WebElement menu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			menu.click();
			
			//new group - oustside
			
			WebElement oustsideoptionnewGroup1=driver.findElement(By.xpath("//div[@aria-label='New group']"));
			oustsideoptionnewGroup1.click();
			Thread.sleep(2000);
			WebElement oustsideaddcontact1=driver.findElement(By.xpath("//input[@placeholder='Search name or number']"));
			oustsideaddcontact1.sendKeys("8825698484");

			Thread.sleep(2000);
			WebElement oustsideselectcontact19=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[1]"));
			oustsideselectcontact19.click();

			WebElement oustsideselectcontact29=driver.findElement(By.xpath("//input[@placeholder=' ']"));
			oustsideselectcontact29.sendKeys("9345209174");
			
			Thread.sleep(1000);
			WebElement oustsideselectcontact39=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[1]"));
			oustsideselectcontact39.click();

			Thread.sleep(1000);
			WebElement oustsidemovetocreate9=driver.findElement(By.xpath("//span[@data-icon='arrow-forward']"));
			oustsidemovetocreate9.click();
			
			System.out.println("hi");
			
			WebElement oustsidenameofnewgroup19=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
			oustsidenameofnewgroup19.sendKeys("Disaster management");
			Thread.sleep(1000);
			//Taking a image
			WebElement oustsideimagecreate18=driver.findElement(By.xpath("//div[text()='Add group icon']"));
			oustsideimagecreate18.click();
			Thread.sleep(1000);
			//emoji
			WebElement oustsideemoji18=driver.findElement(By.xpath("//div[text()='Emoji & sticker']"));
			oustsideemoji18.click();
			Thread.sleep(1000);
			//selecting colour of dp
			
			WebElement oustsidecolour18=driver.findElement(By.xpath("//button[@style='background-color: rgb(172, 252, 172);']"));
			oustsidecolour18.click();
			Thread.sleep(1000);
			//selecting emji
			WebElement oustsidecolouremoji18=driver.findElement(By.xpath("//button[@aria-label='Emojis selector']"));
			oustsidecolouremoji18.click();
			Thread.sleep(1000);
			WebElement oustsidecolouremojisymbol8=driver.findElement(By.xpath("//span[@data-emoji='😄']"));
			oustsidecolouremojisymbol8.click();
			Thread.sleep(1000);
			//save
			WebElement oustsidesavenewgroup18=driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
			oustsidesavenewgroup18.click();
			Thread.sleep(5000);
			WebElement newgroupsave8=driver.findElement(By.xpath("//div[@class='b9fczbqn p357zi0d j1p1mz06 gpgqxepn th20vg8r qfejxiq4']/child::div"));
			newgroupsave8.click();
			
			Thread.sleep(1000);
			WebElement oustsiderightmenu8 = driver.findElement(By.xpath("//span[@class='kiiy14zj']"));
			oustsiderightmenu8.click();
			Thread.sleep(1000);
			WebElement oustsidecloseChat8 = driver.findElement(By.xpath("//*[text()='Close chat']"));
			oustsidecloseChat8.click();
			
			System.out.println("Select the New community");
			//	New community
			WebElement menuNewcommunity=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			menuNewcommunity.click();
			
			//selecting new community
			WebElement newGroupNewcommunity=driver.findElement(By.xpath("//div[text()='New community']"));
			newGroupNewcommunity.click();
			Thread.sleep(2000);
			
			//selecting arrow
			WebElement arrownext=driver.findElement(By.xpath("//div[@aria-label='Continue new community creation']"));
			arrownext.click();
			
			Thread.sleep(2000);
			
			
			//Community name
			WebElement nameofnewcomm=driver.findElement(By.xpath("//div[@class='_1N-sl']/child::div/child::div/child::p"));
			nameofnewcomm.sendKeys("bhuvi1");
			
			Thread.sleep(2000);
			
			//Taking a add community icon image
			WebElement comdp=driver.findElement(By.xpath("//div[text()='Add community icon']"));
			comdp.click();
			
			Thread.sleep(2000);
			
			//emoji
			WebElement emoji90=driver.findElement(By.xpath("//div[text()='Emoji & sticker']"));
			emoji90.click();
			
			Thread.sleep(2000);
			
			//selecting colour of dp
			
			WebElement colour90=driver.findElement(By.xpath("//button[@style='background-color: rgb(172, 252, 172);']"));
			colour90.click();
			
			Thread.sleep(2000);
			
			//selecting emji
			WebElement colouremoji90=driver.findElement(By.xpath("//span[@data-icon='media-editor-emoji']"));
			colouremoji90.click();
			
			Thread.sleep(2000);
			
			WebElement colouremoji190=driver.findElement(By.xpath("//span[@data-emoji='😄']"));
			colouremoji190.click();
			
			Thread.sleep(2000);
			
			WebElement dpsave=driver.findElement(By.xpath("//span[@data-icon='checkmark-large']"));
			dpsave.click();
			
			Thread.sleep(2000);
			
			//save
			WebElement commsave=driver.findElement(By.xpath("//div[@aria-label='Create community']"));
			commsave.click();
		
			Thread.sleep(2000);
			
			
			WebElement back=driver.findElement(By.xpath("//span[@data-icon='back']"));
			back.click();
			
			
			//exit the community and achieve again
			System.out.println("Select the Arch");

			WebElement achievemenu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			achievemenu.click();
			
			WebElement newachieve=driver.findElement(By.xpath("//div[text()='Archived']"));
			newachieve.click();
			Thread.sleep(2000);
			
			System.out.println("Enter into Achieve");
			//selectarch
			WebElement selachieve=driver.findElement(By.xpath("(//div[@class='_8nE1Y'])[3]"));
			selachieve.click();
			Thread.sleep(2000);
			
			WebElement achievemenu1=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			achievemenu1.click();
			Thread.sleep(2000);
			
			WebElement achieveclosed=driver.findElement(By.xpath("//div[text()='Close chat']"));
			achieveclosed.click();
			Thread.sleep(2000);
			
			System.out.println("Select the Select chat");
			//Select chat
			
			WebElement selemessmenu=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			selemessmenu.click();
			
			WebElement selemess=driver.findElement(By.xpath("//div[text()='Select chats']"));
			selemess.click();
			
			WebElement select1=driver.findElement(By.xpath("(//div[@class='g0rxnol2 l7jjieqr dh5rsm73 hpdpob1j neme6l2y ajgl1lbb dntxsmpk ixn6u0rb s2vc4xk1 o0wkt7aw cgi16xlc'])[1]"));
			select1.click();
			
			WebElement optionmuteornonmute=driver.findElement(By.xpath("//span[@data-icon='call-menu']"));
			optionmuteornonmute.click();
			
			System.out.println("Mark as readed");
			//mark as read
			WebElement makeread=driver.findElement(By.xpath("//div[@aria-label='Mark as unread']"));
			makeread.click();
			
			
			//Star messages
			//Step 3 : Selecting a number to send a message 
									
			WebElement achievemenu9=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			achievemenu9.click();
			Thread.sleep(5000);
			WebElement newachieve9=driver.findElement(By.xpath("//div[text()='Starred messages']"));
			newachieve9.click();
			Thread.sleep(5000);
			
			WebElement back90=driver.findElement(By.xpath("//span[@data-icon='back']"));
			back90.click();
			Thread.sleep(5000);
			
			/*
			//whatsapp window
			WebElement whatsappwindow=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			whatsappwindow.click();
			Thread.sleep(5000);
			
			WebElement whatsappwindow1=driver.findElement(By.xpath("//div[text()='Get WhatsApp for Windows']"));
			whatsappwindow1.click();
			Thread.sleep(3000);
			
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
			Thread.sleep(3000);
			
			
			driver.switchTo().alert();
			Thread.sleep(5000);
			
			//logout
			WebElement logout=driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]"));
			logout.click();
			
			WebElement logout1=driver.findElement(By.xpath("//div[text()='Log out']"));
			logout1.click();
			
			WebElement logout12=driver.findElement(By.xpath("//div[text()='Log out']"));
			logout12.click();
			
			System.out.println("drag and drop");
		*/
			//Step 3 : Selecting a number to send a message 
			WebElement search4 = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
			Thread.sleep(10000);
			search4.sendKeys("93452 09174");

			WebElement conOpen = driver.findElement(By.xpath("//span[@title='Bbbbb']"));
			conOpen.click();
			
			//Actions act=new Actions(driver);
			//act.doubleClick(conOpen).perform();
			
			//Step 4 : Sending a Text Message 
			WebElement textMessage = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
			textMessage.sendKeys("hello bhuvanesh");
			WebElement send1 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
			send1.click();
			Thread.sleep(1000);
			WebElement textMessage15 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
			textMessage15.sendKeys("hi bhuvanesh1");
			WebElement send11 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
			send11.click();
			
			Thread.sleep(1000);
			
			WebElement textMessage12 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
			textMessage12.sendKeys("how bhuvanesh1");
			WebElement send12 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
			send12.click();
			System.out.println("hi2");
			Thread.sleep(1000);
			
			WebElement moveTo8 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo8).perform();
			
			
			WebElement arrow78 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		  arrow78.click();
		  Thread.sleep(1000);
		  WebElement star17 = driver.findElement(By.xpath("//div[@aria-label='Star']"));
			star17.click();
			Thread.sleep(1000);
			System.out.println("hi2");
			
			WebElement attach = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
			attach.click();

			System.out.println("Sending Pdf");
			//Step 6 : Sending a Document - Pdf Document
			WebElement document =driver.findElement(By.xpath("//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n ajgl1lbb lniyxyh2 fooq7fky bcfko8ch']")); 
			document.click();
			
			Thread.sleep(3000);
			Robot key98 = new Robot();
			String file9 = "C:\\Users\\Balaji\\Downloads\\MISSION I'MPOSSIBLE _TNPSC_Group 4 Schedule & Topics__.pdf (1)"; 
			StringSelection imagePath9 = new StringSelection(file9);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath9, null);
			key98.keyPress(KeyEvent.VK_CONTROL);
			key98.keyPress(KeyEvent.VK_V);
			
			key98.keyRelease(KeyEvent.VK_V);
			key98.keyRelease(KeyEvent.VK_CONTROL);
			
			key98.keyPress(KeyEvent.VK_ENTER);
			key98.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			
			key98.keyPress(KeyEvent.VK_ENTER);
			key98.keyRelease(KeyEvent.VK_ENTER);	
			
			
			Thread.sleep(3000);
			
			System.out.println("Sending Word");
			//Step 8 : Selecting a option for document
					WebElement attachword = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
					attachword.click();
					
			//Step 9 : Sending a Document - Word Document 
					WebElement documentword =driver.findElement(By.xpath("//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t gndfcl4n ajgl1lbb lniyxyh2 fooq7fky bcfko8ch']")); 
					documentword.click();
					
					Thread.sleep(3000);
					Robot key1 = new Robot();
					String file1 = "C:\\Users\\Balaji\\Downloads\\Selenium Q&A.docx"; 
					StringSelection imagePath1 = new StringSelection(file1);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath1, null);
					key1.keyPress(KeyEvent.VK_CONTROL);
					key1.keyPress(KeyEvent.VK_V);
					
					key1.keyRelease(KeyEvent.VK_V);
					key1.keyRelease(KeyEvent.VK_CONTROL);
					
					key1.keyPress(KeyEvent.VK_ENTER);
					key1.keyRelease(KeyEvent.VK_ENTER);
					
					Thread.sleep(5000);
					
					key1.keyPress(KeyEvent.VK_ENTER);
					key1.keyRelease(KeyEvent.VK_ENTER);
		
					Thread.sleep(3000);
					
					System.out.println("Sending Pdf");
					
				//Selecting a option for Photo and video
					System.out.println("Sending image");		
							WebElement attachimage = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
							attachimage.click();
					//Sending a Document - image Document 
							WebElement documentimage =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[2]")); 
							documentimage.click();
							
							Thread.sleep(3000);
							Robot key2 = new Robot();
							String fileimage = "C:\\Users\\Balaji\\Downloads\\lord-venkateswara-on-red-curtain-5jbb59cgqn9ripg4.jpg"; 
							StringSelection imagePath2 = new StringSelection(fileimage);
							Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath2, null);
							key2.keyPress(KeyEvent.VK_CONTROL);
							key2.keyPress(KeyEvent.VK_V);
							
							key2.keyRelease(KeyEvent.VK_V);
							key2.keyRelease(KeyEvent.VK_CONTROL);
							
							key2.keyPress(KeyEvent.VK_ENTER);
							key2.keyRelease(KeyEvent.VK_ENTER);
							
							Thread.sleep(5000);
							
							key2.keyPress(KeyEvent.VK_ENTER);
							key2.keyRelease(KeyEvent.VK_ENTER);
							
							//Selecting a option for Photo and video
							System.out.println("Sending Video");
							WebElement attachVideo = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
							attachVideo.click();
							//Step 13 : Sending a Document - video Document 
							WebElement documentvideo =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[2]")); 
							documentvideo.click();
							
							Thread.sleep(3000);
							Robot key3 = new Robot();
							String filevideo = "C:\\Users\\Balaji\\Downloads\\Coffee Container Kiosk 10ft 3D Model Preview.mp4"; 
							StringSelection videoPath2 = new StringSelection(filevideo);
							Toolkit.getDefaultToolkit().getSystemClipboard().setContents(videoPath2, null);
							key3.keyPress(KeyEvent.VK_CONTROL);
							key3.keyPress(KeyEvent.VK_V);
							
							key3.keyRelease(KeyEvent.VK_V);
							key3.keyRelease(KeyEvent.VK_CONTROL);
							
							key3.keyPress(KeyEvent.VK_ENTER);
							key3.keyRelease(KeyEvent.VK_ENTER);
							
							Thread.sleep(5000);
							
							key3.keyPress(KeyEvent.VK_ENTER);
							key3.keyRelease(KeyEvent.VK_ENTER);

							Thread.sleep(3000);				
						
							//Camera
							//Step 14 : Selecting a option for Camera
							System.out.println("Capturing a Photo and send");
							WebElement attachCamera = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
							attachCamera.click();
							
							WebElement documentCamera =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[3]")); 
							documentCamera.click();
							
							Thread.sleep(5000);
							//Step 15 : Selecting a option for popup - manually and automation both
							WebElement allow = driver.findElement(By.xpath("//*[text()='OK, got it']"));
							allow.click();
							
							Thread.sleep(5000);
							//Step 16 : Taken a Picture using Camera
							WebElement cameraButton = driver.findElement(By.xpath("//span[@data-icon='camera']"));
							cameraButton.click();
							Thread.sleep(2000);
							//Step 17 : send a hint of picture and emji
							//WebElement messagenoteimage = driver.findElement(By.xpath("(//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd p357zi0d dnb887gk gjuq5ydh i2cterl7 fhf7t426 sap93d0t r15c9g6i cm280p3y ln8gz9je gc15jzxb eujn52yf l9g3jx6n ckm995li lyvj5e2u qpz0rf1m bbr44loe ooj5yc5b m8i16etx cw0ivh8j']/child::div/child::div)[1]"));
					
							//messagenoteimage.sendKeys("Captured image");
							//Thread.sleep(2000);
							WebElement emog7 = driver.findElement(By.xpath("//Span[@data-icon='emoji-input']"));
							emog7.click();
							Thread.sleep(2000);
							WebElement emogclick7 = driver.findElement(By.xpath("//Span[@aria-label='😁']"));
							emogclick7.click();
							Thread.sleep(2000);
							WebElement sendcamera = driver.findElement(By.xpath("//div[@class='g0rxnol2']"));
							sendcamera.click();
							Thread.sleep(3000);
							
							//Contact
							//Step 14 : Selecting a option for Contact
							System.out.println("Sending Contact");
							WebElement attachContact = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
							attachContact.click();
							
							WebElement contact =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[4]")); 
							contact.click();
							
							WebElement selectContact = driver.findElement(By.xpath("//*[text()='1 unknown11']"));
							selectContact.click();
							Thread.sleep(3000);
							WebElement sendContact = driver.findElement(By.xpath("//span[@aria-label='Send']"));
							sendContact.click();
							WebElement sendContact1 = driver.findElement(By.xpath("//*[@data-icon='send']"));
							sendContact1.click();
							Thread.sleep(2000);
								
							System.out.println("Sending Emoji");				
			//Emoji
			WebElement emoji = driver.findElement(By.xpath("//span[@data-icon='smiley']"));
			emoji.click();
			WebElement selectEmoji = driver.findElement(By.xpath("//span[@data-emoji-index='3']"));
			selectEmoji.click();
			WebElement sendEmoji = driver.findElement(By.xpath("//*[@data-icon='send']"));
			sendEmoji.click();
			
			Thread.sleep(2000);
			
			System.out.println("Sending Voice Message");
			//Voice Message
			WebElement voice = driver.findElement(By.xpath("//span[@data-icon='ptt']"));
			voice.click();
			Thread.sleep(8000);
			WebElement sendVoice = driver.findElement(By.xpath("//button[@aria-label='Send']"));
			sendVoice.click();
			
			System.out.println("Sending Poll");
			//poll
			WebElement attachpoll = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
			attachpoll.click();
			//Step 13 : Sending a Document - video Document 
			WebElement poll =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[5]")); 
			poll.click();
			Thread.sleep(2000);
			
			WebElement polltext =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[1]")); 
			polltext.sendKeys("who are you");
			Thread.sleep(2000);
			
			WebElement pollquestion3 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[1]")); 
			pollquestion3.click();
			Thread.sleep(2000);
			
			WebElement emoji7 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
			emoji7.click();
			Thread.sleep(2000);
			
			WebElement polltext1 =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]")); 
			polltext1.sendKeys("Vignesh");
			Thread.sleep(2000);
			
			WebElement pollquestion1 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[2]")); 
			pollquestion1.click();
			Thread.sleep(2000);
			
			WebElement emoji1 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
			emoji1.click();
			Thread.sleep(2000);
			
			WebElement polltext2 =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[3]")); 
			polltext2.sendKeys("rajesh");
			Thread.sleep(2000);
			
			WebElement pollquestion2 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[3]")); 
			pollquestion2.click();
			
			WebElement emoji2 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
			emoji2.click();
			Thread.sleep(2000);
			
			WebElement polltext3 =driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[4]")); 
			polltext3.sendKeys("bhuvanesh");
			Thread.sleep(2000);
			
			WebElement pollquestion4 =driver.findElement(By.xpath("(//span[@data-icon='emoji-input'])[4]")); 
			pollquestion4.click();
			
			WebElement emoji4 =driver.findElement(By.xpath("//span[@aria-label='😄']")); 
			emoji4.click();
			Thread.sleep(2000);
			
			//Drag and drop
			//WebElement drag = driver.findElement(By.xpath("(//div[@class='g9zvcdbd j8fxo1e4'])[2]"));
			//WebElement drop = driver.findElement(By.xpath("(//div[@class='g9zvcdbd j8fxo1e4'])[3]"));
					
			
			//Actions act = new Actions(driver);
			//act.dragAndDrop(drag, drop).perform();
			//Thread.sleep(2000);
			//System.out.println("drag and drop");
			
			
			WebElement pollsend =driver.findElement(By.xpath("//span[@data-icon='send']")); 
			pollsend.click();
			
			System.out.println("Sending Stricker");
			//New Stickers
			
			WebElement option = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
			option.click();
			//Step 13 : Sending a Document - video Document 
			WebElement newSticker =driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q _2UNQo'])[6]")); 
			newSticker.click();
			Thread.sleep(2000);
			
			Robot key9 = new Robot();
			String image = "C:\\Users\\Balaji\\Downloads\\lord-venkateswara-on-red-curtain-5jbb59cgqn9ripg4.jpg"; 
			
			StringSelection newsticker = new StringSelection(image);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(newsticker, null);
			key9.keyPress(KeyEvent.VK_CONTROL);
			key9.keyPress(KeyEvent.VK_V);
			
			key9.keyRelease(KeyEvent.VK_V);
			key9.keyRelease(KeyEvent.VK_CONTROL);
			
			key9.keyPress(KeyEvent.VK_ENTER);
			key9.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			
			key9.keyPress(KeyEvent.VK_ENTER);
			key9.keyRelease(KeyEvent.VK_ENTER);

			System.out.println("Selecting Message Info");
			//Message Info
			WebElement moveToy = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveToy).perform();
			WebElement arrow4 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow4.click();
			WebElement messageInfo = driver.findElement(By.xpath("//*[text()='Message info']"));
			messageInfo.click();
			Thread.sleep(5000);
			WebElement messageInfoClose = driver.findElement(By.xpath("//div[@class='kk3akd72 p6y6hbba']/child::div/child::span"));
			messageInfoClose.click();
			Thread.sleep(3000);
			System.out.println("0");
			
			System.out.println("Reply for a message");
			//Reply
			WebElement moveTo1 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo1).perform();
			WebElement arrow1 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow1.click();
			WebElement reply = driver.findElement(By.xpath("//*[text()='Reply']"));
			reply.click();
			WebElement replyMsg = driver.findElement(By.xpath("(//div[@contenteditable='true'])[2]/child::p"));
			replyMsg.sendKeys("Hai");
			WebElement replySend = driver.findElement(By.xpath("//span[@data-icon='send']"));
			replySend.click();
			
			System.out.println("React for a Message");
			//React
			WebElement moveTo2z = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo2z).perform();
			WebElement arrow2y = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow2y.click();
			WebElement react = driver.findElement(By.xpath("//*[text()='React']"));
			react.click();
			WebElement selectReact = driver.findElement(By.xpath("//div[@role='dialog']/child::div/child::div[4]"));
			selectReact.click();
			System.out.println("2");
			
			System.out.println("Forward a message");
			//Forward
			WebElement moveTo3 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo3).perform();
			WebElement arrow3 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow3.click();
			WebElement forward = driver.findElement(By.xpath("//*[text()='Forward']"));
			forward.click();
			WebElement forwardIcon = driver.findElement(By.xpath("//span[@data-icon='forward']/parent::button"));
			forwardIcon.click();
			WebElement search1 = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
			Thread.sleep(5000);
			search1.sendKeys("8825698484");
			Thread.sleep(3000);
			WebElement conOpen1 = driver.findElement(By.xpath("//span[@title='BR']"));
			conOpen1.click();
			WebElement forwardSend = driver.findElement(By.xpath("//span[@data-icon='send']"));
			forwardSend.click();
			
			WebElement achievemenu11117=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			achievemenu11117.click();
			Thread.sleep(2000);
			
			WebElement achieveclosed1=driver.findElement(By.xpath("//div[text()='Close chat']"));
			achieveclosed1.click();
			Thread.sleep(2000);
			
			WebElement search42 = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
			Thread.sleep(1000);
			search42.sendKeys("93452 09174");

			WebElement conOpen31 = driver.findElement(By.xpath("//span[@title='Bbbbb']"));
			conOpen31.click();
			
			WebElement textMessage123 = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
			textMessage123.sendKeys("hello hi bhuvaneshraj1");
			WebElement send123 = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
			send123.click();
			Thread.sleep(2000);
			
			System.out.println("Pin the Message");
			//Pin
			WebElement moveTo4 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo4).perform();
			WebElement arrow4z = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow4z.click();  
			Thread.sleep(2000);
			WebElement pin = driver.findElement(By.xpath("//*[text()='Pin']"));
			pin.click();
			Thread.sleep(2000);
			WebElement pinSend = driver.findElement(By.xpath("//div[text()='Pin']"));
			pinSend.click();
			System.out.println("4");
			Thread.sleep(2000);
			
			System.out.println("unpin the message");
			//Unpin
			WebElement movePin = driver.findElement(By.xpath("//span[@data-icon='pinned3']"));
			action.moveToElement(movePin).perform();
			Thread.sleep(2000);
			WebElement unpinArrow = driver.findElement(By.xpath("//*[@data-icon='down-context']"));
			unpinArrow.click();
			Thread.sleep(2000);
			WebElement unPin = driver.findElement(By.xpath("//*[text()='Unpin']"));
			unPin.click();
			Thread.sleep(2000);
			System.out.println("5");
			Thread.sleep(2000);
			
			/*
			//Keep
			WebElement moveTo5 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo5).perform();
			Thread.sleep(2000);
			WebElement arrow5 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow5.click();
			Thread.sleep(2000);
			WebElement keep = driver.findElement(By.xpath("//*[text()='Keep']"));
			keep.click();
			Thread.sleep(2000);
			WebElement keepOk = driver.findElement(By.xpath("//div[text()='OK']/parent::div/parent::button"));
			keepOk.click();
			System.out.println("6");
			
			//Unkeep
			WebElement moveTo6 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo6).perform();
			Thread.sleep(2000);
			WebElement arrow6 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow6.click();
			Thread.sleep(2000);
			WebElement unKeep = driver.findElement(By.xpath("//*[text()='Unkeep']"));
			unKeep.click();
			Thread.sleep(2000);
			WebElement unKeepOk = driver.findElement(By.xpath("//div[text()='OK']/parent::div/parent::button"));
			unKeepOk.click();
			System.out.println("7");
			*/
			
			System.out.println("Delete the Message");
			//Delete
			WebElement moveTo7 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
			action.moveToElement(moveTo7).perform();
			Thread.sleep(2000);
			WebElement arrow7 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
			arrow7.click();
			Thread.sleep(2000);
			WebElement delete = driver.findElement(By.xpath("//*[text()='Delete']"));
			delete.click();
			Thread.sleep(2000);
			WebElement deleteForMe = driver.findElement(By.xpath("//*[text()='Delete for me']/parent::div/parent::button"));
			deleteForMe.click();
			Thread.sleep(2000);
			System.out.println("Deleted the chat");
			
			System.out.println(" Select the menu 2 right side");
			
			//Menu
			//WebElement menu = driver.findElement(By.xpath("//*[@class='kiiy14zj']"));
			//menu.click();

			//Contact Info
			 
			 System.out.println(" Select the Contact info");
			WebElement conatactmenu2=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			conatactmenu2.click();
			Thread.sleep(2000);
			WebElement conInfo = driver.findElement(By.xpath("//*[text()='Contact info']"));
			conInfo.click();
			WebElement close = driver.findElement(By.xpath("//div[@aria-label='Close']/child::span"));
			close.click();
			System.out.println(" Select the back for select message");

			//Select Messages
			
			System.out.println(" Select the message");  
			WebElement selectmessage=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			selectmessage.click();
			Thread.sleep(2000);
			
			WebElement selectMessages = driver.findElement(By.xpath("//*[text()='Select messages']"));
			selectMessages.click();
			WebElement checkBox = driver.findElement(By.xpath("(//div[@aria-hidden='true'])[1]"));
			checkBox.click();
			WebElement deleteSelectMsg = driver.findElement(By.xpath("//*[@data-icon='delete']"));
			deleteSelectMsg.click();
			WebElement deleteFor = driver.findElement(By.xpath("//*[text()='Delete for me']"));
			Thread.sleep(3000);
			deleteFor.click();
			
			//selectmessage
			System.out.println(" Select the mute noftification");  
			WebElement selectnotmessage=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			selectnotmessage.click();
			Thread.sleep(2000);
			   WebElement mutenotification = driver.findElement(By.xpath("//div[contains(text(),'Mute notifications')]"));
			   mutenotification.click();
			   WebElement radiobutton = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/label[2]/div[1]/div[1]"));
			   radiobutton.click();
			   WebElement mute = driver.findElement(By.xpath("//div[text()='Mute']"));
			   mute.click();
				
				System.out.println(" Select the back for disappearing message");  
			  
			

			//Disappearing messages
				
				System.out.println(" Select the Disappearing message");  
			Thread.sleep(3000);
			WebElement selectdispmessage=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			selectdispmessage.click();
			WebElement disappearingMessages = driver.findElement(By.xpath("//*[text()='Disappearing messages']"));
			disappearingMessages.click();
			WebElement disappear = driver.findElement(By.xpath("(//*[@class='p357zi0d'])[1]"));
			disappear.click();
			WebElement backkl = driver.findElement(By.xpath("(//*[@data-icon='back'])[2]"));
			backkl.click();
			Thread.sleep(3000);
			
			System.out.println(" Select the back for clear");  
			
			//Clear chat - working
			
			System.out.println(" Select the clear chat");  
			WebElement selectclearmessageds=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			selectclearmessageds.click();
			Thread.sleep(2000);
			WebElement clearChat = driver.findElement(By.xpath("//*[text()='Clear chat']"));
			clearChat.click();
			//WebElement clearChatButton = driver.findElement(By.xpath("//*[text()='Clear chat']"));
			WebElement clearChatButton = driver.findElement(By.xpath("//button[@class='emrlamx0 aiput80m h1a80dm5 sta02ykp g0rxnol2 l7jjieqr hnx8ox4h f8jlpxt4 l1l4so3b le5p0ye3 m2gb0jvt rfxpxord gwd8mfxi mnh9o63b qmy7ya1v dcuuyf4k swfxs4et bgr8sfoe a6r886iw fx1ldmn8 orxa12fk bkifpc9x o2v2jkg7 lpmlzjg7 b3vjre3n s48w15s6 v9zxeiga losjomng dul83ws3 hjo1mxmu snayiamo hco6ovyk jzidrpjq c1yuexcr kk3bglv9 germ6ouh']/child::div/child::div"));
			Thread.sleep(3000);
			clearChatButton.click();
			Thread.sleep(3000);
			System.out.println(" Select the back for delete");  
			//Delete chat
			
			System.out.println(" Select the delete message");  
			WebElement selectdeletemessages=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			selectdeletemessages.click();
			Thread.sleep(2000);
			WebElement deleteChat = driver.findElement(By.xpath("//div[text()='Delete chat']"));
			deleteChat.click();
			Thread.sleep(3000);
			WebElement deleteChatButton = driver.findElement(By.xpath("//div[text()='Delete chat']"));
			deleteChatButton.click();
			Thread.sleep(3000);
			
			System.out.println(" Select the back for sending text message");  
			
			
			
			System.out.println(" Select the number for message");  
			//Step 3 : Selecting a number to send a message 
			WebElement search41 = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
			Thread.sleep(10000);
			search41.sendKeys("93452 09174");

			WebElement conOpenv = driver.findElement(By.xpath("//span[@title='Bbbbb']"));
			conOpenv.click();
			
			System.out.println(" Select the contact for text message");  
			
			//Actions act=new Actions(driver);
			//act.doubleClick(conOpen).perform();
			
			System.out.println(" Select the menu2sendingtextmessage"); 
			//Step 4 : Sending a Text Message 
			WebElement menu2sendingtextmessage = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
			menu2sendingtextmessage.sendKeys("hello bhuvanesh");
			WebElement send1f = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
			send1f.click();
			Thread.sleep(1000);
			WebElement textMessage15f = driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w g0rxnol2'])[2]"));
			textMessage15f.sendKeys("hi bhuvanesh1");
			WebElement send11f = driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']"));
			send11f.click();
			Thread.sleep(2000);
			System.out.println(" Select the back for text message");  
			
			System.out.println(" Select the block");  
			
			//block 
			WebElement menu2block=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			menu2block.click();
			Thread.sleep(2000);
			WebElement block= driver.findElement(By.xpath("//li[@class='jScby Iaqxu FCS6Q'][9]"));
			block.click();
			Thread.sleep(2000);
			WebElement blockclick=driver.findElement(By.xpath("//button//div[contains(text(),'Block')]"));
			blockclick.click();
			Thread.sleep(2000);
			System.out.println(" Select the back for unblock");   
			
			//unblock
			System.out.println(" Select the Unblock from menu 2");
			WebElement menu2unblock=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			menu2unblock.click();
			Thread.sleep(2000);
			WebElement unblock=driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q']/child::div)[9]"));
			unblock.click();  
			Thread.sleep(2000);
			 WebElement unblockclick=driver.findElement(By.xpath("//button//div[contains(text(),'Unblock')]"));
			 unblockclick.click();
			 Thread.sleep(2000);
			 System.out.println(" Select the back for report");
			 
			 System.out.println(" Select the Report from menu 2");
			 //Report
			 WebElement reportmenu2=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			 reportmenu2.click();
				Thread.sleep(2000);
				WebElement report=driver.findElement(By.xpath("(//li[@class='jScby Iaqxu FCS6Q']/child::div)[8]"));
			  report.click();
				Thread.sleep(2000);
			WebElement cancelreport=driver.findElement(By.xpath("//button//div[contains(text(),'Cancel')]"));
			cancelreport.click();  
			Thread.sleep(2000);
			System.out.println(" Select the menu 2 for close chat");  
			  
			  
			//Close Chat
			System.out.println(" Select the close chat from menu 2");
			Thread.sleep(3000);
			WebElement closechatmenu2=driver.findElement(By.xpath("(//span[@data-icon='menu'])[2]"));
			closechatmenu2.click();
			Thread.sleep(2000);
			WebElement closeChat = driver.findElement(By.xpath("//*[text()='Close chat']"));
			closeChat.click();
			Thread.sleep(8000);
			System.out.println(" Select the back from close chat from menu 2");

			
			System.out.println(" Select the main 3 dot option");
			//Contact Page Menu
			WebElement conPageMenu = driver.findElement(By.xpath("//div[@class='_3OtEr'][3]/child::div/child::span"));
			conPageMenu.click();
			
			//Setting
			System.out.println(" Select the menu in setting");
			WebElement setting = driver.findElement(By.xpath("//*[text()='Settings']"));
			setting.click();

			System.out.println(" Select the DP option");
			WebElement optionz = driver.findElement(By.xpath("//*[@class='fe5nidar fs7pz031 e1gr2w1z p5g9vl8k'][1]"));
			optionz.click();
			Thread.sleep(3000);
			WebElement backSetting = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting.click();
			System.out.println(" Select the back for Notifiaction");
			
			System.out.println(" Select the Notification");
			WebElement notification = driver.findElement(By.xpath("//*[text()='Notifications']"));
			notification.click();
			Thread.sleep(3000);
			WebElement backSetting1 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting1.click();
			System.out.println(" Select the back for Privacy");
			
			System.out.println(" Select the Privacy");
			WebElement privacy = driver.findElement(By.xpath("//*[text()='Privacy']"));
			privacy.click();
			Thread.sleep(3000);
			WebElement backSetting2 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting2.click();
			System.out.println(" Select the back for Security");
			
			System.out.println(" Select the security");
			WebElement security = driver.findElement(By.xpath("//*[text()='Security']"));
			security.click();
			Thread.sleep(3000);
			WebElement backSetting3 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting3.click();
			System.out.println(" Select the back for chatWallpaper");

			System.out.println(" Select the Theme");
			WebElement theme = driver.findElement(By.xpath("//*[text()='Theme']"));
			theme.click();
			Thread.sleep(3000);
			WebElement backSetting4 = driver.findElement(By.xpath("//*[text()='OK']"));
			backSetting4.click();
			System.out.println(" Select the back chatWallpaper");
			
			System.out.println(" Select the chatWallpaper");
			WebElement chatWallpaper = driver.findElement(By.xpath("//*[text()='Chat wallpaper']"));
			chatWallpaper.click();
			Thread.sleep(3000);
			WebElement backSetting5 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting5.click();
			System.out.println(" Select the back for RequestAccountInfo");
			
			System.out.println(" Select the MediaAutoDownload");
			WebElement mediaAutoDownload = driver.findElement(By.xpath("//*[text()='Media auto-download']"));
			mediaAutoDownload.click();
			Thread.sleep(3000);
			WebElement backSetting6 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting6.click();
			System.out.println(" Select the back for RequestAccountInfo");
			
			System.out.println(" Select the RequestAccountInfo");
			WebElement requestAccountInfo = driver.findElement(By.xpath("//*[text()='Request account info']"));
			requestAccountInfo.click();
			Thread.sleep(3000);
			WebElement backSetting7 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting7.click();
			System.out.println(" Select the back for KeyboardShortcut");
			
			System.out.println(" Select the KeyboardShortcuts");
			WebElement keyboardShortcuts = driver.findElement(By.xpath("//*[text()='Keyboard shortcuts']"));
			keyboardShortcuts.click();
			Thread.sleep(3000);
			WebElement backSetting8 = driver.findElement(By.xpath("//*[text()='OK']"));
			backSetting8.click();
			System.out.println(" Select the back for help ");

			System.out.println(" Select the help");
			WebElement help = driver.findElement(By.xpath("//*[text()='Help']"));
			help.click();
			Thread.sleep(3000);
			System.out.println(" Select the back for menu logout");
			WebElement backSetting9 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
			backSetting9.click();
			
			System.out.println(" Select the Logout");
			WebElement logOut = driver.findElement(By.xpath("//*[text()='Log out']"));
			logOut.click();
			System.out.println(" Select the Logout Cancel");
			//Cancel
			WebElement logOutcancel=driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
			logOutcancel.click();
	}}
