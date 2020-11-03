package Peter;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price){

        this.name = name;
        this.price = price;
    }
    public Product(){

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Product tv = new Product("tv",1500);
        Product soap = new Product("soap",2);
        Product knife = new Product("knife",120);

        ArrayList<Product> products = new ArrayList<>();

        products.add(tv);
        products.add(soap);
        products.add(knife);
        /*
        for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i));
        }
         */
        products.forEach(Product -> {
            System.out.println(Product.name);
        } );
        int total = 0;
        for(int j = 0; j < products.size(); j++){
            total += products.get(j).price;
        }
        System.out.println(total);

        Product computer = new Product("computer",4600);
        products.add(0, computer);
        System.out.println(products);

        products.get(1).price = 9999;
        System.out.println(products);

        products.remove(2);
        System.out.println(products);

/*
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("a");
        a = sc.nextInt();
        products.indexOf(a);
        if(a <= products.size()){
            Product tv = new Product("tv",159159);
        }
        System.out.println(products);
*/
        /*
        int x = tv.price + soap.price + knife.price;
        System.out.println(x);
        */

    }
}