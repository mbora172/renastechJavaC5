package practice;

public class alll {
    public static void main(String[]args){
    System.out.println("Hello world");

    //comments for us to see
        //variables
        /*Multi
        line comments
         */
        System.out.print("First Name: Bora");
          /*
        escape sequences:
     \t   It is going to leave paragraph space on the console
	 \n   It is going to move on new line on the console
	 \"   prints double quote " on the console
	 \\   prints \ on the console
	 \'   prints single quote on the console
     '    prints single quote on the console
     */
        //                There are eight primitive data types in Java:
//
//        Data Type	        Size	        Description
//        byte	            1 byte	        Stores whole numbers from -128 to 127
//        short             2 bytes	        Stores whole numbers from -32,768 to 32,767
//        int	            4 bytes	        Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	            8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


//        float	            4 bytes	        Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	        8 bytes	        Stores fractional numbers. Sufficient for storing 15 decimal digits

//        boolean	        1 bit	        Stores true or false values
//        char	            2 bytes	        Stores a single character/letter or ASCII values   'a'
//
        System.out.println("*************");
    byte a=1;
        System.out.println(a);

    short  s=-31500;
    System.out.println("s = " +s);
        long l=2100;
    double d=-15.3000;
    System.out.println("d = " +d);
    float f=5.3333f;







    boolean b1=3==(6/2);
        System.out.println(b1);
        boolean b2=6%5==1;
        System.out.println(b2);
        boolean b3=5!=5;
        System.out.println(b3);
        boolean b4=true;
        System.out.println(b4);
        boolean b5=!(true==!false);
        System.out.println(b5);

        char c1='a';
        char c2='2';
        char c3=500;
        char c4='$';
        char c5='r';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
