package day05_ifStatements;

public class c3_minNumber {
    public static void main(String[] args){
        // to be able to apply my logic
        //1.i will create 3 numbers
        //2.create 3 boolean condtion to check which boolean is true
        //3. create 3 if condition to check boolens and print minumum number

        int x=200;
        int y=100;
        int z=150;

       boolean xMin= x<y && x<z;
       boolean yMin= y<z && y<z;
       boolean zMin= z<y && z<x;


        if(xMin){
            System.out.println("Minumum number is "+x);
        }



        if (yMin){
            System.out.println("Minimum number is "+y);
        }
        if (zMin){
            System.out.println("Minimum number is "+z);
        }





    }








    }

