import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("radius: ");
        double radius=scanner.nextDouble();
        System.out.print("h: ");
        double h=scanner.nextDouble();
        double pi=3.14;
        double volume=pi*radius*radius*h;
        System.out.println("volume:"+ volume);
        scanner.close();
    }
}