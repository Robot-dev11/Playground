import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    int base,exponent,power;
    Scanner scan = new Scanner(System.in);
    base  = scan.nextInt();
    exponent = scan.nextInt();
    if(exponent < 0){
      System.out.println("Wrong input");
    }
    else{
      power = (int) Math.pow(base,exponent);
      System.out.println(power);
    }
  }
}