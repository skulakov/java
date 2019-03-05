/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestclass;

import java.util.Scanner;

public class IfSwitchClass {

    public static void main(String[] args) {
        System.out.println("Enter number 1, 2 or 3");
        
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        
        switch (i) {
            case 1:
                System.out.println("You enter num 1");
                break;
            case 2:
                System.out.println("You enter num 2");
                break;
            case 3: 
                System.out.println("You enter num 3");
                break;
            default:
                System.out.println("You don't enter num 1, 2 or 3");
                break;
        }
    }
}
