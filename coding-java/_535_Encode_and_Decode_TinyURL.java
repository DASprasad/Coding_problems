package progarm;

import java.util.*;

public class _535_Encode_and_Decode_TinyURL {
	
	 HashMap<String , String> en; //encode
	    HashMap<String , String> de; //decode
	    int count = 0;
	    String base = "https://leetcode.com/problems/";
	 
	    // Encodes a URL to a shortened URL.
	    public _535_Encode_and_Decode_TinyURL(){
	        en = new HashMap();
	        de = new HashMap();
	    }
	    public String encode(String longUrl) {
	        if(!en.containsKey(longUrl)){
	            String shortUrl = base + longUrl.length();
	            en.put(longUrl , shortUrl);
	            de.put(shortUrl , longUrl);
	        }
	        return en.get(longUrl);
	    }

	    // Decodes a shortened URL to its original URL.
	    public String decode(String shortUrl) {
	        return  de.get(shortUrl);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
