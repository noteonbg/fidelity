package taskscenario.controller;

import java.util.List;

import taskscenario.model.Task;
import taskscenario.model.TaskStatus;
import taskscenario.service.TaskService;
import taskscenario.service.TaskServiceImplementation;

public class TaskPresentation {
	
	private TaskService taskService;
	
	
	
	

	public TaskPresentation() {
		   taskService =new TaskServiceImplementation();
		   
		// TODO Auto-generated constructor stub
	}





	public void start() {
		// most difficult thing comes down below.. service function design.
		/*
		Task task =new Task(11,"A",3);
		TaskStatus taskStatus = taskService.add(task);
		if(taskStatus.getStatusCode() ==0 )
			System.out.println("failed in adding");
		else
			System.out.println("success in adding");
		*/
		
		
		int taskid =1;
		TaskStatus taskStatus = taskService.get(taskid);
		if(taskStatus.getStatusCode() ==0 )
			System.out.println("task id not found");
		else
			{
				StringBuilder sb =new StringBuilder();
				Task task = taskStatus.getTask();
				sb.append("TaskId").append(task.getTaskId()).append("task name ").
				append(task.getTaskName()).append("  ").append(" priority " ).append(task.getPriority());
				//enjoy style of coding.
				System.out.println(sb);
				
			
			
			}

		
		
		
		
		
		
		/*
		//update Task you have already done.
		
		
		 taskStatus = taskService.updateTask(task);
		 		
		
		taskStatus = taskService.remove(taskid);
		
		List<Task> tasks = taskService.getAllTasks();
		
		int priority=3;
		tasks = taskService.getAllTasksonPriority(priority);
		
		*/
		
		
		
		
	}

}
