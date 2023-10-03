package ushtrime;

public class Dyfishi {
	public static void main(String[] args) {
        // Thirrja e metodes dhe printimi i rezultatit
        int numri = 7;
        int dyfishi = gjejDyfishin(numri);
        System.out.println("Dyfishi i numrit " + numri + " eshte " + dyfishi);
    }

    // Metoda qe kthen dyfishin e numrit
    public static int gjejDyfishin(int numri) {
        return numri * 2;
    }
}







