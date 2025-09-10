package TCS.array.string;
import java.util.*;
public class largestWord {
    static String larword(String str){
        String [] words = str.split("\\s+");
        String largest="";
        for(String word : words){
            if(word.length()>largest.length()){
                largest = word;
            }
        }
        return largest;
    }
    public static void main(String args[]){
        System.out.println("enter the string : ");
        Scanner sc = new Scanner (System.in);
        String st = sc.nextLine ();

        String res = larword(st);
        System.out.println( "largest : " + res);
    }
}
