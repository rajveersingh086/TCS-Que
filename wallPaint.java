package TCS;
import java.util.*;
public class wallPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ixtRate = 18;
        int extRate = 12;
        double temp;
        
        int ite = sc.nextInt();
        int ete = sc.nextInt();

        if(ite <0 || ete<0){
            System.out.println("invalid input");
        }
        else if (ite == 0 && ete ==0){
            System.out.println("cost is 0.0");

        }
        else{
            double cost=0.0;
            for(int i=0;i<ite;i++){
                temp = sc.nextDouble();
                cost += temp * ixtRate;
            }
            for(int i=0;i<ete;i++){
                temp = sc.nextDouble();
                cost +=  temp* extRate;
            }
            System.out.println("Total estimated Cost : " + cost + " INR");
        }
        
    }
    
}
