package interval;

import java.util.ArrayList;
import java.util.List;

public class FindInterval {
	
	public static final String leftInclude="[";
	public static final String leftNotInclude="(";
	public static final String rightInclude="]";
	public static final String rightNOtinclude=")";
	public static void main(String[] args) {
		String s="[2,6)";
	}
	
	public List<Long> getNumberfromInterval(Interval in){
		long leftnumber=in.getLeftnumber();
		if (in.getLeftsign().equals(leftNotInclude)){
			leftnumber=leftnumber+1;
		}
		long rightnumber=in.getRightnumber();
		if (in.getRightsign().equals(rightNOtinclude)){
			rightnumber=rightnumber-1;
		}
		List<Long> alist=new ArrayList<Long>();
		for(long i=leftnumber;i<=rightnumber;i++){
			alist.add(i);
		}
		return alist;
		
	}
	public Interval getIntervalFromString(String s){
        String[] ab=s.split(",");
        Interval in=new Interval();
        if(ab[0].startsWith(leftInclude)){
        	in.setLeftsign(leftInclude);
        	in.setLeftnumber(Long.parseLong(ab[0].replace(leftInclude, "")) );
        }else{
        	in.setLeftsign(leftNotInclude);
        	in.setLeftnumber(Long.parseLong(ab[0].replace(leftNotInclude, "")) );
        }
        if(ab[1].endsWith(rightInclude)){
        	in.setRightsign(rightInclude);
        	in.setRightnumber(Long.parseLong(ab[1].replace(rightInclude, "")) );
        }else{
        	in.setRightsign(rightNOtinclude);
        	in.setRightnumber(Long.parseLong(ab[1].replace(rightNOtinclude, "")) );
        }
		return in;
	}
	
}
