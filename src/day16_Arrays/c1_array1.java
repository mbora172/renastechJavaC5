package day16_Arrays;

import java.util.Arrays;

public class c1_array1 {
    public static void main(String[] args){
        int [] numbers={ 4, -90, 200 ,5};

        int sum=0;

        for (int i=0;i<= numbers.length-1;i++){
            sum+=numbers[i];
        }
        System.out.println("sum of array  "+sum);



        String [] futureSdets={"Libby", "Gulsum","Gule","Aslihan","Suleyman","Abe"};
        System.out.println(futureSdets); // If I print name of the array , it will print hashcode [Ljava.lang.String;@1540e19d
        System.out.println(Arrays.toString(futureSdets));
        /*
        Array.toString() is converting to String

         */
        int [] numlist={0,0,78,900};
        System.out.println(Arrays.toString(numlist));


        int [] list1={1,0,5}; // length=3
        //           0  1  2
        int [] list2 ={-90, 78,100,90}; // length= 4
        //              0  1  2     3


        int [] list3=new int[list1.length+ list2.length];
        for (int i=0;i<= list1.length-1;i++){
            list3[i]=list1[i];
        }
        for (int i= 0;i<= list2.length-1;i++){
            list3[i+ list1.length]=list2[i];
        }
        System.out.println(Arrays.toString(list3));













    }

}
