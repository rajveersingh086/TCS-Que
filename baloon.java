package TCS.array;
import java.util.*;

public class baloon {

    static int baloon(char [] arr){
        int n = arr.length;
        HashMap <Character ,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            char b = arr[i];
            freq.put(b,freq.getOrDefault(b,0)+1);
        }
        // for find first odd no freq
        for(int i =0;i<n;i++){
            char b = arr[i];
            if(freq.get(b) %2==1){
                return b;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        char []arr = new char[N];
        
        for(int i =0;i<N;i++){
            arr[i] = sc.next().charAt(0);
        }
        int result = baloon(arr);
        if(result == -1){
            System.out.println("all even");
        }
        else{
            System.out.println((char)result);
        }
    }
}
