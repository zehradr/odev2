package classesWithAttributies;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Syiah");

        
        //iki türlü de kullanabilirsin
        
        //Product product =new Product();					
        //product.setName("Laptop");
        //product.setId(1);
        //product.setDescripton("Asus Laptop");
        //product.setPrice(5000);
        //product.setStockAmount(3);

        ProductManager producktManager = new ProductManager();
        producktManager.Add(product);

        System.out.println(product.getKod());


    }
}
		
	//ürünü veri tabanına ekleme işlemini ProductManager yapıyor
	//Her class tek bir görev yapmalı single responsibility olmalı buna dikkat et

