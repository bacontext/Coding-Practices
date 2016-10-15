class CustomLinkedList {
  private Node head;
  private int size;

  public CustomLinkedList(){
    head = new Node(null);
    size = 0;
  }

  /**
  * Adds node to end of the linkedlist 
  */
  public void add(Object data){
    Node tempCustomNode = new Node(data);
    Node currentCustomNode = head;

    while(currentCustomNode.getNext() != null){
      currentCustomNode = currentCustomNode.getNext();
    }
    currentCustomNode.setNext(tempCustomNode);
    size++;
  }

}


 add(data) - appends to end of list-style
 add(in index, data)
 addFirst(data)
 addLast(data)
 clear()
 contains()
 element()
 get()
 getFirst()
 getLast()
 IndexOf()
