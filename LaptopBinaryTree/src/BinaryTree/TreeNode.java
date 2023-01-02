package BinaryTree;

import Dao.Laptop;

public class TreeNode {
	private Laptop laptop;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Laptop laptop) {
		super();
		//System.out.println("in treeNode constr");
		this.laptop = laptop;
		this.left=null;
		this.right=null;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
}
