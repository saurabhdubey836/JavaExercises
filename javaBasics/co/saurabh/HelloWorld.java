package co.saurabh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(new File("D:\\java codes(Practise)\file1.csv"));
			try {
				while(true) {
					String text = sc.nextLine();
					Scanner in = new Scanner(text);
					sc.useDelimiter(",");
					while(in.hasNext()){
						System.out.println("sc.next()");
					}
				}
			}catch(NoSuchElementException e){
			
			}

		}
	}

