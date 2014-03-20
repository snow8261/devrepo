package interval;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindIntervalTest {
	FindInterval fi=new FindInterval();
	@Test
	public void testGetIntervalFromString() {
	    Interval in= fi.getIntervalFromString("[2,6");
		Interval mockin=new Interval("[",2,6,")");
		assertTrue("Expected 'a' and 'expected' to be equal."+
	            "\n  'a'        = "+in+
	            "\n  'expected' = "+mockin, 
	            in.equals(mockin));
	
	}
	
	@Test
	public void testGetNumberfromInterval(){
		Interval mockin=new Interval("[",2,6,")");
		List<Long> alist= fi.getNumberfromInterval(mockin);
		List<Long> mocklist=Arrays.asList(2l,3l,4l,5l);
		assertTrue("Expected 'a' and 'expected' to be equal."+
	            "\n  'a'        = "+alist+
	            "\n  'expected' = "+mocklist, 
	            alist.equals(mocklist));
	}

}
