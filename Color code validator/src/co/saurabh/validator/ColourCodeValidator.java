package co.saurabh.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColourCodeValidator {
	public static int validateHexCode(String str){
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern p =Pattern.compile(regex);
        if(str==null){
            return -1;
        }
        Matcher m = p.matcher(str);
        boolean match = m.matches();
        if(match==true){
            return 1;
        }else{
            return -1;
        }
    }
    public static int validateDecimalCode(String str){
        if(str.startsWith("rgb")==false){
            return -1;
        }
        str = str.substring(4,str.length()-1);
        String s[] = str.split(",");
        if(s.length!=3){
            return -1;
        }
        try{
            int x = Integer.parseInt(s[0]);
            if(x<0||x>255){
                return -1;
            }
            int y = Integer.parseInt(s[0]);
            if(y<0||y>255){
                return -1;
            }
            int z = Integer.parseInt(s[0]);
            if(z<0||z>255){
                return -1;
            }
        }catch(Exception e){
            return -1;
        }
        return 1;
    }
}
