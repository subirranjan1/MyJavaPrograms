//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//For example:
//
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
//
//Follow up:
//Could you do it without any loop/recursion in O(1) runtime?


public class AddDigits {
	public static void main(String[] args){
		AddDigits add=new AddDigits();
		int result=add.addDigits(0);
		System.out.println(result);
	}

    public int addDigits(int num) {
//        int length = (int)(Math.log10(num)+1);
//        if(length<2){
//        	return num;
//        }
//        else{
//        	int tens=10;
//        	for(int i=1;i<length-1;i++){
//        		tens=tens*10;
//        	}
//            int dividend=num/tens;
//            int remainder=num%tens;
//            int sum=dividend+remainder;
//        	return addDigits(sum);
//        } 
//    	return num>9?addDigits(num/10+num%10):num;
    	return 1 + (num - 1) % 9;/// Digitial Root Formula-Congruence /// Change 9 to (base-1) for other bases.
    }
}
