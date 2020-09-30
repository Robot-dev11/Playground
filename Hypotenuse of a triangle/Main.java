import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		float s1,s2,hypotenuse;
		s1 = Scan.nextFloat();
		s2 = Scan.nextFloat();

		hypotenuse = (float) Math.sqrt(Math.pow(s1,2) + Math.pow(s2,2));
		System.out.printf("%.2f",hypotenuse);
	}
}