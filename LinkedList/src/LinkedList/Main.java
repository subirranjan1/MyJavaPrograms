package LinkedList;

public class Main {
	public static void main(String[] args){
		LinkList list=new LinkList();
		//System.out.println(list.isEmpty());
		list.add("Hello");
		list.add("Subir");
		list.add("Subir1");
		list.add("Subir2");
		list.add("Subir3");
		list.display();
		if(!list.findElement("Subirabcd")){
			System.out.println("Not found");
		}
		else System.out.println("found");
	}
}
