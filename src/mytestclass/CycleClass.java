/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestclass;

import java.util.Scanner;

public class CycleClass {

    public static void main(String[] args) {
        System.out.println("\n while");
        int i = 512;
        while (i >= 1) {
            System.out.print(i + " ");
            i /= 2;
            //  i = i +7;
        }
        System.out.println("\n while");
        int j = 100;
        while (j >= 1) {
            System.out.print(j + " ");
//            j--;
//            j-=2;
            j -= 10;
        }

        System.out.println("\n  do while");
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (false);

        System.out.println("\n for");
        for (int d = 0; d < 25; d += 2) {
            System.out.print("Vsysa " + d + "; ");
        }
        System.out.println();

        System.out.println("\n for");
        for (int d = 3; d > -3; d--) {
            System.out.println(d + " ");
        }
        System.out.println();
        System.out.println("Enter a positive integer");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int sum = 0;
        System.out.println("You enter integer: " + x);
        System.out.print("(");

        for (int a = 2; a <= x; a++) {

            sum = sum + a;

            if (a == x) {
                System.out.print(a + "");
            } else {
                System.out.print(a + "+");
            }
        }
        System.out.print(")");
        System.out.print("=" + sum + "\n");
    }
}
