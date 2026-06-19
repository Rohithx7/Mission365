
import java.util.Scanner;

public class SwitchLoop {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String item = sc.next();
        String name = sc.next();
        switch (item.toLowerCase()) {
            case "fruit" -> {
                switch (name.toLowerCase()) {
                                case "apple" -> System.out.println("Red Fruit");
                                case "grapes" -> System.out.println("Black Fruit");
                                default -> System.out.println("Not Defined yet");
            }
            }
            case "vegetable" ->{
                switch (name.toLowerCase()){
                case "brinjal" -> System.out.println("Violet Vegetable");
                case "tomato" -> System.out.println("Red Vegetable");
                default -> System.out.println("Not Defined Yet");
            }
            }

            default -> System.out.println("May be not fruit/vegetable");
        }



    }
}
