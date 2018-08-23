package LeetCode;

public class ReverseWordsInAString_151 {
	public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
			return "";
		}
        String[] str1 = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=str1.length-1;i>=0;i--){
            if(!str1[i].equals("")){
		    	sb.append(str1[i]).append(" ");
            }
		}
        System.out.println("Result : " + sb);
		return sb.toString().trim();
    }
}
