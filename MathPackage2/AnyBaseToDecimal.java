package MathPackage2;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int b= s.nextInt(); // Base of Given n
		int ans = 0;
		int placeValue = 1;

		while (n != 0) {
			int lastDigit = n % 10;
			ans = ans + lastDigit * placeValue;
			n = n / 10;
			placeValue = placeValue * b;
		}
		System.out.println(ans);
	}

}
