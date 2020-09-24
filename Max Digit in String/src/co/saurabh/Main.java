package co.saurabh;

import java.util.Scanner;

public class Main{
    // Code here
    public static int getMaxDigit(String str){
        int num=0,res=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num = num*10+(str.charAt(i)-'0');
            }else{
                res = Math.max(num,res);
                num = 0;//reset the number
            }
        }
        return Math.max(num,res);
    }
    public static void main(String[] args){
        //Code here
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int number = getMaxDigit(string);
        if(number!=0){
            System.out.println(number);
        }else{
             System.out.println("No digits in string");
        }
        sc.close();
    }
    
}