import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("principal: ");
    double p=scanner.nextDouble();
    System.out.print("Rate: ");
    double r=scanner.nextDouble();
    System.out.print("Time: "); 
    double t=scanner.nextDouble();
    double si=(p*r*t)/100;
    System.out.print("Simple Interest: "+ si);
    scanner.close();
    }  
}
