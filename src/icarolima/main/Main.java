package icarolima.main;

import icarolima.BST.BSTImpl;

public class Main {

	public static void main(String[] args) {
		BSTImpl<Integer> bst = new BSTImpl<>(5);
		
		bst.add(-6);
		bst.add(-7);
		bst.add(-8);
		bst.add(3);
		bst.add(7);
		bst.add(11);
		bst.add(9);
		bst.add(14);
		bst.add(15);
		
		System.out.println(bst.draw());
	}
	
}
