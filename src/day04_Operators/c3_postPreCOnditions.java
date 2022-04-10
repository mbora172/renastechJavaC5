package day04_Operators;

public class c3_postPreCOnditions {
    public static void main(String[] args){

        int x=10;
        System.out.println(x);
        //pre condition
        System.out.println(++x); //pre condition will increase number by 1 immidat

        int y=20;
        System.out.println(y);

        //post condition
        //it will effect on next time
        System.out.println(y++); //20
        System.out.println(y); //21

        byte number1=30;
        System.out.println(number1); //30
        System.out.println(--number1); //29

        int n2=50;
        System.out.println(n2--);//post //50 next is 49
        System.out.println(n2--);//post //49 next 48
        System.out.println(--n2);//pre 47
        System.out.println(n2); //47








    }
}
