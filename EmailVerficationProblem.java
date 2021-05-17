import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailVerficationProblem
{
	private String emailTotest;
	private boolean expectedResult;
	
	public EmailVerficationProblem(String emailTotest,boolean expectedResult)
	{
		this.emailTotest=emailTotest;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static Collection getInput()
	{
		return Arrays.asList(new Object[][] {
			{ "abc@yahoo.com",true},
			{ "abc-100@yahoo.com",true},
			 {"abc.100@yahoo.com",true},
			 {"abc111@abc.com",true},
			 {"abc-100@abc.net",true},
			 {"abc.100@abc.com.au",true},
			 {"abc@1.com",true},
			 {"abc@gmail.com.com",true},
			 {"abc+100@gmail.com",true},
			 {"abc",false},
			 {"abc@.com.my",false},
			 {"abc123@gmail.a",false},
			 {"abc123@.com",false},
			 {"abc123@.com.com",false},
			 {"abc()*@gmail.com",false},
			 {".abc@abc.com",false},
			 {"abc()*@gmail.com",false},
			 {"abc@%*.com",false},
			 {"abc.@gmail.com",false},
			 {"abc@gmail.com.1a",false},
			 {"abc@gmail.com.aa.au",false},
			 {"abc....2002@gmail.com",false}
			
		});
	}
	@Test
	public  void  getEmailIdAsVar_shouldReturnAsPerParamterizedValue()
	{
		System.out.println("expected result is "+expectedResult);
		Assert.assertEquals(expectedResult, UserRegistration.vallidateEmailId(emailTotest));
	}

}
