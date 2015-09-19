
public class MyLinkedList {
	Node head;
	
	public MyLinkedList(){
		head = null;
	}
	
	public MyLinkedList(Node head){
		this.head = head;
	}
	
	public void push(Node n){
		if(head == null){
			head = n;
		}
		else{
			Node current = head;
			while(current.hasNext()){
				current = current.getNext();
			}
			current.setNext(n);
			
		}
		
	}
	
	public Node pop(){
		Node item = head;
		head = head.getNext();
		item.setNext(null);
		return item;
	}

	@Override
	public String toString() {
		Node current = head;
		String str = "";
		while(current != null){
			str += current.toString();
			current = current.getNext();
			
		}
		return str;
		
	}
	
	
	
	
}
