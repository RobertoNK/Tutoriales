import java.util.HashSet;

public class Node {
	int data;
	Node nextNode;
	
	public Node (int data) {
		this.data = data;
		nextNode = null;	
	}
	
	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode =nextNode;
	}
	
	public void appendToTail(Node node) {
		
		Node current = this;
		while(current.nextNode != null) {
				current= current.nextNode;				
		}
		current.nextNode = node;
		
	}
	
	public void appendToTail(int d) {
		
		Node newNode = new Node(d);
		Node current = this;
		while(current.nextNode != null) {
				current= current.nextNode;				
		}
		current.nextNode = newNode;
		
	}
	
	public static Node deleteNode(Node head, int d) {
		Node currentNode = head;
		// deleting head
		// special case
		if(currentNode.data == d) {
			currentNode = head.nextNode;
			return currentNode;
		}
		
		// for other cases
		while(currentNode.nextNode != null) {
			
			if(currentNode.nextNode.data == d) {
				// joining current node to the node
				// next to d
				currentNode.nextNode = currentNode.nextNode.nextNode;
				
				return head;
				
			}
			currentNode = currentNode.nextNode;
			
		}
		// if match is not found
		return head;
		
	}
	
	public static Node deleteDuplicates(Node list) {
		
		HashSet<Integer> mySet = new HashSet<>();
		Node myNewList= null;
		while(list.nextNode != null) {
			
			if(mySet.contains(list.data)) {
				myNewList.nextNode = list.nextNode;
			}else{
				mySet.add(list.data);
				myNewList = list;
			}
			
			
			list =list.nextNode;
		}
		return myNewList;
	}
	
	@Override
	public String toString() {
		return "data= " + data + ", nextNode={" + nextNode+"}";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Node head = new Node(4);
		Node head =new Node(1);
		Node firstTerm = new Node(2);
		head.nextNode = firstTerm;
		Node secondTerm =new Node(2);
		//firstTerm.nextNode = secondTerm;
		head.appendToTail(secondTerm);
		head.appendToTail(100);
		//deleteNode(head,3);		
		//System.out.println("Head: " +head);
		//head.nextNode = secondTerm;
		//firstTerm.nextNode = null;
		System.out.println(head);
		//System.out.println(deleteNode(head,2));
		System.out.println(deleteDuplicates(head));
		
		
	}

}
