/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestclass;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class TestArraysClass {

    public static void main(String[] args) {
        int[] arr1 = new int[]{11, 3, 14, 16, 7};
        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] < arr1[i + 1]) {
                    isSorted = false;
                    buf = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = buf;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr1));
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
            System.out.println(testName[i]);
        }
        
        
    }
}
