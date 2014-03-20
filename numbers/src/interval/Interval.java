package interval;

public class Interval {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (leftnumber ^ (leftnumber >>> 32));
		result = prime * result
				+ ((leftsign == null) ? 0 : leftsign.hashCode());
		result = prime * result + (int) (rightnumber ^ (rightnumber >>> 32));
		result = prime * result
				+ ((rightsign == null) ? 0 : rightsign.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interval other = (Interval) obj;
		if (leftnumber != other.leftnumber)
			return false;
		if (leftsign == null) {
			if (other.leftsign != null)
				return false;
		} else if (!leftsign.equals(other.leftsign))
			return false;
		if (rightnumber != other.rightnumber)
			return false;
		if (rightsign == null) {
			if (other.rightsign != null)
				return false;
		} else if (!rightsign.equals(other.rightsign))
			return false;
		return true;
	}
	public Interval() {
		// TODO Auto-generated constructor stub
	}
	private String leftsign;
	private String rightsign;
	public Interval(String left, int leftnumber, int rightnumber, String rightsign) {
		this.leftsign=left;
		this.leftnumber=leftnumber;
		this.rightnumber=rightnumber;
		this.rightsign=rightsign;
	}
	public String getLeftsign() {
		return leftsign;
	}
	public void setLeftsign(String leftsign) {
		this.leftsign = leftsign;
	}
	public String getRightsign() {
		return rightsign;
	}
	public void setRightsign(String rightsign) {
		this.rightsign = rightsign;
	}
	public long getLeftnumber() {
		return leftnumber;
	}
	public void setLeftnumber(long leftnumber) {
		this.leftnumber = leftnumber;
	}
	public long getRightnumber() {
		return rightnumber;
	}
	public void setRightnumber(long rightnumber) {
		this.rightnumber = rightnumber;
	}
	private long leftnumber;
	private long rightnumber;
}
