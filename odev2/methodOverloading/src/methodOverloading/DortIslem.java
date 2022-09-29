package methodOverloading;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1, int sayi2,int sayi3) {		//ikisinede topla yazabilirsin çünkü ikisinin de method parametrelerinin 
		return sayi1+sayi2+sayi3;							//imzası farklı mesela biri 2 tane istiyor birisi 3
	}
	
	
	
	
}
