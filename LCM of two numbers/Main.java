import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	int gcd = 0;
	for(int i = 1; i <= num1 && i <= num2; i++){
		if(num1 % i == 0 && num2 % i == 0){
			gcd = i;
		}
	}
    int lcm = (num1 * num2)/gcd;
    System.out.println(lcm);
  }
}