package ushtrime;

public class Drejtkendshi {
public static void main(String[]args) {
	//thirrja e metodes dhe printimi rezultatit.
	double gjatesia =5.0;
	double gjeresia=3.0;
	double perimetri=llogaritPerimetrin(gjatesia,gjeresia);
	System.out.println("Perimetri i drejtkemdshit eshte: "+ perimetri);
}
	//Metoda qe llogarit perimetrin
	public static double  llogaritPerimetrin(double gjatesia, double gjeresia) {
		double perimetri = 2 *(gjatesia+gjeresia);
		return perimetri;
	
	}
}
