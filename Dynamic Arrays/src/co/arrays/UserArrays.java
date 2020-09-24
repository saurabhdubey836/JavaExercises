/*Demonstration for when to input the array without knowing the size*/

package co.arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class UserArrays {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(",");
		int N = str.length;
		System.out.println(N);
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.print(Arrays.toString(arr));
	}
}
