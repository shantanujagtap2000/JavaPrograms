package codingQue;

import java.util.Scanner;

public class StringPali {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
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
