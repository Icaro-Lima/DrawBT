package icarolima.BST;

public class BSTImpl<T> {
	
	private T value;
	
	public BSTImpl(T value) {
		this.setValue(value);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
