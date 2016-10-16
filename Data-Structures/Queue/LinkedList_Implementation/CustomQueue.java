// assume node data has to be na int
class CustomQueue(){
  private LinkedList<Node> queue;
  private int size;

  /**
   * Default Constructor
   */
  public CustomQueue(){
    queue = new LinkedList<Node>;
    size = 0;
  }

  // implement constructor allow size as input ?

  public void enqueue(Node node){
    queue.addFirst(node);
  }

  public Node dequeue(){
    LinkedList<Node> newQueue = new LinkedList<Node>();
    Node lastNode = queue.getLast();
    Node tempNode = queue.getFirst();
    for(int i=0 ; i<newQueue.size()-1; i++){
          newQueue.add(tempNode);
          tempNode = tempNode.getNext();
    }
    queue = newQueue;
    return lastNode;
  }

  public Node peek(){
    return queue.getLast();
  }
} // end of queue class
