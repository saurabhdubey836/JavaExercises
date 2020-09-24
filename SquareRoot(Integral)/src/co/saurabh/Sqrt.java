package co.saurabh;

import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int left = 1,right=number;
        int mid = 0;
        while(left < right){
			mid = (left+right)/2;
            if((mid*mid)<number){
				left = mid+1;
            }else{
                right=mid-1;
            }
        }
        
       System.out.println(left-1);
       //System.out.println(Math.pow(left-1,2));
	}
}
