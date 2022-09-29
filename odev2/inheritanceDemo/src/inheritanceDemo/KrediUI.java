package inheritanceDemo;

public class KrediUI {

	//	public  void krediHesapla(OgretmenKrediManager ogretmenKrediManager) {
	//	ogretmenKrediManager.hesapla();}
	// 5.satırdaki krediHesaplanın içini öyle yapmak yerine 
	
	
	public  void krediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.hesapla();
	}	
	// biz böyle yapınca anneyi veriyoruz ve onun çocuklarını istiyoruz
	// Çünkü Base hem ogretmenin hem de tarimin referansını tutabilir
}
