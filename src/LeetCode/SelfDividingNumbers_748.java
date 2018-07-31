package LeetCode;

import java.util.List;

public class SelfDividingNumbers_748 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList();
        for(int i = left; i <= right; i++){
            if(selfDivide(i) == true){
                output.add(i);
            }
        }
        return output;
    }
	    
    public boolean selfDivide(int num){
        int temp = num;
        int remainder;
        while(temp > 0){
            remainder = temp % 10;
            if((remainder == 0) || (num % remainder != 0)){
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}

