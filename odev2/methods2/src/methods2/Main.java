package methods2;

//Ekranda bir şey yazması o fonksiyonun ekrana bir şey döndürdüğü anlamına gelmiyor
//substring bir değer return ediyor
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);
		
		//String yeniMesaj = topla(); dersem yine hatalı çünkü topla integer döndürüyor ama bize String gerekli (28-29 için)
		//String yeniMesaj = ekle() dersem çalışmaaz çünkü mesaj string bizden string bir şey vermemiz bekleniyor ama void olan bir operasyon verdik olmaz
		//String yenimesaj= sehirVer(); dersem bu çalışır çünkü neden sehirVer string döndürüyor (34-35. satırda) o da Ankarayı döndürüyor
		
		System.out.println(yeniMesaj);
		//o yüzden benim o integerı kullanabilmem için;
		//int sayi = topla(); yazma gerekiyor => elimde bir sayı var onu hesaplamayı func.a yaptırmış olduk
		int sayi = toplan(5,7);
		System.out.println(sayi);
		int toplam = topla2(1,3,5,6,9);
		System.out.println(toplam);
	}
	

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
		//return; eklersem bu metodu bitir demek ama aşağıdaki fonksiyonda return döndür demek
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	//aşağıdaki fonksiyon int türünde bir değer döndürür demek
	public static int topla() {
		return 5;
		
	}
	public static int toplan(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}	
		//istenilen kadar sayı göderilebilecek hale getimek istiyorum o zaman aşağıdakini uygularım
		//variable argument deniliyor buna
	public static int topla2(int... sayilar) { //birden fazla sayı gödereceğim zaman üç tane nokta koyuyorum
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	
	public static String sehirVer() {
		return "Ankara";
		
	}
	
	
	
}
