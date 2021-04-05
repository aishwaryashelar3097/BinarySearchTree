public class BinarySearchTree {class BinaryTreenode {
	   // *** fields ***
	   private Comparable key;
	   private BinaryTreenode left, right;

	   // *** methods ***

	   // constructor
	   public BinaryTreenode(Comparable k, BinaryTreenode l, BinaryTreenode r) {
	       key = k;
	       left = l;
	       right = r;
	   }

	   // access to fields
	   public Comparable getKey() {return key;}
	   public BinaryTreenode getLeft() {return left;}
	   public BinaryTreenode getRight() {return right;}

	   // change fields
	   public void setKey(Comparable k) {key = k;}
	   public void setLeft(BinaryTreenode l) {left = l;}
	   public void setRight(BinaryTreenode r) {right = r;}
	}

	class BST {
	  // *** fields ***
	  private BinaryTreenode root; // ptr to the root of the BST

	  // *** methods ***
	  public BST() { root = null; } // constructor
	  public void insert(Comparable key) throws DuplicateException {...}
	      // add key to this BST; error if it is already there
	  public void delete(Comparable key) {...}
	      // remove the node containing key from this BST if it is there;
	      // otherwise, do nothing
	  public boolean lookup(Comparable key) {...}
	     // if key is in this BST, return true; otherwise, return false
	  public void print(PrintWriter p) {...}
	     // print the values in this BST in sorted order (to p)
	}

}
