package trecidomaci;

import java.util.Scanner;

public class Prost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Unesite broj: ");
		n = sc.nextInt();

		while (n > 0) {
			if (n % 1 == 0 && n % n == 0) {
				System.out.println("Broj je prost: ");

			} else {
				System.out.println("Broj nije prost");
			}
			System.out.println(n);
			++n;
		}

	}

}
