package day06_if_ternary_nestedif;

public class c2_ternary {
    public static void main(String[] args){

        int x=6;
        int y=7;

        int max=0;
        String message="";

        if(x<y){
           max=y;
        }
        else{
            max=x;
        }
        message="Maximum number is : "+max;
        System.out.println(message);

        //ternary(another way of if else block)
        int number3=10;
        int number4=20;

        int max2;

        max2 = (number3 > number4) ? number3 : number4 ;
        //if present ?
        // : present else

        System.out.println(max2);

        String result ="";

        result = (false) ? "Java" : "Python" ;

        System.out.println(result);

        if (false){
            result = "Java";
        }else {
            result = "Python";
        }














    }

}
