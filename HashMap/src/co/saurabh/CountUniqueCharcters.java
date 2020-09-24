package co.saurabh;

import java.util.HashMap;
import java.util.Scanner;

public class CountUniqueCharcters{
	public static int getUniqueCharacterCount(String str){
        if(str==null || str.length()==0){
            return -1;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String string = str.toLowerCase();
        char[] ch = string.toCharArray();
        
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.getOrDefault(c,0) + 1);
            }else{
                map.put(c,1);
            }
        }
        int count=0;
        for(char i:map.keySet()){
            if(map.get(i)==1){
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		//write code here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c = getUniqueCharacterCount(str);
		if(c==-1){
		    System.out.println("No unique character/s");
		}else{
		    if(c==0){
		    System.out.println("No unique character/s");
		    }else{
		        System.out.println(c +" unique character/s");
		    }
		}
		sc.close();
	 }
	
}
