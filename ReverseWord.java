package codingQue;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		System.out.println(sb);
		


	}

}
