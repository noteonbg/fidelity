package taskscenario.service;

import java.util.List;

import taskscenario.model.Task;
import taskscenario.model.TaskStatus;

public interface TaskService {

	
	//https://shorturl.at/kyz37
	TaskStatus add(Task task);//done

	TaskStatus get(int taskid); //done

	TaskStatus updateTask(Task task);

	//try the below operations and prove you understood the code...
	
	TaskStatus remove(int taskid);//try

	List<Task> getAllTasks(); //try 

	List<Task> getAllTasksonPriority(int priority);//try

}
