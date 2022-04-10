package a_homework;

import java.util.Arrays;

// create a java logic that will count letter a or A from given string
//example
//JavA
//output should be 2
public class day_4_8_last_task {
    public static void main(String[] args) {

        String giv="javAaaaaA";
        String [] arr=giv.split("");
        System.out.println(Arrays.toString(arr));
        int counta=0;

       for (int i = 0; arr.length > i; i++){
           if (arr[i].equalsIgnoreCase("a")){
               counta++;}}
        System.out.println("sum of a or A  "  +counta);





    }
}
