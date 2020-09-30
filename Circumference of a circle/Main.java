import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    float circum,radius,pi = 3.14f;
    Scanner scan = new Scanner(System.in);
    radius = scan.nextFloat();
    circum = 2 * pi * radius;
    System.out.printf("%.2f",circum);
  }
}