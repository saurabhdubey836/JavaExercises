package co.ap;

import java.util.Scanner;

public class AP {
	public static void main(String[] args) {
		// Write your code here
		int num,i=1,j=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        while(j<num){
            int number=3*i+2;
            i++;
            if(number % 4==0){
                
            }else{
                System.out.print(number+" ");
                j++;
            }
        }
	}
}
