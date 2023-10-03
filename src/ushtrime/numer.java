package ushtrime;

import java.util.Scanner;

public class numer {
	public static void main(String[] args) {
//gjejNumrin();
		gjejPasswordi;
	}

	public static void gjejNumrin() {
		Scanner scn = new Scanner("System.in");
		while (true) {
			
			System.out.println("Gjej numrin:");
			int nr = scn.nextInt();

			if (nr == 10) {
				System.out.println("Sapo e gjete numri eshte 10");
				break;
			} else {
				System.out.println("Vazhdoni te hamendesoni");
			}
		}
	}
}