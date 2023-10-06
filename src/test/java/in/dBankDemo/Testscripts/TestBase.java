package in.dBankDemo.Testscripts;



import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

import org.junit.BeforeClass;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

import io.restassured.specification.RequestSpecification;

public class TestBase {
	public static RequestSpecification httpRequest;
	public static Response response;
	
	public Logger logger;
	
	
	@BeforeClass
	public void setup() {
		logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("logj.properties");
		//logger.setLevel(Level.DEBUG);
	}
	
}
