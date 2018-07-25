package LeetCode;

public class ReverseInteger {

	public int reverse(int x){
		long reverse = 0;
		
		while(x != 0){
			int remainder = x % 10;
			reverse = reverse * 10 + remainder;
			x = x/10;
		}
		
		/*****  handling the overflow condition ****/
		if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
			return 0;
		}
		else {
			return (int)reverse;
		}
	}
}
