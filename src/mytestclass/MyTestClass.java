/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestclass;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyTestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println("Hello, World!");
//        byte bt = -127;
//        int x = 5;
//        float fl = -35.22f;
//        double db = -36935.22022d;
//        long lng = 12345678910l;
//        char ch = 12;
//        String str = "Vasya";
//
//        System.out.println("byte: " + bt);
//        System.out.println("long: " + lng);
//        System.out.println("int: " + x);
//        System.out.println("float: " + fl);
//        System.out.println("double: " + db);
//        System.out.println("char: " + ch);
//        System.out.println("string: " + str);


//

//System.out.format("The value of e is %-10.4f%n", Math.E);
//System.out.printf("The value of e is %-10.5f%n", Math.PI);
//System.out.printf(Locale.ENGLISH, "Using locale: %,d%n", 123456789);

//final double PI = (double ) 22 / 7;

//System.out.printf(String.join("%n",
//        "Using argument index:",
//        "First number: %1$-5d",
//        "Second number: %2$5d",
//        "PI: %3$.20f%n"), 123, 456, PI);



Scanner scn = new Scanner(System.in);
System.out.print("Enter the number: ");
int number = scn.nextInt();
System.out.printf("You number is %d%n", number);
System.out.print("Enter your name: ");
String name = scn.next();
System.out.println("Your name is " + name);

    }
    
}
