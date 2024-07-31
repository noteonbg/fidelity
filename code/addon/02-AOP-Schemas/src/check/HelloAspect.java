package check;




//aspect class..
public class HelloAspect {

	//this will have the logic that needs to be applied across functions.
	  public void freak()
	{
		System.out.println("security beginning before start of the function");
	}

	  public void aftersayHello() {
		    System.out.println("end security");
		  }
	  
	  public void junk() {
	    System.out.println("security removed");
	  }
}
