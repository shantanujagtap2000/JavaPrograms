package codingQue;

import java.util.Scanner;

public class Swapping {
	int a;
	int b;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Swapping s= new Swapping();
		s.a=sc.nextInt();
		s.b=sc.nextInt();
		int c= s.a;
		s.a=s.b;
		s.b=c;
		System.out.println("a="+s.a+" b="+s.b);
	}

}