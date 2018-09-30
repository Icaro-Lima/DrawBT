package icarolima;

public class Main {

	public static void main(String[] args) {
		CharBox biga = new CharBox("Abc");
		CharBox bigb = new CharBox("Def");
		CharBox bigc = new CharBox("ABCDEFGHIJKLMNOPQRSTUVWXYZ", biga, bigb);
		
		System.out.println(bigc);
		
		CharBox g = new CharBox("Genivaldo");
		CharBox h = new CharBox("Lopcita");

		CharBox f = new CharBox("Leruado", g, h);
		CharBox b = new CharBox("Epaminondas");
		CharBox d = new CharBox("Inhoc");
		CharBox e = new CharBox("Chavasca", f, null);
		CharBox c = new CharBox("Silveria", d, e);
		CharBox a = new CharBox("José", b, c);
		CharBox k = new CharBox("Maria", a, null);
		
		System.out.println(g);
		System.out.println("----------------");
		System.out.println(c);
		System.out.println("----------------");
		System.out.println(k);
	}

}
