package numbers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimiFactorTest {
	PrimiFactor factor=new PrimiFactor();
	@Test
	public void testFindPrimi() {
		List<Long> a=factor.findPrimi(8, null);
		List<Long> mocklist= Arrays.asList(2l,2l,2l);
		assertTrue("Expected 'a' and 'expected' to be equal."+
	            "\n  'a'        = "+a+
	            "\n  'expected' = "+mocklist, 
	            a.equals(mocklist));
		
		a=factor.findPrimi(10, null);
		mocklist= Arrays.asList(2l,5l);
		assertTrue("Expected 'a' and 'expected' to be equal."+
	            "\n  'a'        = "+a+
	            "\n  'expected' = "+mocklist, 
	            a.equals(mocklist));
		
		a=factor.findPrimi(999, null);
		mocklist= Arrays.asList(3l,3l,3l,37l);
		assertTrue("Expected 'a' and 'expected' to be equal."+
	            "\n  'a'        = "+a+
	            "\n  'expected' = "+mocklist, 
	            a.equals(mocklist));
		
	}

}
