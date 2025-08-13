import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("length: ");
    double l=scanner.nextDouble();
    System.out.print("breadth: ");
    double b=scanner.nextDouble();
    double perimeter=2*(l+b);
    System.out.print("perimeter: "+ perimeter);
    scanner.close();
    }  
}
