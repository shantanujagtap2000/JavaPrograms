package codingQue;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int count=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count=count+1;
			}
		}
		if(count>0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
