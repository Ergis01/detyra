package ushtrime;
import java.util.Scanner; 
public class ZgjidhjaEkuacionit {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		//Kerko vlerat e a,b,c nga perdoruesi
		System.out.println("Futni vleren e 'a':");
		double a = input.nextDouble();
		System.out.println("Futni vleren e 'b':");
		double b =input.nextDouble();
		System.out.println("Futni vleren e 'c': ");
		double c=input.nextDouble();
		//Llogarit zgjidhjen e ekuacionit
		double x= (c - b) / a;
		  // Afisho rezultatin
        System.out.println("Zgjidhja e ekuacionit " + a + "x + " + b + " = " + c + " është x = " + x);
        input.close();
        
		
		
		
	}
	

}
