package codingQue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RepatativeChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<a.length();i++) {
			char d=a.charAt(i);
			String b=String.valueOf(d);
			for(int j=i+1;j<a.length()-1;j++) {
				char e=a.charAt(j);
				String c=String.valueOf(e);
				if(b.equals(c)) {
					arr.add(b);
					
				}
			
				
			}
		}
		HashSet<String> crr=new HashSet<>();
		for(int i=0;i<arr.size();i++) {
			crr.add(arr.get(i));
		}
		System.out.println(crr);
	
	}

}
