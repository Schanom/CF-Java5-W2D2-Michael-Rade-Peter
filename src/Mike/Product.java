package Mike;

import java.util.ArrayList;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price){

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Product tv = new Product("Tv", 100);
        Product soap = new Product("Soap", 1);
        Product knife = new Product("Knife", 10);
        Product sofa = new Product("Sofa", 1000);



        ArrayList <Product> productName = new ArrayList<>();
        productName.add(tv);
        productName.add(soap);
        productName.add(knife);

        productName.forEach(Product -> {
            System.out.println(Product.name);
        } );

        int total = 0;
        for (int i = 0; i < productName.size(); i++) {
            total += productName.get(i).price;
        }
        System.out.println(total);

        productName.add(0, sofa);
        System.out.println(productName);

        productName.get(0).price = 70000;
        System.out.println(productName);

        productName.remove(2);
        System.out.println(productName);
    }
}

