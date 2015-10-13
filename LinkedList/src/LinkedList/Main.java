package LinkedList;

public class Main {

	public int compare(LinkList list1,LinkList list2){
		//list1.
		if(list1.size()==0 && list2.size()==0){
			return 0;
		}
		if(list1.size()==0){
			return -1;
		}
		if(list2.size()==0){
			return 1;
		}
		
		System.out.println(list1.findElementbyIndex(6));
		
		return -1;
	}
	
	public static void main(String[] args){
		LinkList list1=new LinkList();
		LinkList list2=new LinkList();
		//System.out.println(list.isEmpty());
		list1.add("g");
		list1.add("e");
		list1.add("p");
		list1.add("k");
		list1.add("s");
		list1.add("a");
		list2.add("g");
		list2.add("e");
		list2.add("e");
		list2.add("k");
		list2.add("s");
		list2.add("b");
		list2.add("d");	
		//list1.display();
		list1.isEmpty();
		//System.out.println(list2.size());
		Main main=new Main();
		main.compare(list1,list2);
//		if(!list.findElement("Subirabcd")){
//			System.out.println("Not found");
//		}
//		else System.out.println("found");
//		System.out.println("*******");
//		list.removeNodebyValue("Hello");
//		//list.removeNodebyValue("Subir2");
//		//System.out.println(list.removeNodebyValue("Subir2"));
//		list.display();
//		System.out.println("*******");
//		list.removeNodebyValue("Subir3");
//		//list.removeNodebyValue("Subir2");
//		//System.out.println(list.removeNodebyValue("Subir2"));
//		list.display();
//		System.out.println("*******");
//		list.removeNodebyValue("Subir1");
//		//list.removeNodebyValue("Subir2");
//		//System.out.println(list.removeNodebyValue("Subir2"));
//		list.display();
//		System.out.println("*******");
//		list.removeNodebyValue("abcd");
//		//list.removeNodebyValue("Subir2");
//		//System.out.println(list.removeNodebyValue("Subir2"));
//		list.display();
	}
}
