package day02_variables;

public class c5_variables {
    public static void main(String[] args){
///byte  -128 to 127
        //byte number1=135; this will give error
        byte number2=-23;
                //byte number3=3.3 decimal not work on byte
        System.out.println(35);
        System.out.println(number2);


        // short    2 bytes      stores whole numbers from -32,768 to 32,767
        short s1=128;
        short s2=25;
        short s3=20000;            //short 40000 no go

        System.out.println("**********");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);





        // int  4 bytes store whole numbers from -2,147,483,648 to 2,147,483,647   int is default
        int  i1=1234;
        System.out.println(i1);

        System.out.println("35"); //this is text
        System.out.println(35);    //this is actual number

        // long   8 bytes Stores  -9904385093485092850934580 to 98473150987403198435
        long l1=2000;
        long l2=200000000000L; // if u out of int range u put L at the end

        System.out.println(l1);
        System.out.println(l2);








    }




}
