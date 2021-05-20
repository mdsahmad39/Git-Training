package collections;

public class CustomLinkedList {
	CustomNode head;

	public void insert(int data) {
		CustomNode node = new CustomNode();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			CustomNode node1 = head;
			while(node1.next != null) {
				node1 = node1.next;
			}
			node1.next = node;
		}
	}
	
	public void delete(int data) {
		CustomNode node = head, preNode= null;
		
		while(node.next != null) {
			if(node.data == data && node == this.head) {
				this.head = this.head.next;
				return;
			} else if (node.data == data){
				preNode.next = node.next;
				return;
			} else {
				preNode = node;
				node = node.next;
			}
		}
		
		if (node.data == data && node.next  == null){
			preNode.next = null;
			return;
		}
		
	}
	
	public void display() {
		CustomNode node = head;
		System.out.print("[");
		while(node.next != null) {
			System.out.print(node.data + ", ");
			node = node.next;
		}
		System.out.print(node.data + "]\n");
	}
}
