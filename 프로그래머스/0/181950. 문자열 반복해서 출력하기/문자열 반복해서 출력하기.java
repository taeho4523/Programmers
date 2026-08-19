import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String a=st.nextToken();
        int b=Integer.parseInt(st.nextToken());
        for(int i=0; i<b; i++){
            System.out.print(a);
        }
    
    }
}