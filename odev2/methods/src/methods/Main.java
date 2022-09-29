package methods;
//https://www.youtube.com/watch?v=XsIJn8pjdOM&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=25&ab_channel=EnginDemiro%C4%9F

//javada kodlar main'den başlar

public class Main {

	public static void main(String[] args) {
	
	//burada mainin içinde her hangi bir şey yoksa çalışacak bir şey yok
	sayiBulmaca();
	
	}
	
	//function oluşturmak bizi tekrara düşmekten kurtarıyor
	//javada func oluştururken isimler camelCase ile yazılır
	//Bir değişken tanımlandığında tanımlandığı blokta geçerlidir
		//Bir main içindeki değişkeni diğerleri içinde kullanmak istediğimde ya func isminden sonra() içine yazarım
 
	public static void	sayiBulmaca() {
		
		int[] sayilar = new int[]{1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak){
				varMi = true;
				break;
			}
		}
		String mesaj ="";
		if(varMi) {
			mesaj="Sayı mevcuttur:" +aranacak;
			mesajVer("Sayı mevcuttur:" +aranacak);
		}else {
			mesajVer("Sayı mevcut değildir:" +aranacak);
		}
			
	}
	public static void mesajVer (String mesaj) {
		System.out.println(mesaj);
	}
	
//Bir main içindeki değişkeni diğerleri içinde kullanmak istediğimde ya func isminden sonra() içine yazarak çağırırım
	//public static void mesajVer(int aranacak) {
		//System.out.println("Sayı mevcuttur:" +aranacak);}
		//buna PARAMETRELİ METOT deniyor
	//2.metot olarakta aşağıdaki
	//if(varMi) {
		//mesajVer(aranacak);
	//}else {
		//System.out.println("Sayı mevcut değildir:" +aranacak);}
	
	
}
