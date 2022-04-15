package a_homework;

import java.util.Arrays;

/*


task7
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class klnjk {
    public static void main(String[] args) {
        notString(" kalem");

    }

    public static void notString(String a){
        String[] half=a.split("");

        if (half[0].equalsIgnoreCase("n")&&half[1].equalsIgnoreCase("o")&&half[2].equalsIgnoreCase("t")){
            System.out.println(a);
        }else{
            System.out.println("not "+a);
        }

    }
}
