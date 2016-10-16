class CustomBinaryTree(){

  /**
   * Default Constructor
   */
  public CustomBinaryTree(){
    // custome RootNode class?
    Node root = new Node(null);
  }

  /**
   * Constructor
   */
   public CustomBinaryTree(Object data){
     root = new Node(data);
    }

    public void insert(Object data){
      if(root.getData()==null){
        root.setData(data);
      } else{
        Node currentNode = root;
        // greater than go right
        // less than go left
        // equal -> go right
      }
    }

    public Object search(Object data){
      // if greater than go right
      // if less than go left
      // repeat tll find
      //
    }

    // traversals = preoder, inorder, postorder

    private class TreeNode(){
      Object data;
      Node rightChild;
      Node leftChild;

      TreeNode(){
        data = null;
        rightChild = new Node(null);
        leftChild = new Node(null);
      }

      void setRightChild(Object Data){
        // check make sure not override
        rightChild = new Node(data);
      }

      void setRightChild(Object data){
        // check make sure not override
        leftChild = new Node(data);
      }

      Object getRightChild(){
        return rightChild;
      }

      Object getLeftChild(){
        return leftChild;
      }

    } // end of private treeNode class
} // end of tree class
