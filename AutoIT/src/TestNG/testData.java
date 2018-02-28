package TestNG;

import org.testng.annotations.DataProvider;

public class testData {
	
	@DataProvider(name="credentials")
	  public Object [][] getData(){
		  return new Object [][]{
			  {"8142755993","Ankur@93"},
			  {"8142755993","Kellogs"}
		  };
	  }

}
