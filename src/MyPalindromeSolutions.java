public class MyPalindromeSolutions {

    public static void main(String[] args) {
        System.out.println(palindrome2("madam"));
        System.out.println(palindrome2("level"));
        System.out.println(palindrome2("raceCar"));
        System.out.println(palindrome2("rotor"));
        System.out.println(palindrome2("kaYak"));
        System.out.println(palindrome2("abba"));
    }

    public static boolean Palindrome(String s) {

        String lowercase = s.toLowerCase();
        String reverseString = "";
        StringBuilder newBuilder = new StringBuilder();

        if(s.length()==0){
            return false;
        }

        for(int i = s.length()-1; i>0; i-- ){
            newBuilder.append(lowercase.charAt(i));
        }

        reverseString = String.valueOf(newBuilder);

        for(int i =0; i < lowercase.length()-1; i++){
            if(reverseString.charAt(i)==lowercase.charAt(i)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome2(String s1) {
        //should be O(n) at most
        String s=s1.toLowerCase();
        for(int i =0,j=s.length()-1; i < s.length()||j>0; i++,j--) {
                if(j==i){
                    return true;
                }
                if(s.charAt(i)!=s.charAt(j)) {
                    return false;
                }
        }
        return true;
    }

}
