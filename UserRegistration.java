import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	public boolean vallidateName(String s)
	{
		String regex1="^([A-Z][a-z]{3,30})$";
        Pattern p=Pattern.compile(regex1);
        return p.matcher(s).matches();
	}

	public boolean vallidatePhoneNo(String PhoneNo) {
		String regex1="^([0-9]{2}//s[0-9]{10})$";
		Pattern p=Pattern.compile(regex1);
		Matcher m1=p.matcher(PhoneNo);
		return m1.matches();
		
	}

	public boolean vallidatePassword(String passWord)
	{
		String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?=.{8,}).*$";
        Pattern p=Pattern.compile(regex);
        return p.matcher(passWord).matches();
	}
	public static boolean vallidateEmailId(String emailId)
	{
		 String regex="^[0-9a-zA-Z]+ *([.+-_]?[a-zA-Z0-9]+)"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z ]{2,4}([.][a-zA-Z]{2,3})?$";
	        Pattern p=Pattern.compile(regex);
	       return p.matcher(emailId).matches();
	}


}
