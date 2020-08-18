package problem1065;

import java.util.Scanner;

public class Problem1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num<100) {
			System.out.println(num);
		}else {
			int result = 99;
			
			for(int i=100; i<=num; i++) {
				result += checkHanNumber(i);
			}
			if(num==1000) result--;
			
			System.out.println(result);
		}
	}
	
	private static int checkHanNumber(int number) {
		int num1 = number/100%10;
		int num2 = number/10%10;
		int num3 = number%10;
		
		if (num2 * 2 == num1 + num3) {
			return 1;
		}
		return 0;
	}
}
