import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TCS_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        long times[]=new long[testcases];
        HashMap<Long,Integer> hm=new HashMap<>();
        for (int i = 0; i < testcases; i++) {
            times[i]=(long)Math.sqrt(Math.pow(sc.nextLong(), 2)+Math.pow(sc.nextLong(), 2));
            times[i]/=sc.nextLong();
            hm.put(times[i], hm.getOrDefault(times[i], 0)+1);
        }
        int ans=0;
        for (int i = 0; i < hm.size(); i++) {
            ans+=nCr(hm.get(hm.keySet().toArray()[i]));
        }
        System.out.println(ans);
        
    }
    static int nCr(int n) 
{ 
    return fact(n) / (2 * 
                  fact(n - 2)); 
} 
  
// Returns factorial of n 
static int fact(int n) 
{ 
    int res = 1; 
    for (int i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
}