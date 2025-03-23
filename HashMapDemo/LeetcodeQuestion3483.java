package HashMapDemo;

import java.util.*;

public class LeetcodeQuestion3483 {

	public int totalNumbers(int[] digits) {

		HashMap<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j < digits.length; j++) {
				for (int k = 0; k < digits.length; k++) {

					if (i != j && j != k && i != k) {
						int digit = digits[i] * 100 + digits[j] * 10 + digits[k];
						if (digit > 99 && digit < 1000 && digit % 2 == 0) {
							// System.out.println(digit);
							hm.put(digit, 1);
						}
					}

				}
			}
		}
		return hm.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
