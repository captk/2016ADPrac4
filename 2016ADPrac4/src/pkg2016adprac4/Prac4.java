/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016adprac4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author k
 */
public class Prac4 {

    public static int max3(int num1, int num2, int num3) {
        int max = num1;
        if(max < num2) max = num2;
        if(max < num3) max = num3;
            return max;
    }
    
    public static String concat(ArrayList<String> arr) throws IllegalArgumentException{
        if (arr == null) throw new IllegalArgumentException();
        String bigString = "";
        for (String smallString: arr){
            bigString = bigString + smallString;
        }
        return bigString;
    }
    
    public static int sums1(ArrayList<Integer> arr){
        return Collections.min(arr) + Collections.max(arr);
        
    }
}
