import java.util.*;

public class Twofer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        if(name.isEmpty()) {
            System.out.println("One for you, one for me.");
        }
        else {
            System.out.println("One for " + name + ", one for me.");
        }



    }
}
