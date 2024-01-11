package solution;

public class CountPairs {
	

	public void countPairs(LinkedList l1, LinkedList l2, int sum) {
		
		LinkedList.Node tnode1=l1.head;
		int count = 0;
		while(tnode1 != null) {
			LinkedList.Node tnode2=l2.head;	
			while(tnode2 != null) {
				if((tnode1.data + tnode2.data) == sum)
					count += 1;
				tnode2=tnode2.next;
			}
			tnode1=tnode1.next;
		}
		
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		LinkedList ll1= new LinkedList();
		LinkedList ll2= new LinkedList();
		
		CountPairs cp = new CountPairs();
		
		ll1.push(7);
		ll1.push(5);
		ll1.push(1);
		ll1.push(3);
		
		ll2.push(3);
		ll2.push(5);
		ll2.push(2);
		ll2.push(8);
		
		ll1.printList();
		System.out.println();
		ll2.printList();
		System.out.println();
		
		cp.countPairs(ll1, ll2, 10);
		
	}

}
