import java.util.Scanner;

public class Capitalize {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] sent = str.split(" ");
		
		for(int i=0;i<sent.length;i++) {
			String s = sent[i];
			String j = s.substring(0,1).toUpperCase();
			String k = s.substring(1,s.length()).toLowerCase();
			String result = j+k;
			System.out.print(result+" ");
		}
		sc.close();
				
	}
}
