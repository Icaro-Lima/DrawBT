package icarolima;

public class Main {

	public static void main(String[] args) {
		CharBox g = new CharBox("Genivaldo");
		CharBox h = new CharBox("Lopcita");

		CharBox f = new CharBox("Leruado", g, h);
		CharBox b = new CharBox("Epaminondas");
		CharBox d = new CharBox("Inhoc");
		CharBox e = new CharBox("Chavasca", f, null);
		CharBox c = new CharBox("Silveria", d, e);
		CharBox a = new CharBox("José", b, c);
		
		System.out.println(a);
	}

}
