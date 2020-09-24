package co.saurabh;

import java.util.*;

class Sequences{
	@SuppressWarnings("finally")
	public static int sequence(String str) {
		String s[] = str.split(",");
		int arr[] = new int[s.length];
		try {
			for(int i=0;i<s.length;i++) {
				arr[i] = Integer.parseInt(s[i]);
				//System.out.println(arr[i]);
			}
			int n[] = new int[arr.length];
			int m = arr.length;
			int j=1;
			while(j<m) {
				for(int i=0;i<arr.length;i++) {
					arr[i] = arr[i+1]-arr[i];
					n[i]=arr[i];
				}
				n = new int[n.length-1];
				System.out.println(n.toString());
				j++;
			}
		}catch(Exception e) {
			throw e;
		}
		finally {
			return arr[0];	
		}
		
	}
}
public class Source {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		try {
			str = sc.next();
			int result = Sequences.sequence(str);
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(NumberFormatException e) {
			
		}
	}
}
