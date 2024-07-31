package uncertainty.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	
	/*
	 * 
	 *   @Autowired
    @Qualifier("employeeDaoJdbcImpl")

	 * 
	 */
	
	private B ijk;
		
	public A()
	{
		System.out.println("A object created");
	}
	
	@Autowired
	public void whocares(B pqr)
	{
		System.out.println("B put inside some fucntion of A");
		ijk =pqr;
		
	}
	
	public void f1()
	{
		System.out.println("this is f1 function in A");
		ijk.fb();
		
		
	}
	

}
