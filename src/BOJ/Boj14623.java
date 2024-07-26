package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj14623 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String s2 = br.readLine();
        
        
        BigInteger value1 = new BigInteger(s, 2);
        BigInteger value2 = new BigInteger(s2, 2);
        
     
        BigInteger ans = value1.multiply(value2);
        
        
        String binary = ans.toString(2);
        
    
        System.out.println(binary);
    }
}