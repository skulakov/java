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
public class ArrayElements10 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Arrays.fill(num, 5);
        
        System.out.println(Arrays.toString(num));
        
        Arrays.fill(num, 0, 4, 25);
        System.out.println(Arrays.toString(num));
        
//        Arrays.sort(num);
//        System.err.println(Arrays.toString(num));
        
        int[] numCopy = Arrays.copyOf(num, num.length);
        System.out.println(Arrays.toString(numCopy));
        
        Arrays.sort(numCopy);
        System.out.println(Arrays.toString(numCopy));
        
        
        System.out.println(Arrays.equals(num, numCopy));
    }
}
