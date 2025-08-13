import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("base: ");
    double base=scanner.nextDouble();
    System.out.print("exponent: ");
    double exponent=scanner.nextDouble();
    double power=Math.pow(base,exponent);
    System.out.print("power: "+ power);
    scanner.close();
    }  
}