public class ReversalString {
    public static void main(String[] args) {
        String str = "Hi I am Learning Java";
        String strResult = "";
        int length = str.length();
        for(int i=length-1;i>=0;i--){
            char ch = str.charAt(i);
            strResult += ch;
           
        }

         System.out.print(strResult );
    }
}
