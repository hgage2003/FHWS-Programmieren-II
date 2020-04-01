package klausurvorbereitung.lists;

public class Node {

    Node next;
    Node prev;
    String data;
    
    public Node(String data) {
	this.data = data;
    }
    
    public String getData() {
	return this.data;
    }
    
    public Node getNext() {
	return this.next;
    }
    
    public Node getPrev() {
	return this.prev;
    } 
}
