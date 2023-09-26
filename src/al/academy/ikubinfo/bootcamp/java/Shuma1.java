package al.academy.ikubinfo.bootcamp.java;

 class Shuma1 {
	 //Deklaroni dy variabla instamce lokale statike
private static int numri1;
private static int numri2;

//Konstruktori per te vendosur vlerat e dy numrave
public void Shuma(numri1, int numri2) {
	Shuma.numri1=numri1;
	Shuma.numri2=numri2;
 }

//Metoda per te llogarituy dhe ktheyer shumen e dy numrave 
public static int llogaritShumen() {
	return numri1+numri2;
}
 }

}
	



