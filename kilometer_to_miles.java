import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kilometer: ");
        double kilometer=scanner.nextDouble();
        double miles=kilometer*0.621371;
        System.out.print("miles: "+ miles);
        scanner.close();
    }
}
