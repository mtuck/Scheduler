
public class Node {
	private Node next;
	private Process data;



	public Node() {
		next = null;
		data = null;
	}

	public Node(Node next){
		this.next = next;
		data = null;
	}

	public Node(Process data) {
		this.next = null;
		this.data = data;
	}

	public Node(Node next, Process data) {
		this.next = next;
		this.data = data;
	}
	
	public Process getData() {
		return data;
	}

	public void setData(Process data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public boolean hasNext(){
		if(this.next == null)
			return false;
		else
			return true;
	}

	@Override
	public String toString() {
		return  data.toString();
	}
	
	

}
