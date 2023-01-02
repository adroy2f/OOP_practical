package BinaryTree;

import Dao.Laptop;

public class BsTree {
	private TreeNode root;
	private Boolean isPriceSort;

	public BsTree(TreeNode root) {
		super();
		this.isPriceSort=false;
		this.root = root;
	}
	
	public BsTree() {
		super();
		this.isPriceSort=false;
		this.root =null;
	}
	
	public BsTree(Boolean c) {
		super();
		this.isPriceSort=c;
		this.root =null;
	}
	

	public void addNode(Laptop laptop)
	{
		if(this.getIsPriceSort().equals(false))
			this.root=insertNode(this.getRoot(),new TreeNode(laptop));
		else
			this.root=insertNodeBasedPrice(this.getRoot(),new TreeNode(laptop));
		
	}
	
	private TreeNode insertNodeBasedPrice(TreeNode current, TreeNode newnode) 
	{
		if(current==null)
			return newnode;
		if(current.getLaptop().getPrice()>=newnode.getLaptop().getPrice())
				current.setRight(insertNode(current.getRight(),newnode));
		else
				current.setLeft(insertNode(current.getLeft(),newnode));
		return current;	
	}

	private TreeNode insertNode(TreeNode current, TreeNode newnode)
	{
		if(current==null)
			return newnode;
		if(current.getLaptop().getMoldel().compareTo(newnode.getLaptop().getMoldel())<=0)
				current.setRight(insertNode(current.getRight(),newnode));
		else
				current.setLeft(insertNode(current.getLeft(),newnode));
		return current;	
	}
	
	private void display(TreeNode root)
	{
		if(root==null)
			return;
		display(root.getLeft());
		System.out.println(root.getLaptop().getMoldel());
		display(root.getRight());
	}
	
	public void printTree()
	{display(this.getRoot());
	}
	
	public TreeNode getRoot() {
		return this.root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public Boolean getIsPriceSort() {
		return isPriceSort;
	}

	private void setIsPriceSort(Boolean isPriceSort) {
		this.isPriceSort = isPriceSort;
	}
	
}
