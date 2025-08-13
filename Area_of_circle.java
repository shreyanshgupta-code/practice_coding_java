import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("radius: ");
        double radius=scanner.nextDouble();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("area:"+ area);
        scanner.close();
    }
}