package ushtrime;

public class Kombinimilogjik {
	public static void main(String[] args) {
        int numri1 = 25;
        int numri2 = 24;
        int numri3 = 8;

        // Kombinimet e shprehjeve logjike
        boolean kombinimi1 = (numri1 < numri2) && (numri3 % 2 == 0);
        boolean kombinimi2 = (numri1 < numri2) || (numri3 % 2 == 0);

        // Printimi i rezultateve
        System.out.println("Numri " + numri1 + " është më i vogël se numri " + numri2 +
                           " DHE numri " + numri3 + " është numër çift: " + kombinimi1);

        System.out.println("Numri " + numri1 + " është më i vogël se numri " + numri2 +
                           " OSE numri " + numri3 + " është numër çift: " + kombinimi2);

        boolean kombinimi3 = (numri1 < numri2) && (numri3 % 2 != 0);
        boolean kombinimi4 = (numri1 < numri2) || (numri3 % 2 == 0);
        boolean kombinimi5 = (numri1 < numri2) && (numri3 % 2 != 0);

        System.out.println("Numri " + numri1 + " është më i vogël se numri " + numri2 +
                           " DHE numri " + numri3 + " nuk është numër çift: " + kombinimi3);

        System.out.println("Numri " + numri1 + " nuk është më i vogël se numri " + numri2 +
                           " OSE numri " + numri3 + " është numër çift: " + kombinimi4);

        System.out.println("Numri " + numri1 + " nuk është më i vogël se numri " + numri2 +
                           " DHE numri " + numri3 + " nuk është numër çift: " + kombinimi5);

        System.out.println("Numri " + numri1 + " është më i vogël se numri " + numri2 +
                           " DHE numri " + numri3 + " nuk është numër çift: " + kombinimi3);

        System.out.println("Numri " + numri1 + " nuk është më i vogël se numri " + numri2 +
                           " OSE numri " + numri3 + " është numër çift: " + kombinimi4);

        System.out.println("Numri " + numri1 + " nuk është më i vogël se numri " + numri2 +
                           " DHE numri " + numri3 + " nuk është numër çift: " + kombinimi5);
    }







    }










