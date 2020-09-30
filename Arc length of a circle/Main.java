import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    float arc_length,radius,center_angle,pi = 3.14f;
    Scanner scan = new Scanner(System.in);
    radius = scan.nextFloat();
    center_angle = scan.nextFloat();
    arc_length = 2 * pi * radius * (center_angle/360);
    System.out.printf("%.2f",arc_length);
  }
}