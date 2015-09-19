package Scheduler;


public class driver {

	public static void main(String[] args) {
		Node n1 = new Node(new Process("n1"));
		Node n2 = new Node(new Process("n2"));
		Node n3 = new Node(new Process("n3"));
		MyLinkedList queue = new MyLinkedList(n1);
		System.out.println(queue.toString());
		queue.push(n2);
		System.out.println(queue.toString());
		queue.pop();
		System.out.println(queue.toString());
		queue.push(n3);
		System.out.println(queue.toString());
		queue.pop();
		queue.pop();
		queue.push(n1);
		//queue.push(n2);
		System.out.println(queue.toString());
		
		

	}

}
