package day16_Arrays;

import sun.tools.jar.Main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c2_ArraysSorting {

    public static void main(String[] args) {

        int[] numbers={90,-2,45,87,-299,4,6};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int  max=numbers[0];

        for (int i=0; i<= numbers.length-1;i++){
            if (max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println("max " +max);
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);


        String [] names={"M Bora","Mustafa", "Ezgi","Sezar"};

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


    }

}
