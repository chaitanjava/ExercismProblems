import java.util.Scanner;

class ReverseString {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give a Word");
    String inputString = sc.nextLine();

    String reversed = new StringBuffer(inputString).reverse().toString();



}
}
