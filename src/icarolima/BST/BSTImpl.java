package icarolima.BST;

import icarolima.common.Drawable;

public class BSTImpl<T extends Comparable<T>> implements Drawable {
	
	private T value;
	
	private BSTImpl<T> left;
	private BSTImpl<T> right;
	
	public BSTImpl(T value) {
		this.value = value;
	}
	
	public void add(T value) {
		if (value.compareTo(this.value) <= -1) {
			this.addOnLeft(value);
		} else {
			this.addOnRight(value);
		}
	}
	
	private void addOnLeft(T value) {
		if (this.left == null) {
			this.left = new BSTImpl<T>(value);
		} else {
			this.left.add(value);
		}
	}
	
	private void addOnRight(T value) {
		if (this.right == null) {
			this.right = new BSTImpl<T>(value);
		} else {
			this.right.add(value);
		}
	}
	
	public T value() {
		return this.value;
	}

	public BSTImpl<T> getLeft() {
		return this.left;
	}

	public BSTImpl<T> getRight() {
		return this.right;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
