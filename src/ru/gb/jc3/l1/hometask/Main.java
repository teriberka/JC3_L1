package ru.gb.jc3.l1.hometask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 1. Написать метод, который меняет два элемента массива местами
// (массив может быть любого ссылочного типа);
// 2. Написать метод, который преобразует массив в ArrayList;
// 3. Большая задача:
// Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
// Класс Box, в который можно складывать фрукты.
// Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// Для хранения фруктов внутри коробки можно использовать ArrayList;
//
// Сделать метод getWeight(), который высчитывает вес коробки,
// зная количество фруктов и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f.
// Не важно, в каких это единицах);
// Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
// которую подадут в compare в качестве параметра, true – если она равны по весу,
// false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//
// Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
// (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами).
//
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
// Не забываем про метод добавления фрукта в коробку.


public class Main {
    public static void main(String[] args) {
        // Задание 1
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double[] doubleArray = {1.0, 2.0, 3.0};
        String[] strArray = {"one", "two", "three", "four"};

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(strArray));

        changePositionInArray(intArray, 0 ,1);
        changePositionInArray(doubleArray, 1 ,2);
        changePositionInArray(strArray, 0 ,5);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(strArray));

        System.out.println("");

        // Задание 2
//        String[] someArray = {"apple", "orange", "lemon", "banana"};
//        ArrayList<String> someList = new ArrayList<String>();
//
//        Collections.addAll(someList, someArray);
//        for (String str : someList)
//            System.out.print(" " + str);

        String[] someArray = {"apple", "orange", "lemon", "banana"};

        ArrayList<String> someList = new ArrayList<String>();

        changeArrayToArrayList(someList, someArray);

        for (String str : someList)
            System.out.print(" " + str);

    }

    public static void changePositionInArray(Object[] someObjects, int x, int y){
        if (x > 0 && y > 0 && x < someObjects.length && y < someObjects.length) {
            Object tempObject = someObjects[x];
            someObjects[x] = someObjects[y];
            someObjects[y] = tempObject;
        } else {
            System.out.println("some param isn't correct, try again!");
        }
    }



    public static void changeArrayToArrayList(ArrayList<String> aList, String[] s){
        Collections.addAll(aList, s);
    }

}
