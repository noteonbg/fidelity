package taskscenario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import taskscenario.controller.TaskPresentation;
import taskscenario.dao.TaskDao;
import taskscenario.model.Task;
import taskscenario.model.TaskStatus;

@SpringBootApplication
public class TestTask implements CommandLineRunner{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(TestTask.class, args);
		System.out.println(1);
		
		/*
		
		TaskPresentation taskPresentation =new TaskPresentation();
		taskPresentation.start();
		
		*/
		

	}
	
	@Autowired
	String s;
	//TaskDao taskdao;
	//TaskPresentation taskPresentation;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//taskPresentation.start();
		s.toUpperCase();
		
		Task t =new Task(11,"A",3);
		TaskStatus x = taskdao.addTaskInDB(t);
		System.out.println(x.getStatusMessage());
		
		
		
		
		
	}

}
