public class StringExample {
        public static String removeExtraDuplicates(String s){
        StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {

            if (result.length() < 2 ||
                !(result.charAt(result.length() - 1) == c &&
                result.charAt(result.length() - 2) == c)) {

                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {

        String s = "aaabbcaaa";

        System.out.println(removeExtraDuplicates(s));
    }
}

//     public static void main(String[] args) {

//         String s = "aaaabbcaadaa";

//         StringBuilder result = new StringBuilder();

//         int[] count = new int[26];

//         for (int i = 0; i < s.length(); i++) {

//             char ch = s.charAt(i);

//             count[ch - 'a']++;

//             if (count[ch - 'a'] <= 2) {
//                 result.append(ch);
//             }
//         }

//         System.out.println(result);
//     }
// }