package icarolima;

public class Main {

	public static void main(String[] args) {
		CharBox biga = new CharBox("Abc");
		CharBox bigb = new CharBox("Def");
		CharBox bigc = new CharBox("ABCDEFGHIJKLMNOPQRSTUVWXYZ", biga, bigb);
		
		System.out.println(bigc);
		System.out.println(Util.multiplyChar(200, '='));
		
		CharBox g = new CharBox("Genivaldo");
		CharBox h = new CharBox("Lopcita");

		CharBox f = new CharBox("Leruado", g, h);
		CharBox b = new CharBox("Epaminondas");
		CharBox d = new CharBox("Inhoc");
		CharBox e = new CharBox("Chavasca", f, null);
		CharBox c = new CharBox("Silveria", d, e);
		CharBox a = new CharBox("José", b, c);
		CharBox k = new CharBox("Maria", a, null);
		CharBox o = new CharBox("Seu Olavo", k, k);
		
		System.out.println(e);
		System.out.println(Util.multiplyChar(200, '='));
		System.out.println(g);
		System.out.println(Util.multiplyChar(200, '='));
		System.out.println(c);
		System.out.println(Util.multiplyChar(200, '='));
		System.out.println(k);
		System.out.println(Util.multiplyChar(200, '='));
		System.out.println(o);
	}

}
