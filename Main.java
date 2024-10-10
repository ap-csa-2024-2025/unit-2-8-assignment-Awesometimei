import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    printRandom3(sc);
    calcSlope(sc);
    roundedDist(5.5, 4.1);
    roundedDist(4.1, 5.5);
  }

  public static void printRandom3(Scanner sc)
  {
    System.out.println("Type a positive integer: ");
    int n = sc.nextInt() + 1;
    System.out.println((int)(2+Math.random()*n));
    System.out.println((int)(2+Math.random()*n));
    System.out.println((int)(2+Math.random()*n));
  }

  public static void calcSlope(Scanner sc)
  {
    System.out.println("Enter the first x-coordinate: ");
    double x1 = sc.nextDouble();
    System.out.println("Enter the first y-coordinate: ");
    double y1 = sc.nextDouble();
    System.out.println("Enter the second x-coordinate: ");
    double x2 = sc.nextDouble();
    System.out.println("Enter the second y-coordinate: ");
    double y2 = sc.nextDouble();
    System.out.println("Slope: " + (y2-y1)/(x2-x1));
  }

  public static void roundedDist(double x1, double x2)
  {
    double dist = Math.abs(x1-x2);
    dist += 0.5;
    System.out.println("Rounded distance: " + (int)(dist));
  }
}