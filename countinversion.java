package TCS.array.string;
import java.util.*;
public class countinversion {
    public static int mergesort(int []arr,int left,int right){
        if(left>=right) return 0;
        int mid = left + (right-left)/2;
        int count =0;
        count += mergesort(arr,left,mid);
        count += mergesort(arr,mid+1,right);

        count += countmerge(arr,left,mid,right);
        return count;
    }
    private static int countmerge(int []arr,int left,int mid, int right){
        int n = arr.length;

        int[] leftArr = Arrays.copyOfRange(arr,left,mid+1);
        int[] rightArr = Arrays.copyOfRange(arr,mid+1,right+1);

        int i=0,j=0,count=0;
        int k=left;

        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
                count+=leftArr.length-i;
            }
        }
        while(i<leftArr.length){
            arr[k++] = leftArr[i++];
        }
        while(j<rightArr.length){
            arr[k++] = rightArr[j++];
        }
        return count;
    }
}
