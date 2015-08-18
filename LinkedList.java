// Assignment 2 - Linked List Skeleton Code.

// A linked list class which is collection of Nodes.
class LinkedList {
  // main method.
  public static void main(String args[]) {
    LinkedList my_list = new LinkedList();
// anna here can we create a new node & data?? 
    my_list.print();
    my_list.delete(20);
    my_list.reverse();
    my_list.addToFront(20);
//    my_list.addToFront(50);
  //  my_list.addToBack(30);
    my_list.addToBack(80);
    my_list.print();
    my_list.findMiddleNode();
    System.out.println("after reverse");
    my_list.reverse();
    my_list.print();
    my_list.size();
    my_list.delete(800);
    System.out.println("after deletion");
    my_list.print();
    my_list.size();	
  }

  // Constructor.
//  LinkedList(){
  //  headNode = new Node(null, null);
    
 // }

  // add a node to the starting of the linked list.
  void addToFront(int data) {
    Node newNode = new Node(data, headNode);
    headNode = newNode;
  } 

  // add a node to the end of the linked list.
  void addToBack(int data) {
    Node newNode = new Node(data, null);
    Node lastNode = headNode;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
    }
    lastNode.next = newNode;
  }

  // print all the elements in the linked list.
  void print() {
    Node temp = headNode;
    if(temp==null)
      System.out.println("no data to print");
    while(temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  // TODO(stenni): Write a method to delete all the nodes in the linked list
  // which have the value data. Eg: Remove all nodes with data = 20.
  public void delete(int d) {
    Node tmpNode = headNode;
    Node prevNode = null;
	if(tmpNode==null){	
	   System.out.println("create node to delete");
	}    
	while(tmpNode != null) {
            if (tmpNode.data == d) {
                if (tmpNode == headNode) {
                    headNode = headNode.next;
                }
                else {
                prevNode.next = tmpNode.next;
               }
           }
         prevNode = tmpNode;
         tmpNode = tmpNode.next;
    }
}
    // Write the implementation here.
  // TODO(stenni): Write a method to calculate the size of the linked list.
 void size() {
      int size=0;
      Node currentNode=headNode;
      while(currentNode!=null){
          size++;
	  currentNode=currentNode.next;
          }
	System.out.println("length of linked list is"+size);
         
    // Write implementation here.
     // This line is written only for compilation purposes.
  }

  // TODO(stenni): Write a method to find the middle node in the linked list
  // and return it.
  public void findMiddleNode(){
 		//refered C++ Data Structure and video na
     Node slowNode = headNode;
     Node fastNode = headNode;
 
    if (headNode!=null)
    {
        while (fastNode != null && fastNode.next != null)
        {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        System.out.println("The middle element is" +slowNode.data);
    }
}
    // Write implementation here.
//    return null; // This line is written only for compilation purposes.
  

  // TODO(stenni): Write a method to reverse a linked list.
  void reverse() {
    // Implement revsere method here.

    Node prevNode   = null;
    Node currentNode = headNode;
    Node next;
    if(currentNode==null)
	System.out.println("insert a node to reverse");
    while (currentNode !=null)
    {
        next  = currentNode.next;  
        currentNode.next = prevNode;   
        prevNode = currentNode;
        currentNode = next;
    }
    headNode = prevNode;

  }
  // head of the linked list.
  private Node headNode;
};

// A Node object which forms the building block of the LinkedList object.
class Node {
  // Node constructor.
  Node(int node_data, Node next_node) {
    data = node_data;
    next = next_node;
  }
  // Node data.
  int data;
  // Pointer to the next node.
  // Note in Java there are no pointers. All are references only.
  Node next;
};
