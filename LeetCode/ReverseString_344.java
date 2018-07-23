package easyProblems;

public class ReverseString_344 {
	
    public String reverseString(String s) {
    	
    	// StringBuilder is faster as compared to StringBuffer
        StringBuilder sBuffer = new StringBuilder();
        for(int i=s.length() - 1; i >= 0; i--)
	        {
	          char ch = s.charAt(i);
	       // append a string into StringBuilder sBuffer
	          sBuffer = sBuffer.append(ch);
	        }
        // print reversed String
        System.out.print("Output : " + sBuffer);
        return sBuffer.toString();
        
    	/*** Another faster method to reverse the string ***/
        /*
	    	 // getBytes() method to convert string into bytes[].
	    	 byte [] strAsByteArray = s.getBytes();
	    	 
	         byte [] result = 
	                    new byte [strAsByteArray.length];
	  
	         // Store result in reverse order into the
	         // result byte[]
	         for (int i = 0; i<strAsByteArray.length; i++)
	             result[i] = 
	              strAsByteArray[strAsByteArray.length-i-1];
	  
	         return (new String(result));
        /******************/ 
         
    }
}
