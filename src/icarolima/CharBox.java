package icarolima;

public class CharBox {

	private StringBuilder[] box;
	
	public CharBox(String text) {
		this.generateBox(text.length() + 4, 3);
		
		this.writeOnBox(" -" + multiplyChar(text.length(), '-') + "- ", 0, 0);
		this.writeOnBox("| " + text + " |", 1, 0);
		this.writeOnBox(" -" + multiplyChar(text.length(), '-') + "- ", 2, 0);
	}
	
	public CharBox(String text, CharBox left, CharBox right) {
		this(text);
		
		int leftWidth = 0;
		if (left != null) {
			leftWidth = left.box[0].length();
		}
		
		int rightWidth = 0;
		if (right != null) {
			rightWidth = right.box[0].length();
		}
		
		int minLeft = this.box[0].length() / 2 - 1 - leftWidth;
		int maxRight = this.box[0].length() / 2 + 1 + rightWidth;
		
		int width = maxRight - minLeft;
		
		System.out.println(width);
	}
	
	private void generateBox(int width, int height) {
		this.box = new StringBuilder[height];
		for (int i = 0; i < height; i++) {
			this.box[i] = new StringBuilder(multiplyChar(width, ' '));
		}
	}
	
	private String multiplyChar(int x, char ch) {
		return new String(new char[x]).replace('\0', ch);
	}
	
	private void writeOnBox(String text, int i, int j) {
		if (i >= this.box.length) {
			return;
		}
		
		for (int jj = 0; j + jj < this.box[0].length() && jj < text.length(); jj++) {
			this.box[i].setCharAt(j + jj, text.charAt(jj));
		}
	}
	
	@Override
	public String toString() {
		if (this.box == null || this.box.length == 0) {
			return "";
		}
		
		String conc = "";
		for (int i = 0; i < box.length - 1; i++) {
			conc += box[i];
			conc += System.lineSeparator();
		}
		conc += box[box.length - 1];
		
		return conc;
	}
	
}
