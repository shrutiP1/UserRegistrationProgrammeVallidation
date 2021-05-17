import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProgramme
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Narayan");
		Assert.assertTrue(result);
	}
	
	public void givenFirstName_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("shruti");
		Assert.assertFalse(result);
	}
	public void givenLastName_WhenProper_shouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Patil");
		Assert.assertTrue(result);
	}
	public void givenLastName_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Patil");
		Assert.assertFalse(result);
	}
	public void givenPhoneNo_WhenProper_shouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePhoneNo("9130416631");
		Assert.assertTrue(result);
	}
	public void givenPassWord_WhenProper_ShouldReturnTrue()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePassword("Shruti@123");
		Assert.assertTrue(result);
	}
	public void givenPassWord_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePassword("shruti123");
		Assert.assertEquals(false, result);
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		
	}

}
