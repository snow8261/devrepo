package numbers;

import java.util.ArrayList;
import java.util.List;


public class PrimiFactor {
	
	public static void main(String[] args) {
		PrimiFactor factor=new PrimiFactor();
		List<Long> a=factor.findPrimi(8, null);
		for (Long long1 : a) {
			System.out.println(long1);
		}
		a=factor.findPrimi(10, null);
		for (Long long1 : a) {
			System.out.println(long1);
		}
		a=factor.findPrimi(17, null);
		for (Long long1 : a) {
			System.out.println(long1);
		}
		a=factor.findPrimi(11117, null);
		for (Long long1 : a) {
			System.out.println(long1);
		}
		a=factor.findPrimi(11119, null);
		for (Long long1 : a) {
			System.out.println(long1);
		}
		a=factor.findPrimi(999999, null);
		for (Long long1 : a) {
			System.out.println(long1);
		}
	}
	
	
	public List<Long> findPrimi(long number,List<Long> alist){
	    if( alist==null){
	    	alist=new ArrayList<Long>();
	    }
		for (long i=2;i<=number;i++){
			if(number%i==0){
				long a=number/i;
				alist.add(i);
				return findPrimi(a,alist);
			}
		}
		return alist;
	}
	
	
	
	
}
