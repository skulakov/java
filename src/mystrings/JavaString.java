/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrings;

import mytestclass.*;
import java.util.Arrays;
import static jdk.nashorn.internal.objects.NativeRegExp.test;

/**
 *
 * @author user
 */
public class JavaString {

    public static void main(String[] args) {
        String str = "ABCDIFG";
        char[] result = str.toCharArray();

        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length; i++) {
            System.out.println("Элемент [" + i + "] " + result[i]);
        }
    }
}
