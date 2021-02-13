package algo;

public class Cipher {

	/**
	 * @param sentence, eg : "tacos"
	 * @param shift,    eg : 3
	 * @return encrypted sentence, eg : "wdfrv"
	 */
	public static String caesar(String sentence, int shift) {

		StringBuilder encrypted = new StringBuilder();

		for (int i = 0; i < sentence.length(); i++) {
			int charPosition = (sentence.charAt(i) - 'a' + shift) % 26 + 26;
			encrypted.append((char) ('a' + charPosition % 26));
		}

		return encrypted.toString();
	}
}
