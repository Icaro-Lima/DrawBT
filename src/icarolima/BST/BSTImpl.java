package icarolima.BST;

import icarolima.common.CharBox;

public class BSTImpl<T extends Comparable<T>> {
	
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
	
	public boolean isLeaf() {
		return this.left == null && this.right == null;
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
	public String toString() {
		return this.drawAux().toString();
	}
	
	private CharBox drawAux() {
		if (this.isLeaf()) {
			return new CharBox(this.value.toString());
		} else {
			CharBox left = null;
			CharBox right = null;
			
			if (this.left != null) {
				left = this.left.drawAux();
			}
			
			if (this.right != null) {
				right = this.right.drawAux();
			}
			
			return new CharBox(this.value.toString(), left, right);
		}
	}
	
}
