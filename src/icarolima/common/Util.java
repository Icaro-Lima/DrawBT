package icarolima.common;

public class Util {

	public static String multiplyChar(int x, char ch) {
		return new String(new char[x]).replace('\0', ch);
	}

}
