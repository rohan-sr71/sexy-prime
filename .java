import java.util.Arrays; 
import java.util.Collections; 
  
class Hello 
{  
   
    public static void sexyprime(int l, int r)  
    { 
        boolean [] prime= new boolean[r + 1]; 
          
        Arrays.fill(prime, true); 
          
  
        for (int p = 2; p * p <= r; p++) 
        { 
           
            if (prime[p] == true)  
            { 
                for (int i = p * 2; i <= r; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        for (int i = l; i <= r - 6; i++)  
            if (prime[i] && prime[i + 6]) 
                System.out.print( "(" + i + ", "
                        + (i + 6) + ") ");  
    } 
  
    public static void main(String[] args) 
    { 
        int L = 6, R = 59; 
        sexyprime(L, R); 
    } 
} 
