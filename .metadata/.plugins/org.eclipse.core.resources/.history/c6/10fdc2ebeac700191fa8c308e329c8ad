package ds;

public class LinkedList {

	
	
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (head == null) {
			head = node;
		} else if (head!=null) {
			Node n = head;
			while (n.next!=null) {
				n = n.next;
			}
			n.next = node;			
		} 
		
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (index == 0) {
			node.next = head;
			head =node;
		} else {
			int i = 1;
			Node n = head;
			while( i < index-1) {
				n = n.next;
				i++;
			}
			node.next = n.next;
			n.next = node;
		}
		
		
		
	}
	
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for(int i = 1; i < index-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.insert(5);
		ls.insert(7);
		ls.insert(71);
		ls.insert(17);
		ls.insertAtStart(99);
		ls.insertAtStart(56);
		ls.insertAt(2, 32);
		ls.deleteAt(3);
		//ls.deleteAt(0);
		ls.showLinkedList();
	}

	public void showLinkedList() {
		Node printNode = head;
		do {
			System.out.println(printNode.data);
			printNode = printNode.next;
		} while (printNode.next!=null);
		System.out.println(printNode.data);
	}
	
}
