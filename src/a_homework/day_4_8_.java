package a_homework;

import java.util.Scanner;

public class day_4_8_ {
    public static void main(String[] args) {
//create a java program that will check days string and depends on number you passed
//you should be able to see day name
//example : 2 tue
//3 :wed
//numbers should be between 1 to 7 (included)
//if numbers are not between 1 to 7 print invalid number
//and give user 3 attempt if it is still not between 1 to 7 then stop whole system
        //        String a=inp.next();

        String [] weekD={"MON","TUE","WED","THU","FRI","SAT","SUN"};

        Scanner inp=new Scanner(System.in);
        System.out.println("Input a number between 1-7 represent a weekday");

        for (int attempt = 2;attempt>-1;attempt--){
            int a=inp.nextInt();
        if (a<1||a>7){
            System.out.println("wrong input keep it between 1-7 3wrong attempt will block you. remaining attempt :"+attempt );

        }else {
            System.out.println("your input "+a+" is "+weekD[a-1]);
            attempt=5;
        }}



















    }
}
