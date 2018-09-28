package icarolima;

public class CharBox {

	private String[] box;
	
	public CharBox(String text) {
		this.box = new String[] {
				new String(),
				new String(),
				new String()
		};
		
		this.box[0] += "/-";
		this.box[1] += "| ";
		this.box[2] += "\\-";
		
		this.box[0] += new String(new char[text.length()]).replace('\0', '-');
		this.box[1] += text;
		this.box[2] += new String(new char[text.length()]).replace('\0', '-');
		
		this.box[0] += "-\\";
		this.box[1] += " |";
		this.box[2] += "-/";
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
