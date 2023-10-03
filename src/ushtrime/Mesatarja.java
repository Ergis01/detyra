package ushtrime;
import java.util.Scanner;
public class Mesatarja {
public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	//Kerko perdoruesin te fus 5 numra te plote.
	System.out.println("Futni 5 numra te plote");
	 int numri1 = input.nextInt();
     int numri2 = input.nextInt();
     int numri3 = input.nextInt();
     int numri4 = input.nextInt();
     int numri5 = input.nextInt();
//Llogarit mesataren
     double mesatarja= (numri1+numri2+numri3+numri4+numri5);
    System.out.println(numrat e dhene nga perdoruesi jane:"numri1+numri2+numri3+numri4+numri5");
    System.out.println("Mesatarja e tyre eshte:"+mesatarja);
    input.close();
}
}
