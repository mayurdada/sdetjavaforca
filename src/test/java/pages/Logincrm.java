package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class Logincrm extends Baseclass  {
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{ 
		log.info("Testcase 1 Started");
		logger =report.createTest("loginapp");
	
		Loginpage lopin= PageFactory.initElements(driver,Loginpage.class);
		logger.info("statingApllication");
		log.info("Login Succesfull");
		lopin.LoginToCrm();
		         logger.pass("loginpage");
		         log.info("Testcase 1 Executed");
    }
	@Test(priority=2)
   public void signupapp() throws InterruptedException
	
	{   log.info("Testcase 2 Started");
		logger =report.createTest("signup");
		Signup lopi= PageFactory.initElements(driver,Signup.class);
		logger.info("signupApllication");  
		log.info("Login Succesfull");
		 lopi.signupp("mayurdharamkar19@gmail.com","Mayur@1902");
		 logger.pass("signuppage");
		 log.info("Testcase 2 Executed");
		         
    }
	@Test(priority=3)

	 public void searchupapp() throws InterruptedException
		
		{
		log.info("Testcase 3 Started");
		 logger =report.createTest("mainpage");
		 Searchpage lopi4= PageFactory.initElements(driver,Searchpage.class);
			logger.info("mainApllication");
			log.info("Login Succesfull");
		 lopi4.searcho("carpets & rugs");
		 logger.pass("mainpage");
		 log.info("Testcase 3 Executed");
			         
	    }
	@Test(priority=4)

	 public void Bedapp() throws InterruptedException
		
		{
		log.info("Testcase 4 Started");
		logger =report.createTest("inpage");
		Bedroom lopi5= PageFactory.initElements(driver,Bedroom.class);
		logger.info("inApllication"); 
		log.info("Login Succesfull");
			 lopi5.LoginBed();
			 logger.pass("inpage");
			 log.info("Testcase 4 Executed");
			         
	    }
@Test(priority=5)

	 public void Bedappcart() throws InterruptedException
		
		{ 
		log.info("Testcase 5 Started");
		logger =report.createTest("allpage");    
		Bookingpage lopi6= PageFactory.initElements(driver,Bookingpage.class);
		logger.info("allApllication");
		log.info("Login Succesfull");
			 lopi6.bedlogin();
			 logger.pass("allpage");
			 log.info("Testcase 5 Executed");
			     
	    }

    @Test(priority=6)

	 public void assertionaa() throws InterruptedException
		
		{ 
    	log.info("Testcase 6 Started");
    	logger =report.createTest("usepage");
		     Asserttest lopi7= PageFactory.initElements(driver,Asserttest.class);
		     logger.info("useApllication");
		     log.info("Login Succesfull");
			 lopi7.assersearcho();
			 logger.pass("usepage");
			 log.info("Testcase 6 Executed");
			
			
	    }
	 @Test(priority=7)

	 public void tvappcart() throws InterruptedException
		
		{ 
		 log.info("Testcase 7 Started");
		 logger =report.createTest("apage");
		     Livingroom lopi8= PageFactory.initElements(driver,Livingroom.class);
		     logger.info("aApllication");
		     log.info("Login Succesfull");
			 lopi8.tvpageoo();
			 logger.pass("apage");
			 log.info("Testcase 7 Executed");
			     
	    }

	@Test(priority=8)

	 public void studyapp() throws InterruptedException
		
		{ 
		 log.info("Testcase 8 Started");
		 logger =report.createTest("bpage");
		     Studypage lopi9= PageFactory.initElements(driver,Studypage.class);
		     logger.info("bApllication");
		     log.info("Login Succesfull");
			 lopi9.Studypagee();
			 logger.pass("bpage");
			 log.info("Testcase 8 Executed");
		     
			     
	    }
	 @Test(priority=9)

	 public void aboutapp() throws InterruptedException
		
		{ 
		 log.info("Testcase 9 Started");
		 logger =report.createTest("cpage");
		    Aboutpage lopia= PageFactory.initElements(driver,Aboutpage.class);
		    logger.info("cApllication");
		    log.info("Login Succesfull");
			 lopia.aboutu();
			 logger.pass("cpage");
			 log.info("Testcase 9 Executed");

			     
	    }
	 @Test(priority=10)
	 public void infoapp()
		
		{ 
		 log.info("Testcase 10 Started");
		 logger =report.createTest("dpage");
		      Moreinfo lopioo= PageFactory.initElements(driver,Moreinfo.class);
		      logger.info("dApllication");
		      log.info("Login Succesfull");
			 lopioo.moruee();
			 logger.pass("dpage");
			 log.info("Testcase 10 Executed");

			     
	    }


}