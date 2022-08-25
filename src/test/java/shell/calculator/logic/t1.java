package shell.calculator.logic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class t1 {
	calsample cal;
	@Before
	public void thisIsBeforeAnnotation() {
		cal = new calsample();
	}
	@Test
	public void ValidateAddition() {
		int ActualResult= cal.addition(10,20);
		int ExpectedResult=30;
		Assert.assertEquals(ExpectedResult,ActualResult);
	}
	
	@Test
	public void ValidateSubtraction() {
		int ActualResult= cal.subtraction(10,5);
		int ExpectedResult=5;
		Assert.assertEquals(ExpectedResult,ActualResult);
	}
	@After
    public void tearDown()
    {
        System.out.println("Test case is completed ");
    }



}
