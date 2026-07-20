public class BusinessCards {
    public static void main(String[] args) {
        String str = "ToNI needs Print";
        int countVowels = 0;
        int countSpaces = 0;
        for(int i = 0; i<str.length();i++){
            str = str.toLowerCase();
            char ch = str.charAt(i);
            System.out.println(ch + " ");
            if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                countVowels++;
            }
            if(ch == ' '){
                countSpaces++;
            }
        }
        int countConsonants = str.length()-countVowels-countSpaces;
        System.out.println("No of Vowels in String : "+countVowels);
        System.err.println("No of Consonants : " + countConsonants);
        System.out.println("Total cost = "+ (double)(countConsonants*1.5+countVowels*1));

    }
}
