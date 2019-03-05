/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestclass;

import java.util.Scanner;

public class ConverterClass {

    public static void main(String[] args) {
//        int a = 0;
//        long b = 15;
//        a = (int) b;
//        System.out.println(a);

//        double d = 11.2345;
//        int i = (int) d;
//        System.out.println(i);

//        Scanner num = new Scanner(System.in);
//        int first, second, result;
//        System.out.println("Enter first num");
//        first = num.nextInt();
//        System.out.println("Enter second num");
//        second = num.nextInt();
//        result = first + second;
//        System.out.println("Result "+result);
        
        
        Scanner c = new Scanner(System.in); 
        
        System.out.println("Введите значение по Фаренгейту");
        double fc = c.nextDouble();
        double f1 = (fc-32)*5.0/9;
        System.out.println(f1);
        
        System.out.println("Введите значение по Цельсию");
        double cf = c.nextDouble();
        double f2 = (cf*9.0/5)+32;
        System.out.println(f2);
        
    }
}
