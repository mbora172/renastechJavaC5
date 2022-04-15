package a_homework;

import java.util.Arrays;

public class late {

        public static void main(String[] args) {
            frontBack("killling");
        }
        public static void frontBack(String a){
            String[] cut=a.split("");
            String[] flip=new String[cut.length];
            flip[0]=cut[a.length()-1];
            flip[a.length()-1]=cut[0];

            for(int i=1; i<=a.length()-2;i++) {
               flip[i]=cut[i];
            }
            for (String word : flip){
                System.out.print(word);
            }

        }
    }

