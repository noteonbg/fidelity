package basic.securityexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	
	@GetMapping("/withsecurity")
	public String f1()
	{
		return "with security";
	}
	
	@GetMapping("/withoutsecurity")
	public String f2()
	{
		
		return "withoutsecurity";
		
	}
	}


