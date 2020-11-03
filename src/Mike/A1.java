package Mike;

import java.util.ArrayList;
import java.util.Collections;

public class A1 {
    public static void main(String[] args) {
        ArrayList <String> fruitMix = new ArrayList<>();

        fruitMix.add("Banana");
        fruitMix.add("Kiwi");
        fruitMix.add("Melon");
        fruitMix.add("Apple");
        fruitMix.add("Pear");
        fruitMix.add("Dragon fruit");

        ArrayList <String> otherList = new ArrayList<>();

        otherList.add("Cd");
        otherList.add("Bb");
        otherList.add("Ab");
        otherList.add("Db");
        otherList.add("Eb");
        otherList.add("Fb");

        System.out.println(fruitMix);
        System.out.println(otherList);

        fruitMix.addAll(otherList);
        System.out.println(fruitMix);
        ArrayList <String> fruitMix2 = new ArrayList<>();
        fruitMix2.addAll(fruitMix);

        Collections.sort(fruitMix2);
        System.out.println(fruitMix2);

        Collections.reverse(fruitMix2);
        System.out.println(fruitMix2);
    }
}
