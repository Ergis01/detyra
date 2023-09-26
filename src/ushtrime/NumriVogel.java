package ushtrime;

public class NumriVogel {
	public static void main(String[]args) {
//Thirrja e metodes dhe printimi rezultatit
		int numri=7;
		boolean rezultati = eshteMeIVogel(numri);
        System.out.println("Numri " + numri + " eshte me i vogel se 10: " + rezultati);
    }

    // Metoda qe kthen true nese numri eshte me i vogel se 10, dhe false ne rast te kundert
    public static boolean eshteMeIVogel(int numri) {
        return numri < 10;
    }

	}


