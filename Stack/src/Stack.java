
public class Stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	public Stack(int maxsize){
		this.maxSize=maxsize;
		stackArray=new long[maxsize];
		top=-1;
	}
	
	public void push(long obj){
		stackArray[++top]=obj;
	}
	public long pop(){
		return stackArray[top--];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public long peek(){
		return stackArray[top];
	}
	public static void main(String[] args){
		Stack mystack=new Stack(20);
		mystack.push(10);
		//mystack.peek();
		mystack.push(20);
		//mystack.peek();
		mystack.push(30);
		//mystack.peek();
		//mystack.pop();
		//mystack.peek();
		//mystack.isEmpty();
		//mystack.pop();
		//mystack.peek();
		while(!mystack.isEmpty()){
			System.out.println(mystack.pop());
		}
	}
}
