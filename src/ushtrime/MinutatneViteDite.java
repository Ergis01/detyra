package ushtrime;
import java.util.Scanner;
public class MinutatneViteDite {
	public static void main(String[]Args) {
		Scanner input=new Scanner(System.in);
		//Kerko perdoruesin te fuse numrin e minutave
		System.out.println("Futni numrat e minutave");
		int minutat=input.nextInt();
		//Llogari numrin e viteve dhe diteve
		int vite = minutat / (365 * 24 * 60);
        int ditet = (minutat % (365 * 24 * 60)) / (24 * 60);
        // Afisho rezultatin
        System.out.println("Numri i viteve për " + minutat + " minuta është: " + vite);
        System.out.println("Numri i ditëve për " + minutat + " minuta është: " + ditet);
        input.close();

}
}