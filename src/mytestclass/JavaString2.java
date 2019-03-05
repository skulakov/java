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
public class JavaString2 {

    public static void main(String[] args) {
        char[] chars = {
            'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'
        };

        System.out.println("Массив: " + Arrays.toString(chars) + "\n");

        String s1 = "Строка до объединения s1";
        System.out.println(s1);
        s1 = s1.copyValueOf(chars);
        System.out.println(s1);

       
        String str1 = "Строка";
        String str2 = s1.copyValueOf(chars);
        String str3 = s1.copyValueOf(chars, 2, 7);

        System.out.println("До смещения: " + str2);
        System.out.println("После смещения на 2 символа: " + str3);
        str3 = s1.copyValueOf(chars, 7, 7);
        System.out.println("После смещения на 7 символов: " + str3);
    }
}
