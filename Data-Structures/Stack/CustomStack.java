class CustomStack {
  private Node top;
  private int size;

  public CustomStack(){
    top = new Node(null);
    size = 0;
  }

  public void push(Object data){
    Node tempNode = new Node(data);
    if(top.getData()==null){
      top = node;
    } else{
      tempNode = tempNode.next(top);
      top = tempNode;
    }
    size++;
  }

  public Node pop(){
    // make sure list not empty
    // check size = 1
    Node tempNode = new Node(top.data);
    top = top.next();
    size--;

    return tempNode;
  }

  /**
   * a.k.a peek
   */
  public Node top(){
    return new Node(top.data);
  }

  public boolean isEmpty(){
    return size==0;
  }

} // end of stack class
