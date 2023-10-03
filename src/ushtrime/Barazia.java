package ushtrime;

public class Barazia {
	public static void main(String[] args) {
        // Thirrja e metodes dhe printimi i rezultatit
        int numri1 = 5;
        int numri2 = 5;
        boolean rezultati = janeTeBarabarte(numri1, numri2);
        System.out.println("A jane te barabarte? " + rezultati);
    }

    // Metoda qe kthen true nese dy parametrat jane te barabarte, dhe false ne rast te kundert
    public static boolean janeTeBarabarte(int numri1, int numri2) {
        return numri1 == numri2;
    }
}







