public class Decto {
//     public static String DectoNBase(int n,int num){  
//         String symbol = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//         String result = "";

//         if(num == 0){
//             return "0";
//         }
//         while(num>0){
//             int remainder = num % n;
//             char ch = symbol.charAt(remainder);
//             result += ch;
//             num /= n;   
//         }

//         return result;
//     }
//     public static void main(String[] args) {
//         System.out.println(DectoNBase(2, 10));
//         System.out.println(DectoNBase(12,718));
//          System.out.println(DectoNBase(2, 30));

//         System.out.println(DectoNBase(16, 255));

//         System.out.println(DectoNBase(36, 35));
//     }
// }

public static String DectoNBase(int n, int num) {

    StringBuilder result = new StringBuilder();

    if (num == 0) {
        return "0";
    }

    while (num > 0) {

        int remainder = num % n;

        char ch;

        if (remainder < 10) {
            ch = (char) ('0' + remainder);
        }
        else {
            ch = (char) ('A' + (remainder - 10));
        }

        result.append(ch);

        num /= n;
    }

    result.reverse();
    return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(DectoNBase(2, 10));
        System.out.println(DectoNBase(12,718));
         System.out.println(DectoNBase(2, 30));

        System.out.println(DectoNBase(16, 255));

        System.out.println(DectoNBase(36, 35));
    }     
}