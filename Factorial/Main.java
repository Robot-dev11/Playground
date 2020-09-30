import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan = new Scanner(System.in);
    long i,num;
    long fact = 1;
    num = scan.nextInt();
    for(i = 1; i<=num ; i++){
      fact = fact * i;
    }
    System.out.println(fact);
  }
    
}