package codingQue;

import java.util.Scanner;

public class IntegerPallindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		String a=Integer.toString(b);
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		String c=sb.toString();
		if(a.equals(c)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
		
	}

}
