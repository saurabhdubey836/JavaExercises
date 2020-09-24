package co.saurabh;

public class CodeGenerator {
	public String generateCode(String str) {
		
		String s = str.toUpperCase();
		String s1 = s.substring(1);
		
		String s3 = "*"+s1.substring(2,s1.length()-1)+"#";
		
		return s3;
	}
}
