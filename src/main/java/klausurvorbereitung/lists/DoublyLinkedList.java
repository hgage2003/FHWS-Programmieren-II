package klausurvorbereitung.lists;

public class DoublyLinkedList {

    private Node start;
    private Node ende;
    private int length;
    
    public DoublyLinkedList() {
	this.start = null;
	this.ende = null;
	this.length = 0;
    }
   
    public void insertFirst(String value) {
	Node new_node = new Node(value);
	if(start==null) {
	    ende = new_node;
	} else {
	    start.prev = new_node;
	}
	new_node.next = start;
	start = new_node; //neuen Start bestimmen
	length++;
    }
    
    public void insertLast(String value) { //Kein while erforderlich, da wir ende kennen
	Node new_node = new Node(value);
	if(start==null) {
	    start = new_node;
	} else {
	    ende.next = new_node;
	    new_node.prev = ende;
	}
	ende = new_node; //neues Ende bestimmen
    }
    
    public int getLength() {
	return length;
    }
    
    public void print() {
	Node temp = start;
	while(temp!=null) {
	    System.out.print(temp.getData() + "-->");
	    temp = temp.next;
	}
    }
    
    public static void main(String[] args) {
	DoublyLinkedList list = new DoublyLinkedList();
	list.insertFirst("hi");
	list.insertFirst("hey");
	list.insertLast("ho");
	list.print();
    }

}
