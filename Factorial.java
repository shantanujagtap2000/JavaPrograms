package codingQue;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] arsg) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=1;
		for(int i=1;i<a+1;i++) {
			sum=sum*i;	
		}
		System.out.println(sum);
	}

}
