package taskscenario.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import taskscenario.model.Task;
import taskscenario.model.TaskStatus;

@Component
public class TaskDaoImplementation implements TaskDao {
	
	private Map<Integer, Task> tasks ;
	
	public TaskDaoImplementation() {
		tasks =new HashMap<>();
		Task task =new Task(1,"A",3);
		tasks.put(task.getTaskId(), task);
		task =new Task(2,"B",4);
		tasks.put(task.getTaskId(), task);
		
		
	 // TODO Auto-generated constructor stub
	}

	@Override
	public TaskStatus addTaskInDB(Task task) {
		// TODO Auto-generated method stub
		TaskStatus taskStatus =new TaskStatus(0, "not added",
				new Task(1,"X",3));
		Task taskInMap = tasks.get(task.getTaskId());
		if( taskInMap == null)
		{
					tasks.put(task.getTaskId(), task);
					taskStatus.setStatusCode(1);
					taskStatus.setStatusMessage("added successfully");
					taskStatus.setTask(task); //subjective... 
			
		}
			   
		
		
		return taskStatus;
	}

	@Override
	public TaskStatus getTaskFromDb(int taskid) {
		// TODO Auto-generated method stub
		TaskStatus taskStatus =new TaskStatus(0, "not found",
				new Task());
		Task taskInMap = tasks.get(taskid);
		if( taskInMap != null)
		{
					
					taskStatus.setStatusCode(1);
					taskStatus.setStatusMessage("got successfully");
					taskStatus.setTask(taskInMap); //subjective... 
			
		}
		
		return taskStatus;
	}

	@Override
	public TaskStatus updateTaskInDb(Task task) {
		// TODO Auto-generated method stub
		TaskStatus taskStatus =new TaskStatus(0, "not not updated",
				new Task(1,"X",3));
		
		Task taskInMap = tasks.get(task.getTaskId());
		if( taskInMap != null)
		{
					
					taskInMap.setTaskName(task.getTaskName());
					taskInMap.setPriority(task.getPriority());
					taskStatus.setStatusCode(1);
					taskStatus.setStatusMessage("updated successfully");
					taskStatus.setTask(taskInMap); //subjective... 
			
		}
		return taskStatus;
	}

	@Override
	public TaskStatus removeTaskFromDb(int taskid) {
		// TODO Auto-generated method stub
		TaskStatus taskStatus =new TaskStatus(1, "not added",
				new Task(1,"X",3));
		
		return taskStatus;
	}

	@Override
	public List<Task> getAllTasksFromDb() {
		// TODO Auto-generated method stub
		List<Task> tasks =new ArrayList<>();
		return tasks;
	}

	@Override
	public List<Task> getAllTasksFromDbOnPriority(int priority) {
		// TODO Auto-generated method stub
		List<Task> tasks =new ArrayList<>();
		return tasks;
	}
	}


