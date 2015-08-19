public class BinarySearchTree{
    BSTNode ROOT;
    public BinarySearchTree(){
	this.ROOT = null;
    }
    void insertNode(BSTNode node, int data)
    {
        if (node == null){  //prints root node
            node = new BSTNode(data);
            ROOT = node;
        }
        else if (data < node.data && node.left == null){ //if less than root node prints in left 
            node.left = new BSTNode(data);
            node.left.parent = node;
        }
        else if (data >= node.data && node.right == null){ //if greater than root node prints in right 
            node.right = new BSTNode(data);
            node.right.parent = node;
        }
        else{
            if (data < node.data){  //prints in left child
                insertNode(node.left, data);
            }
            else{ //prints in right child
                insertNode(node.right, data);
            }
        }
    }
 
    public void printInOrder(BSTNode node) // sorted format
    {
        if (node != null)
        {
            printInOrder(node.left);
            System.out.print(node.data + " - ");
            printInOrder(node.right);
        }
    }

    public void printPostOrder(BSTNode node) //visit children left to right then d node
    {
        if (node != null)
        {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " - ");
        }
    }

    public void printPreOrder(BSTNode node) // recursively visiting root first then children left to right
    {
        if (node != null)
        {
            System.out.print(node.data + " - ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public static void main(String[] args)
    {
        BinarySearchTree f = new BinarySearchTree();     
        f.insertNode(f.ROOT, 20);
        f.insertNode(f.ROOT, 5);
        f.insertNode(f.ROOT, 25);
        f.insertNode(f.ROOT, 3);
        f.insertNode(f.ROOT, 7);
        f.insertNode(f.ROOT, 27);
        f.insertNode(f.ROOT, 24);
        f.printInOrder(f.ROOT);
        System.out.println("");
        f.printPostOrder(f.ROOT);
        System.out.println("");
        f.printPreOrder(f.ROOT);
        System.out.println("");

    }
}
class BSTNode
{
    int data;
    BSTNode parent;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

};


/*               20
                 /\
                /  \
               5   25
              /\   /\
             3  7 24 27  is this BST format correct na?
*/