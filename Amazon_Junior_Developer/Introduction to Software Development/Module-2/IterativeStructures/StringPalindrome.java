public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String revString = "";
        for(int i = str.length()-1; i>=0;i--){
            revString += str.charAt(i);
        }
        if(str.equalsIgnoreCase(revString)){
            System.out.println("Palindrome ! ");
        }
        else {System.out.println("Not Palindrome");}

    }
}
