package co.saurabh;

import java.util.Scanner;

public class Ex {
	public static String removeSpace(String str) {
		
		str = str.trim();
		char[] c = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			c[i] = str.charAt(i);
		}
		int i=0;
		while(i<c.length) {
			if(c[i]!=' '){
				i++;
			}
			else {
				
				if(c[i]=='/') {
					i++;
				}
				
				if((c[i-1]=='/')&&(c[i]==' ') && (c[i+1]==' ')) {
					c[i]= '/';
					i++;
				}
			}
		}
		System.out.println(new String(c));
		char result[] = new char[c.length];
		
		int j=0,i1=0;
		while(j<c.length) {
			if(c[j]!='/') {
				result[i1] = c[j];
				j++;
				i1++;
			}else {
				j++;
			}
		}
		return new String(result);
		//return str.replaceAll("\\s+"," ").trim();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String result = removeSpace(sentence);
		
		System.out.println(result);
	}

}
