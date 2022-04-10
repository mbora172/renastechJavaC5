package a_homework;
//task3
//write a program that can return the largest string of text from an array
//ex     String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex     String[] names = {"hello", "world", "java", "pyton", "JS" "sevgin", "renastechschool"};
//output : JS
public class day_4_8_task3 {

    public static void main(String[] args) {
        String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
        int maxt=names[0].length();
        String Wmax=names[0];
        int mint=names[0].length();
        String Wmin=names[0];

        for (int i=0;i<=names.length-1;i++){
            if (maxt < names[i].length()) {
                maxt=names[i].length();
                Wmax=names[i];}}
        System.out.println("longest text: "+Wmax);

        String[] names2 = {"hello", "world", "java", "pyton", "JS", "sevgin", "renastechschool"};
        for (int i=0;i<=names2.length-1;i++){
            if (mint>names2[i].length()){
                mint=names2[i].length();
                Wmin=names2[i];}}
        System.out.println("shortest text: "+Wmin);






    }
}
