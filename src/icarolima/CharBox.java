package icarolima;

public class CharBox {

	private StringBuilder[] box;
	
	private int posFather;
	
	public CharBox(String text) {
		this.box = this.generateBox(text.length() + 4, 3);
		
		this.writeOnBox(this.box, 
			" -" + Util.multiplyChar(text.length(), '-') + "- ", 0, 0
		);
		
		this.writeOnBox(this.box, "| " + text + " |", 1, 0);
		
		this.writeOnBox(this.box, 
			" -" + Util.multiplyChar(text.length(), '-') + "- ", 2, 0
		);
		
		this.setPosFather(this.width() / 2);
	}
	
	public CharBox(String text, CharBox left, CharBox right) {
		this(text);
		
		if (left == null) {
			left = new CharBox("");
		}
		
		if (right == null) {
			right = new CharBox("");
		}
		
		int leftWidth = 0;
		leftWidth = left.box[0].length();
		
		int rightWidth = 0;
		rightWidth = right.box[0].length();
		
		int minleft = Math.min(0, leftWidth - this.width() / 2);
		int maxright = Math.max(leftWidth + rightWidth, leftWidth + (int)(this.width() / 2.0 + 0.5));
		
		int width = maxright - minleft;
		int height = this.box.length + Math.max(left.box.length, right.box.length) + 3;
		
		StringBuilder[] box = this.generateBox(width, height);
		
		int posFather = Math.max(this.width() / 2, leftWidth);
		
		this.setPosFather(posFather);
		this.writeOnBox(box, this.box, 0, posFather - this.width() / 2);
		
		int posLeft = posFather - (int)(leftWidth / 2.0 + 0.5);
		this.writeOnBox(box, left.box, this.height() + 3, posLeft - leftWidth / 2);
		
		int posRight = posFather + rightWidth / 2;
		this.writeOnBox(box, right.box, this.height() + 3, posRight - rightWidth / 2);
		
		writeOnBox(box, "|", this.height(), posFather);
		writeOnBox(box, Util.multiplyChar((posFather - posLeft) + (leftWidth / 2 - left.posFather), '-'), this.height() + 1, posLeft - (leftWidth / 2 - left.posFather) + 1);
		writeOnBox(box, "/", this.height() + 2, posLeft - (leftWidth / 2 - left.posFather));
		
		writeOnBox(box, "|", this.height(), posFather);
		writeOnBox(box, Util.multiplyChar((posRight - posFather) + (right.posFather - rightWidth / 2) - 1, '-'), this.height() + 1, posFather);
		writeOnBox(box, "\\", this.height() + 2, posRight + (right.posFather - rightWidth / 2) - 1);
		
		this.box = box;
	}
	
	public int width() {
		return this.box[0].length();
	}
	
	public int height() {
		return this.box.length;
	}
	
	private StringBuilder[] generateBox(int width, int height) {
		StringBuilder[] box = new StringBuilder[height];
		for (int i = 0; i < height; i++) {
			box[i] = new StringBuilder(Util.multiplyChar(width, ' '));
		}
		
		return box;
	}
	
	private void writeOnBox(StringBuilder[] box, String text, int i, int j) {
		if (i >= box.length) {
			return;
		}
				
		for (int jj = 0; j + jj < box[0].length() && jj < text.length(); jj++) {
			if (j + jj >= 0) {
				box[i].setCharAt(j + jj, text.charAt(jj));
			}
		}
	}
	
	private void writeOnBox(StringBuilder[] mainBox, StringBuilder[] box, int i, int j) {
		for (int ii = 0; i + ii < mainBox.length && ii < box.length; ii++) {
			writeOnBox(mainBox, box[ii].toString(), i + ii, j);
		}
	}
	
	public int getPosFather() {
		return posFather;
	}

	private void setPosFather(int posFather) {
		this.posFather = posFather;
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
