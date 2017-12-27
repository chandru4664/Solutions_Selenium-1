package htc.training.homework;

public class Series {
	private int serieslmt;

	public Series(int serieslmt) {
		this.serieslmt = serieslmt;
	}

	public String seriesnum() {
		String j="";
		String k="";
		
		for(int i=1; i<=serieslmt; i++) {
			if(i%2 == 0) {
				k = "-";
			}else {
				k = "";
			}
			j = j + k + ((2*i)-1) +",";
		}
		return j;
	}

	public String fracseries() {
		String j="";
		String k="";
		
		for(int i=1; i<=serieslmt; i++) {
			k = "1/"+i;
			j = j + k + ",";
		}
		return j;
	}
	
	public int getSerieslmt() {
		return serieslmt;
	}

	public void setSerieslmt(int serieslmt) {
		this.serieslmt = serieslmt;
	}

	@Override
	public String toString() {
		return "series [serieslmt=" + serieslmt + "]";
	}

	
	

}
