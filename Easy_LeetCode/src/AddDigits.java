
public class AddDigits {
	public static void main(String[] args){
		AddDigits add=new AddDigits();
		int result=add.addDigits(512);
		System.out.println(result);
	}

    public int addDigits(int num) {
        int length = (int)(Math.log10(num)+1);
        System.out.println(length);
        if(length<2){
        	return num;
        }
        else{
        	int tens=10;
        	for(int i=1;i<=length;i++){
        		tens=tens*10;
        	}
            
            System.out.println(tens);
            int dividend=num/tens;
            //System.out.println("div"+dividend);
            int remainder=num%tens;
            int sum=dividend+remainder;
            //System.out.println(sum);
        	return addDigits(sum);
            //return if(sum<10){sum;}else{addDigits(sum);}
        } 
    }
}
