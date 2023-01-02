import BinaryTree.BsTree;
import BinaryTree.TreeNode;
import Dao.Laptop;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BsTree tree1=new BsTree() ;
		tree1.addNode(new Laptop("lenovo E15-41",23000.0));
		tree1.addNode(new Laptop("Dell swift 3",35000.0));
		tree1.addNode(new Laptop("HP Pavillion",56000.0));
		tree1.addNode(new Laptop("Asus Vivobook 14",48000.0));
		tree1.addNode(new Laptop("Acer Aspire 5",62000.0));
		 	
		tree1.printTree();
	}

}
