package day15_Arrays;

public class c4_array {
    public static void main(String[] args){
        int [] numberList={1,2,45,67,8,10,500,2,40};

        for (int i=0; i<=numberList.length-1; i++){

        if (numberList[i]%2==0){
            System.out.println(numberList[i]+" even number");
        }

        }
        int [] numberList2={200,45,67,8,10,500,2,40 ,695 ,1 ,-100};
        int max=numberList2[0];
        int min=numberList2[0];
        for (int i=0; i<= numberList2.length-1;i++){

            if (max<numberList2[i]){
                max=numberList2[i];
            }
            if (min>numberList2[i]){
                min=numberList2[i];
            }
        }
        System.out.println("max number is "+max);
        System.out.println("min number is "+min);








    }

}
