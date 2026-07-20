public class IfTheory {
    public static void main(String[] args) {
        int distance = 3;
        int money = 150;

        if(distance>10){
            System.out.println("Area 51 is under radar ! ");
        }
        else{
            if(money>200){
                System.out.println("Area 52 is under budget");
            }
            else if (distance<5) { // this loop condition is not at all reachable, unless money fails. 
                //so logic is more important.
                System.out.println("Area 51 is very near !"); 
            }
        }
    }
}
