import java.util.*;
public class Substring {
    public static void main(String[] args) {
       String str = "aaabbc";
       
       char[] c = str.toCharArray();

       for(int i=0; i<c.length; i++){
              int count = 1;
              while(i < c.length - 1 && c[i] == c[i + 1]){
                count++;
                i++;
              }
              System.out.print(c[i]);
              System.out.print(count);
       }
       //output: a3b2c1
    }
}
