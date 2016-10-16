class CustomBinaryTree(){
  TreeNode root;

  /**
   * Default Constructor
   */
  public CustomBinaryTree(){
    // custom RootNode class?
    root = new TreeNode();
  }

    public void insert(int data){
      // check data is not null
      if(root.getData()==-1){
        root.setData(data);
      } else{
        insertNode(root, data);
      }
    }

    private void insertNode(TreeNode currentNode, int insertData){
        int nodeData = currentNode.getData();
        if(nodeData==-1){ // assumes right and left child null
          currentNode.setData(new TreeNode(insertData));
        } else if(nodeData >= insertData){
          insertNode(currentNode.getRightChild());
        } else if (node < insertData){
          insertNode(currentNode.getLeftChild());
        } else {
          // throw exception - something went wrong
        }
      }
    }

    public boolean search(int data){
      // check data is not null (assume data cannot be null)
      if(root.getData()==-1){
        return false;
      } else{
        return searchNode(root, data);
      }
    }

    private boolean searchNode(TreeNode node, int searchData){
      int nodeData = currentNode.getData();
      if(nodeData==-1){ // assumes right and left child null
        return false;
      } else if(nodeData == searchData){
        return true;
      } else if(nodeData >= searchData){
        search(node.getRightChild(), searchData);
      } else if (node < searchData){
        search(node.getLeftChild(), searchData);
      } else {
        // throw exception - something went wrong
      }
    }

    // traversals
    // preorder
    // inorder
    // postorder

    /**
     * TreeNode class - assumes no negative values
     */
    private class TreeNode(){
      int data;
      TreeNode rightChild;
      TreeNode leftChild;

      TreeNode(){
        data = -1;
        rightChild = new TreeNode();
        leftChild = new TreeNode();
      }

      int getData(){
        return data;
      }

      TreeNode getRightChild(){
        return rightChild;
      }

      TreeNode getLeftChild(){
        return leftChild;
      }

      void setLeftChild(TreeNode node){
        leftChild = node;
      }

      void setRightChild(TreeNode node){
        rightChild = node;
      }
    } // end of private treeNode class
} // end of tree class
