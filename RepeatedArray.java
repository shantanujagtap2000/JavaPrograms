package codingQue;


import java.util.HashSet;
import java.util.Scanner;

public class RepeatedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashSet<Integer> brr=new HashSet<>();
		for(int i=0;i<n;i++) {
			brr.add(arr[i]);
		}
		System.out.println(brr);
	}

}
