package codingQue;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=a;
		double sum=0;
		while(a>0) {
			int b=a%10;
			sum=sum+Math.pow(b,3);
			a=a/10;
		}
		
		int b=(int)sum;
		System.out.println(b);
		if(b==c) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
	}

}
