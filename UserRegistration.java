import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface valllidInterface
{
	public boolean vallidate(String pattern,String Input);
}
public class UserRegistration 
{
	static final String namePattern = "^[A-Z][a-z]{3,30}$";
	static final String emailPattern = "^[0-9a-zA-Z]+ *([.+-_]?[a-zA-Z0-9]+)"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z ]{2,4}([.][a-zA-Z]{2,3})?$";
	static final String phonePattern = "^[0-9]{2}\\s[0-9]{10}";
	static final String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?=.{8,}).*$";
	static valllidInterface vallidater=(pattern,input)-> Pattern.compile(pattern).matcher(input).matches(); 
	public boolean vallidateName(String name) throws UserRegistrationException
	{
		if(vallidater.vallidate(namePattern,name))
		{
			System.out.println(name+"is vallid Name");
			return true;
		}
		else
		{
			throw new UserRegistrationException(name+"is not vallid Name.Enter vallid Name");
		}
	}

	public boolean vallidatePhoneNo(String PhoneNo) throws UserRegistrationException 
	{
		if(vallidater.vallidate(phonePattern,PhoneNo))
		{
			System.out.println(PhoneNo+"is vallid Phone Number");
			return true;
		}
		else
		{
			throw new UserRegistrationException(PhoneNo+"is not vallid Phone Number.Enter vallid Phone Number");
		}

	}

	public boolean vallidatePassword(String passWord)throws UserRegistrationException 
	{
		if(vallidater.vallidate(passwordPattern,passWord))
		{
			System.out.println(passWord +"is vallid Password");
			return true;
		}
		else
		{
			throw new UserRegistrationException(passWord+"is not vallid password.Enter Vallid Password");
		}
	}
	public static boolean vallidateEmailId(String emailId)throws UserRegistrationException 
	{
		if(vallidater.vallidate(emailPattern,emailId))
		{
			System.out.println(emailId +"is vallid Email-id");
			return true;
		}
		else
		{
			throw new UserRegistrationException(emailId+"is not vallid Email-id.Enter Vallid Email-id");
		}

	}


}
