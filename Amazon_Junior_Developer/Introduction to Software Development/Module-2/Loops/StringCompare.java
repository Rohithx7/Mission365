public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hi I Have Manipulated Java Strings";
        String str2 = "HI I HaVe ManiPulated JAVA StRings";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Congratulations ! you have manipulated Strings ! ");
        }
        else {
            System.out.println("Sorry ! Study More. ");
        }
    }
}
