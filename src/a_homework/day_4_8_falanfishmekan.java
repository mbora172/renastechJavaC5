package a_homework;

import java.util.Scanner;

//create a java program that will ask for 5 string name to store in the array
//and print first and last letter from each string
//example
//input : berkan , firas ,merve ..
//output : bn , fs ,me
public class day_4_8_falanfishmekan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] a=new String[5];
        System.out.println("Type 5 names");

      for (int i=0;i<5; i++  ){
           a[i]=input.next();}

      for (String firstlast:a){
          System.out.print(" "+firstlast.charAt(0)+firstlast.charAt(firstlast.length()-1)+" , ");


      }









    }
}
