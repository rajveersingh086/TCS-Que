package TCS.array.string;
import java.util.*;
public class perfect {
    static boolean isperfect(int n ){
        if(n<1)return false;
        int sum =1;

        for(int i =2;i*i<n;i++){
            if(n%i==0){
                sum += i;

                if(i!=n/i){
                    sum +=n/i;
                }
            }
        }
    return sum==n;
    }
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(isperfect(n)){
            System.out.println("perfect number:");
        }
        else{
            System.out.println("not perfecr ");
        }
    }
}
