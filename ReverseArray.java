package codingQue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> brr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			brr.add(arr[i]);
		}
		Collections.reverse(brr);
		System.out.println(brr);
		
		
		
		
		
		
	}

}
