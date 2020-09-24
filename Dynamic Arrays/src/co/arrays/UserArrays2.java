package co.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserArrays2 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		Scanner sc = new Scanner(System.in);
		String str = new String();
		
		while(sc.hasNext()) {
			str = sc.next();
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
