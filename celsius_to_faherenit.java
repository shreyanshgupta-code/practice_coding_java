import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("temprature in celsius: ");
        double celsius=scanner.nextDouble();
        double fahrenit=(celsius * 9/5) + 32;
        System.out.println("temprature in fahrenit:"+ fahrenit);
        scanner.close();
    }
}
