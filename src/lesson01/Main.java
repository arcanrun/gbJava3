package lesson01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        runOne();
//        runTwo();
//        runThree();

    }

    private static void runThree() {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Box<Apple> appleBox1 = new Box<>();

        Apple apple = new Apple();
        Orange orange = new Orange();

        for (int i = 0; i < 5; i++) {
            appleBox.add(apple);
            orangeBox.add(orange);
        }
        ;
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());


        System.out.println(appleBox.compare(orangeBox));

        System.out.println(appleBox.sprinkle(appleBox));
        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.sprinkle(appleBox1));

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }

    private static void runTwo() {
        String[] arr = {"1", "2"};
        System.out.println(arr.getClass().getName());

        System.out.println(toArrayList(arr).getClass().getName());
        System.out.println(toArrayList(arr));
    }


    private static void runOne() {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(Arrays.toString(changeSwapElements(arr, 2, 0)));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OOPS");
        }
    }

    private static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> res = new ArrayList<>();
        Collections.addAll(res, arr);

        return res;
    }

    public static <T> T[] changeSwapElements(T[] arr, int indexA, int indexB) throws ArrayIndexOutOfBoundsException {
        T tempVar = arr[indexA];

        arr[indexA] = arr[indexB];
        arr[indexB] = tempVar;

        return arr;
    }
}
