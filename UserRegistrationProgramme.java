
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProgramme
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException 
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Shruti");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenProper_shouldReturnTrue() throws UserRegistrationException
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("Patil");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNo_WhenProper_shouldReturnTrue() throws UserRegistrationException
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePhoneNo("91 9130416631");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassWord_WhenProper_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePassword("Bhushan@1234");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenNotProper_shouldReturnFalse()
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result;
		try 
		{
			result = vallidator.vallidateName("shruti");
			Assert.assertFalse(result);
		} 
		catch (UserRegistrationException e)
		{
			System.out.println(e.getMessage());
		}

	}
	@Test
	public void givenLastName_WhenNotProper_shouldReturnFalse() throws UserRegistrationException
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidateName("patil");
		Assert.assertFalse(result);
	}
	@Test
	public void givenPhoneNo_WhenNotProper_shouldReturnFalse() throws UserRegistrationException
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePhoneNo("9130416631");
	}
	@Test
	public void givenPassWord_WhenNotProper_shouldReturnFalse() throws UserRegistrationException
	{
		UserRegistration vallidator=new UserRegistration();
		boolean result=vallidator.vallidatePassword("shruti123");
		Assert.assertEquals(false, result);
	}


}
