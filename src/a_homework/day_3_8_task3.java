package a_homework;
//   3. check if 350 is divisible by 2 , 3 , 5 (Check for each number)
//          if it is divisible print : 350 is divisible by 2 true
//          if it is not divisible print : 350 is divisible by 2 false

public class day_3_8_task3 {
    public static void main(String[] args) {
        boolean a=350%2==0;
        boolean b=350%3==0;
        boolean c=350%5==0;
        if (a){
            System.out.print("350 is divisible by "+2+" ");
            System.out.println(a);
        }else {
            System.out.print("350 is divisible by "+2+" ");
            System.out.println(a);
        }
        if (b){
            System.out.print("350 is divisible by "+3+" ");
            System.out.println(b);
        }else {
            System.out.print("350 is divisible by "+3+" ");
            System.out.println(b);
        }
        if (c){
            System.out.print("350 is divisible by "+5+" ");
            System.out.println(c);
        }else {
            System.out.print("350 is divisible by "+5+" ");
            System.out.println(c);
        }
        System.out.println("\nJ\ta\tv\t   v a\n  J\t  a a\t  v\t  v\t a\t a\nJ J\t aaaaa\t  V V\t aaaaa\n JJ a\t\t  a\t  V\t a\t\t   a ");
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));


    }
}
