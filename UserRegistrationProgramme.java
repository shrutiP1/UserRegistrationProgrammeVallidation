import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;
@FunctionalInterface
interface vallidInput
{
	public boolean vallidate(String s);
}
public class UserRegistrationProgramme
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Narayan");
		Assert.assertTrue(result);
	}
	@Test
	public void givenFirstName_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("shruti");
		Assert.assertFalse(result);
	}
	@Test
	public void givenLastName_WhenProper_shouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Patil");
		Assert.assertTrue(result);
	}
	@Test
	public void givenLastName_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("patil");
		Assert.assertFalse(result);
	}
	@Test
	public void givenPhoneNo_WhenProper_shouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePhoneNo("91 9130416631");
		Assert.assertTrue(result);
	}
	@Test
	public void givenPhoneNo_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePhoneNo("9130416631");
	}
	@Test
	public void givenPassWord_WhenProper_ShouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePassword("Shruti@123");
		Assert.assertTrue(result);
	}
	@Test
	public void givenPassWord_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePassword("shruti123");
		Assert.assertEquals(false, result);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		vallidInput vallidate=n->{
			String regex1="^([A-Z][a-z]{3,30})$";
	        Pattern p=Pattern.compile(regex1);
	        boolean result= p.matcher(n).matches();
	        return result;
		} ;
		
		System.out.println("First name is vallid :  "+vallidate.vallidate("Shruti"));
		System.out.println("Last Name is vallid : "+vallidate.vallidate("Patil"));
		
		vallidInput vallidatePhoneNo=n->{
			String regex1="^([0-9]{2}\\s[0-9]{10})$";
			Pattern p=Pattern.compile(regex1);
			boolean result=p.matcher(n).matches();
			return result;
		};
		System.out.println("Phone no is vallid : "+vallidatePhoneNo.vallidate("91 9130416631"));
		
		vallidInput vallidatePassword=n->{
			String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?=.{8,}).*$";
	        Pattern p=Pattern.compile(regex);
	        return p.matcher(n).matches();
		};
		System.out.println("Password is vallid "+vallidatePassword.vallidate("Shruti@123"));
	    
		vallidInput vallidateEmailId=n->{
			String regex="^[0-9a-zA-Z]+ *([.+-_]?[a-zA-Z0-9]+)"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z ]{2,4}([.][a-zA-Z]{2,3})?$";
	        Pattern p=Pattern.compile(regex);
	       return p.matcher(n).matches();
		};
		System.out.println("Emailid is vallid : "+vallidateEmailId.vallidate("Shrutipatil@gmail.com"));
		
		
		
	}

}
