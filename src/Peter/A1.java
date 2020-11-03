package Peter;

import java.util.ArrayList;

public class A1 {

    public static void main(String[] args) {

        ArrayList<String> fruitMix = new ArrayList<>();
        fruitMix.add("Banana");
        fruitMix.add("Apple");
        fruitMix.add("Orange");
        fruitMix.add("Kiwi");
        fruitMix.add("Strawberry");
        fruitMix.add("Melon");

        System.out.println(fruitMix);

        ArrayList<String> vegetableMix = new ArrayList<>();
        vegetableMix.add("Pepper");
        vegetableMix.add("Tomato");
        vegetableMix.add("Potato");
        vegetableMix.add("Onion");
        vegetableMix.add("Cucumber");
        vegetableMix.add("Spinach");

        System.out.println(vegetableMix);

        fruitMix.addAll(vegetableMix);

        System.out.println(fruitMix);
    }
}
