package easyProblems;

public class ReverseString_344 {
	
    public String reverseString(String s) {
        StringBuffer sBuffer = new StringBuffer();
        for(int i=s.length() - 1; i >= 0; i--)
	        {
	          char ch = s.charAt(i);
	          sBuffer = sBuffer.append(ch);
	        }
        System.out.print("Output : " + sBuffer);
        return sBuffer.toString();
    }
}
