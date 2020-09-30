import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan = new Scanner(System.in);
    int a,b,c;
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    float root1,root2;
    
    float determinant =  b * b - 4 * a * c;
    
    if(determinant > 0){
      root1 = (float) (-b + Math.sqrt(determinant)) / 2 * a;
      root2 = (float) (-b - Math.sqrt(determinant)) / 2 * a;
      System.out.printf("root1 = %.2f  root2 = %.2f",root1,root2);
    }
    
    else if(determinant == 0){
      root1 = root2 = (float) -b / 2 * a;
      System.out.printf("root1 = %.2f  root2 = %.2f",root1,root2);
    }
    
    else {
      float realPart = (float) -b / (2 *a);
      float imaginaryPart = (float) Math.sqrt(-determinant) / (2  * a);
      System.out.format("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
    }
  }
}