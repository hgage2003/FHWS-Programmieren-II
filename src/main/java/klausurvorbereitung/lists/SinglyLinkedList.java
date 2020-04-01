package klausurvorbereitung.lists;

public class SinglyLinkedList {
    
    private Node head;
    private int length;
    
    public SinglyLinkedList() {
	this.head = null;
	this.length = 0;
    }
    public void inserLast(String value) {
	Node new_node = new Node(value);
	if(head==null) {
	    head = new_node;
	} else {
	    Node temp = head;
	    while(temp.next!=null) {
		temp = temp.next;
	    }
	    temp.next = new_node;
	}
	length++;
    }
    
    public int getLength() {
	return this.length;
    }
    
    public void print() {
	Node temp = head;
	while(temp!=null) {
	    System.out.print(temp.getData() + "-->");
	    temp = temp.next;
	}
    }
    
    public static void main(String[] args) {
	SinglyLinkedList list = new SinglyLinkedList();
	
	list.inserLast("hi");
	list.print();
	System.out.println(list.getLength());
	System.out.println();
	
	list.inserLast("hey");
	list.print();
	System.out.println(list.getLength());
	System.out.println();
	
	list.inserLast("ho");
	list.print();
	System.out.println(list.getLength());
    }

}
