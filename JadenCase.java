public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
    
    if(phrase == null){
      return null;
    }
    if(!phrase.isBlank() && !phrase.isEmpty())
    	    {
    		String [] strarr=phrase.split(" ");
    	    for(int i=0;i<strarr.length;i++)
    	    {
    	      if(!strarr[i].isBlank())
    	      {
    	        strarr[i]=strarr[i].substring(0,1).toUpperCase() + strarr[i].substring(1).toLowerCase();
    	      }
    	    }
    	    
    	    String s="";
    	    for(int j=0;j<strarr.length;j++)
    	    {
    	      s=s+strarr[j]+" ";
    	    }
    			return s.substring(0, s.length() - 1);
    	    }
    	    else
    	    {
    	    return null;
    	    }
  	}
    

}
