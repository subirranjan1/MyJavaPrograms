
package LinkedList;

public class LinkList{
	public Node head;
	
	
	public LinkList(){	
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		else{
			return false;
		}
	}	
	
	public void add(Object obj){
		
		if(isEmpty()){
			head=new Node(obj);
		}
		else{
			Node current=head;
			while(current.getNext()!=null){
				current=current.getNext();
			}
			Node nodenext=new Node(obj);
			current.setNext(nodenext);
		}
	}
	
	public boolean findElement(Object obj){
		if(isEmpty()){
			return false;
		}
		else{
			Node current=head;
			while(current!=null){
				if(current.getValue()==obj){
					return true;
				}
				current=current.getNext();
				//System.out.println("Element not found");
			}
			return false;
		}
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("List is Empty");
		}
		else{
			Node current=head;	
			while(current!=null){
				System.out.println(current.getValue());
				current=current.getNext();
			}
		}
		
	}
	
	public class Node{
		public Object value;
		public Node next;
		
		public Node(Object obj){
			this.value=obj;
		}
		
		public Node getNext(){
			return next;
		}
		public void setNext(Node node){
			next=node;
		}
		public Object getValue(){
			return value;
		}
	}
}

