import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();
    if(year % 4 == 0 && year % 400 == 0)
      System.out.println("LEAP YEAR");
    else
      System.out.println("NOT LEAP YEAR");
  }
}