import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str= br.readLine();
        String answer="";
        for(int i=0; i<str.length(); i++){
            char a =str.charAt(i);
            if(Character.isUpperCase(a)) answer+=Character.toLowerCase(a);
            else if(Character.isLowerCase(a)) answer+=Character.toUpperCase(a);
        }
        System.out.println(answer);
        
    }
}