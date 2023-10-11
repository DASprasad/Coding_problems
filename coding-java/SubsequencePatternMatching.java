package progarm;

public class SubsequencePatternMatching {
    public boolean match(String str, String comp) {
    	int i=0;
    	int j=0;
    	while(i<str.length() && j<comp.length()) {
    		if(str.charAt(i)==comp.charAt(j)) {
    			i++;
    			j++;
    		}else {
    			j++;
    		}
    		
    	}
    	if(i>=str.length()) {
    		return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		SubsequencePatternMatching ob = new SubsequencePatternMatching();
		String str="axmzyt";
		String comp="mzaxhyghzhjyft";
		System.out.println(ob.match(str, comp));

	}

}
