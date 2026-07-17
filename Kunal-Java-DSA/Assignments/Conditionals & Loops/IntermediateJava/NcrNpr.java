
import java.util.Scanner;

class NcrNpr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int num = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;
        for(int i=1;i<=num;i++){
            nfact *= i;
            
        }
        for(int i=1;i<=r;i++){
            rfact *= i;
        }
        
        if((num-r)>0 && r >0){
            for(int i=1;i<=(num-r);i++){
            nrfact *= i;
            
             }
        System.out.println("ncr : " + nfact/(rfact*nrfact));
        
        }

        if(r>0){
            
            System.out.println("npr : " + nfact/rfact);}
        
         
        }
    }
