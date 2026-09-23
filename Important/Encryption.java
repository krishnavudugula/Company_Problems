public class Encryption {
    public static void main(String[] args) {
        String name = "Zomato";
        int  k = 92;
        k %= 26;
        StringBuilder result = new StringBuilder();

            for(char c: name.toCharArray()){
                if(Character.isLetter(c)){
                    if(Character.isUpperCase(c)){

                        char encrypted = (char) (((c - 65 + k)) % 26 + 65);
                        result.append(encrypted);
                    } 
                    else if (Character.isLowerCase(c)){
                        char encrypted = (char) (((c - 97 + k)) % 26 + 97);
                        result.append(encrypted);
                    }
                    else {
                        result.append(c);
                    }
                } 
    }   

            System.out.println(result);
}
}
