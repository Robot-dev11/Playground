import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3,greatest;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3){
			greatest = num1;
			if(num2<greatest && num2>num3)
				System.out.println(num2);
			else
				System.out.println(num3);
		}
		
		else if(num2>num1 && num2>num3){
			greatest = num2;
			if(num1<greatest && num1>num3)
				System.out.println(num1);
			else
				System.out.println(num3);
		}
		
		else{
			greatest = num3;
			if(num2<greatest && num2>num1)
				System.out.println(num2);
			else
				System.out.println(num1);
		}
	}
}