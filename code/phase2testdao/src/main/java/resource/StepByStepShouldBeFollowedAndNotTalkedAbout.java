package resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import resource.dao.ResourceDAOInterface;
import resource.model.Resource;

@SpringBootApplication
public class StepByStepShouldBeFollowedAndNotTalkedAbout  implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SpringApplication.run(StepByStepShouldBeFollowedAndNotTalkedAbout.class, args);
		

	}
	
	@Autowired
	private ResourceDAOInterface resourceDaoInterface;
	

	@Override
	public void run(String... args) throws Exception {
		// this gives you an idea what service function call means
		//for presentation.
		
		boolean status =true;
		List<Resource> x = resourceDaoInterface.findByAvaialability(status);
		if(x.size() > 0)
				System.out.println("show each resource" +x.size());
		else
			System.out.println("not found");
		
		
		//single select
		
		/*
		int resourceId=20;
		Optional<Resource> x = resourceDaoInterface.findById(resourceId);
		if(x.isPresent())
		{
			Resource r = x.get();
			System.out.println(r.getResourceName());
		}
		else
		{
			System.out.println("resource not found");
		}
		*/
		
		/*
		Resource r =new Resource(11,"X",true);
	
		try {
			boolean x = resourceDaoInterface.existsById(r.getResourceId());
			if(!x)
				resourceDaoInterface.save(r);
			System.out.println("Added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("could not add");
		}
		
		*/
		
		
		// adding logic
		/*
		System.out.println(resourceDaoInterface.getClass().getName());
		
		Resource r =new Resource(11,"Y",false);
		boolean x = resourceDaoInterface.existsById(r.getResourceId());
		if(x)
			resourceDaoInterface.save(r);
		else
			System.out.println("resource is already present");
			
			
			*/
		
		/*
		int resourceid =44;
		Optional<Resource> x = resourceDaoInterface.findById(resourceid);
		if(x.isEmpty())
			System.out.println("resource Id not found");
		else
		{
				Resource r = x.get();
				System.out.println(r);
			
		}
		*/
		}
		
		
		
			
		
		
		
		
		
	}


