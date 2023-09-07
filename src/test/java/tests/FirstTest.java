package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest
{
   @Test
   public void test1()
   {
	   Reporter.log("test1");
   }
  
   @Test
   public void test2()
   {
	   Reporter.log("test2");
   }
}
