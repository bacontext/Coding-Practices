// assume linkedlist data is an int
class CustomLinkedList {
  private Node head;
  private int size;

  /**
  * Constructor
  */
  public CustomLinkedList(){
    head = new Node();
    size = 0;
  }

  /**
  * Adds node to the end of the linkedlist
  */
  public void add(Node node){
    addLast(node);
  }

  /**
  * Adds node at the index provided
  */
  public void add(int index, Node node){
    // validate index is within limits
    Node newCustomNode = new Node(node.getData());
    if(head.getData()==null){
      head = newCustomNode;
    } else if(index==0){
      newCustomNode.setNext(head);
      head = newCustomeNode;
    } else {
      Node currentCustomNode = head;
      for(int i=1; i < index-1; i++){
        currentCustomNode = currentCustomNode.getNext();
      }
      newCustomNode.setNext(currentCustomNode.getNext());
      currentCustomNode.setNext(tempCustomNode);
    }
    size++;
  }

  /**
  * Adds node to the end of the linkedlist
  */
  public void addLast(int data){
    Node tempCustomNode = new Node(data);
    if(head.getData()==null){
      head = tempCustomNode;
    }
    else{
      Node currentCustomNode = head;
      while(currentCustomNode.getNext() != null){
        currentCustomNode = currentCustomNode.getNext();
      }
      currentCustomNode.setNext(tempCustomNode);
    }
    size++;
  }

  /**
  * Adds node at the head of the linkedlist
  */
  public void addFirst(Object data){
    add(0,data);
  }

  /**
  * Resets the linkedlist to original state of one empty node and size 0
  */
  public void clear(){
    head = new Node(null);
    size = 0;
  }

  public boolean contains(Object data){
    Node tempCustomNode = head;
    for(int i=0; i < size; i++){
      if(tempCustomNode.getData().equals(data){
        return true;
      } else{
        tempCustomNode = tempCustomNode.getNext();
      }
    }
    return false;
  }

}
/** TO IMPLEMENT:
 * element()
 * get()
 * getFirst()
 * getLast()
 **/
