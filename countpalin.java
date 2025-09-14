package TCS.array.string;

public class countpalin {
    public static int longestpalindromic(String s){
        int n = s.length();
        if(n==0) return 0;

        int maxlen = 1;
        for(int i=0;i<n;i++){
            maxlen=Math.max(maxlen,expand(s,i,i));
            maxlen=Math.max(maxlen,expand(s,i,i+1));
        }
        return maxlen;
    }
    public static int expand(String s,int left,int right){
        int n = s.length();
        while (left>=0 && right <n && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left+1;
    }
}
