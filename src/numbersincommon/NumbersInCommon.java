/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersincommon;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author wilsoncastiblanco
 */
public class NumbersInCommon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[]{12, 15, 18, 19, 25, 36, 40, 41};
        int[] array2 = new int[]{25, 26, 27, 28, 35, 36, 37, 38};
        System.out.println(getNumbersInCommon(array1, array2));
    }

    public static String getNumbersInCommon(int array1[], int array2[]) {
        String result = "";
        final Long startHashSetTime = System.nanoTime();
        HashSet<Integer> map1 = new HashSet<>(array1.length);
        for (int i = 0; i < array1.length; i++) {
            map1.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if (map1.contains(array2[i])) {
                result += array2[i] + " ,";
            }
        }
        final Long endHashSetTime = System.nanoTime();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
        return result;
    }

}
