package day07_switch_scanner;

public class c3_switchPractice {
    //3 cases with a b c
    //if the case is a, result should be Hello a
    //if the case is b, result should be Hello b
    //if the case is c, result should be Hello c
    //if letter is something else then Hello Invalid.

    public static void main(String[] args){
      char letter='z';
      String result="hello ";


      switch (letter) {
          case 'a':
              result +=" a";
              break;
          case 'b':
              result +=" b";
              break;
          case 'c':
              result +=" c";
              break;
          default: result=" check your in put must be a b c ";



      }
System.out.println(result);








    }
}
