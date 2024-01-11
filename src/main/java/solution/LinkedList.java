package solution;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next = null;
		}
	}
	
	public void push(int new_data) {
		
		Node new_node= new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
	}
	
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(10);
		ll.push(10);
		ll.printList();
	}

}
