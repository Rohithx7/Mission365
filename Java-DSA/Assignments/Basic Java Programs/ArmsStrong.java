
public class ArmsStrong {
    
    public static void main(String[] args) {

        // Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // ArmsStrong(n);

        for(int i = 100 ; i< 1000;i++){

            if(isArmsStrong(i)){
                System.out.println(i + " ");
            }


        }
        
    }
    // static void ArmsStrong(int n)
    // {
    //     int original = n;
    //     int sum = 0;
    //     while(n>0){

    //         int rem =  n%10;
    //         n = n/10; 
    //         sum += rem*rem*rem;

    //     }
    //     if(sum==original){
    //         System.out.println(original + " Ayes Armstrong !");
    //     }
    //     else {
    //         System.out.println(original + " Noes Armstrong !");
    //     }

    // }


     static boolean isArmsStrong(int n)
    {
        int original = n;
        int sum = 0;
        while(n>0){

            int rem =  n%10;
            n = n/10; 
            sum += rem*rem*rem;

        }
        if(sum==original){
           return true;
        }
        
            return false;
    

    }
}
