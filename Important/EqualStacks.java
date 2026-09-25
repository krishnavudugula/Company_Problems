import java.util.*;
public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    
    for(int num : h1){
        sum1 += num;
    }
    for(int num : h2) {
        sum2 += num;
    }
    for(int num : h3){
        sum3 += num;
    }

    int i=0;
    int j=0; 
    int k=0;

    while(!(sum1 == sum2 && sum2 == sum3)){
        if(sum1 >= sum2 && sum2 >= sum3){
            sum1 -= h1.get(i);
            i++;
        }
        else if(sum2 >= sum1 && sum2 >= sum3){
            sum2 -= h2.get(j);
            j++;
        }
        else {
            sum3 -= h3.get(k);
            k++;
        }
    }
    return sum1;
    }

}
