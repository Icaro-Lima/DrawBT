package icarolima;

public class BSTNode {

	private BSTNode left;
	private BSTNode right;
	
	public BSTNode() {
		this.left = null;
		this.right = null;
	}
	
	public boolean isLeaf() {
		return left == null && right == null;
	}
	
}
