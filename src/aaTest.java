import mengka.A.Student;
import junit.framework.Assert;
import junit.framework.TestCase;


public class aaTest extends TestCase {

	
	public void aaTest(){
		Student aa=new Student();
		aa.setName("ddd");
		aa.setAge(18);
		Assert.assertEquals("ddd,18",aa.toString());
		
		System.out.println(aa.toString());
	}
}
