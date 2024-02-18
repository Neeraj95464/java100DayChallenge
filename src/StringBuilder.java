import java.util.Scanner;

public class StringBuilder
{
// take number of strings or characters and print them as a single string ;

    public static void main(String[] args){
    String[] str=new String[] {"Neeraj" , "is" , "a","boy"};
    java.lang.StringBuilder sb=new java.lang.StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
}}
