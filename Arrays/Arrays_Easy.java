package oct8;

import java.util.Arrays;
import java.util.HashSet;

public class Arrays_Easy {

	public static void main(String[] args) {
		float sum = 0;
		int[] myArray = {1,18,34,2,5,15,27,31,20079,12,5};
		sum = add(myArray);
		float mean = mean(myArray);
		int max = largest(myArray);
		int min = smallest(myArray);
		float median = median(myArray);
		int nthLargest = nthLargest(myArray,2);
		boolean unique = isUnique(myArray);
		char[] input ={'a','b','c','a','d','f','g','f','d','s','d','f','s'};
		char[] forbidden = {'c','g','f'};
		char[] result = sanitize(input, forbidden);
		System.out.println("Sum = " + sum);
		System.out.println("Mean = " + mean);
		System.out.println("Largest element = " + max);
		System.out.println("Smallest element = " + min);
		System.out.println("Median = " + median);
		System.out.println("Nth = " + nthLargest);
		System.out.println("Unique = " + unique);
		System.out.println("Sanitize : " + Arrays.toString(result));
	}
	
	public static int add(int[] myArray){
		int sum = 0;
		for(int i=0; i < myArray.length; i++){
			sum += myArray[i];
		}
		return sum;
	}
	
	public static float mean(int[] myArray){
		int sum = 0;
	    for(int i : myArray) sum += i;
	    return ((float) sum)/myArray.length;
	}
	
	public static int largest(int[] myArray){
		int max = myArray[0];
		for(int i = 1; i < myArray.length; i++){
			if(myArray[i] > max){
				max = myArray[i];
			}
		}
		return max;
	}

	public static int smallest(int[] myArray){
		int min = myArray[0];
		for(int i = 1; i < myArray.length; i++){
			if(myArray[i] < min){
				min = myArray[i];
			}
		}
		return min;
	}
	
	public static float median(int[] myArray){
		float median = 0;
		Arrays.sort(myArray);
		if (myArray.length % 2 == 0) {
		    median = ((float)myArray[myArray.length/2] + (float)myArray[myArray.length/2 - 1])/2;
		}
		else {
		    median = (float) myArray[myArray.length/2];
		}
		return median;
	}
	
	public static int nthLargest(int[] myArray,int num){
		Arrays.sort(myArray);
		int kth = myArray[myArray.length - num];
		return kth;
	}
	
	public static boolean isUnique(int[] myArray){
		HashSet<Integer> mySet = new HashSet<>();
		for(int i=0; i<myArray.length;i++){
			mySet.add(myArray[i]);
		}
		if(mySet.size() < myArray.length){
			return false;
		}
		else {
			return true;
		}
	}
	
	public static char[] sanitize(char[] input,char[] forbidden){
		HashSet<Character> mySet = new HashSet<>();
		for(char c: forbidden){
			mySet.add(c);
		}
		for(int i = 0; i < input.length; i++){
			if(mySet.contains(new Character(input[i]))){
				input[i] = '-';
			}
		}
		return input;
	}	
}
