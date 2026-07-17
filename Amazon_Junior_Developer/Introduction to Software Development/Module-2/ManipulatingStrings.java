public class ManipulatingStrings {
    public static void main(String[] args) {
        String familyComment = "Toni is nice";
        familyComment.toUpperCase(); //upper case
        System.out.println(familyComment);
        familyComment.toLowerCase(); // lower case 
        //familyComment is called "Caller" for method toUppercase or toLowerCase. 
        System.out.println(familyComment);
        //startswith checks whether string starts with given substring
    	boolean result1 = familyComment.startsWith("Toni"); // true
    	boolean result2 = familyComment.startsWith("is"); // false

        System.out.println(result1+" "+result2);
        //startswith checks whether string ends with given substring

        boolean result3 = familyComment.endsWith("nice"); // true
    	boolean result4 = familyComment.endsWith("familyComment"); // false

        System.out.println(result3+" "+result4);
        // check if string is empty ?
        System.out.println("Is empty ? "+ familyComment.isEmpty());
        //gives from where the substring starts 
        // prints -1 if not found
        System.out.println("FamilyComment.indexOf(\" Space\") : " + familyComment.indexOf(" ")); 

        //substring
        System.out.println("FamilyComment.substring(3) : " + familyComment.substring(3));
        String SpacedString = " Matters A Lot ";
        System.out.println("SpacedString.trim() : #" +  SpacedString.trim() + "#");
        //equalsIgnoreCase()return true or false 

        String RandomCase1 = "TesT Now";
        String RandomCase2 = "TeSt Now";
        String RandomCase3 = "TeSt Now Man";
        System.out.println("Is 2 strings same if case is ignored? "+ RandomCase1.equalsIgnoreCase(RandomCase2));
        //comparetoIgnoreCase gives 0 if yes, any non-zero if false 
    	int value = RandomCase1.compareToIgnoreCase(RandomCase3); // returns 0
        System.out.println(value); 

    }
}
