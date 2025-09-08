package TCS.array.string;
import java.util.*;
public class VCWS {
    public static void solve (String str){
        int n = str.length();
        int vovel=0 ,con =0 ,space=0;
        str = str.toLowerCase();
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(ch =='a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                vovel++;
            }
            else if(ch>='a' && ch<='z'){
                con++;
            }
            else if(ch==' '){
                space++;
            }
        }
        System.out.println("Vovel :" + vovel);
        System.out.println("consonante :"+con);
        System.out.println("white space :" + space);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
            String str = sc.nextLine();
            solve (str);
        
    }
    
}
