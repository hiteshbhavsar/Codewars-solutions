import java.util.Arrays;

public class Kata_findShort {
  	public static int findShort(String s) {
		String [] chrarr=s.split(" ");
		for (int i=1 ;i<chrarr.length; i++) 
	    { 
	        String temp = chrarr[i]; 
	  
	        // Insert s[j] at its correct position 
	        int j = i - 1; 
	        while (j >= 0 && temp.length() < chrarr[j].length()) 
	        { 
	            chrarr[j+1] = chrarr[j]; 
	            j--; 
	        } 
	        chrarr[j+1] = temp; 
	    } 
        
        return chrarr[0].length();
    }
}
