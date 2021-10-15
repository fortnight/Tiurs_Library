package spindl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static spindl.App.needle;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
	/**
	 * The testing method of "needle"
	 */
	 @Test
	 public void needleTest()
	 {
		 String temp = "whatever you want. any characters or words.";
		 String returnTemp = needle(temp);
		 assertTrue(returnTemp.equals(temp+="needle"));
	 }
}
