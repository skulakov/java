/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestclass;

/**
 *
 * @author user
 */
import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        int[] numbers = {5, 6, 1, 7, 2};
        int[] numbersCopy1 = numbers;
        numbersCopy1[2] = 10;

        System.out.println("array numbers[2]= " + numbers[2] + ", array numbersCopy1[2]= " + numbersCopy1[2]);
        System.out.println();
        System.out.println("Array numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element [" + i + "] = " + numbersCopy1[i]);
        }

        int[] numbersCopy2 = new int[numbers.length];

        System.arraycopy(numbers, 0, numbersCopy2, 0, numbers.length);

        numbersCopy2[2] = 100;
        System.out.println();
        System.out.println("array numbers[2]= " + numbers[2] + ", array numbersCopy2[2]= " + numbersCopy2[2]);
        System.out.println();

        System.out.println("Array numbersCopy2");
        for (int i = 0; i < numbersCopy2.length; i++) {
            System.out.println("element [" + i + "] = " + numbersCopy2[i]);
        }
        System.out.println();
        System.out.println("Sort Array numbers");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element [" + i + "] = " + numbersCopy1[i]);
        }

        String[] testName = {
            "Васька",
            "Кузя",
            "Барсик",
            "Мурзик",
            "Леопольд",
            "Бегемот",
            "Рыжик",
            "Матроскин"
        };
        Arrays.sort(testName);
        for (int i = 0; i < testName.length; i++) {
            System.out.println("element [" + i + "] = " + testName[i]);
        }
        
    }

}
