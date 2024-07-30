package taskscenario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import taskscenario.dao.TaskDao;
import taskscenario.dao.TaskDaoImplementation;
import taskscenario.model.Task;
import taskscenario.model.TaskStatus;

@Component
public class TaskServiceImplementation implements TaskService {

	@Autowired
	private TaskDao taskDao;
	
	
	
	@Override
	public TaskStatus add(Task task) {
		// TODO Auto-generated method stub
		TaskStatus taskStatus = taskDao.addTaskInDB(task);
		System.out.println("after returning from dao");
		return taskStatus;
	}



	public TaskServiceImplementation() {
		//taskDao =new TaskDaoImplementation();
		// TODO Auto-generated constructor stub
	}



	@Override
	public TaskStatus get(int taskid) {
		// TODO Auto-generated method stub
		return taskDao.getTaskFromDb(taskid);
	}



	@Override
	public TaskStatus updateTask(Task task) {
		// TODO Auto-generated method stub
		return taskDao.updateTaskInDb(task);
	}



	@Override
	public TaskStatus remove(int taskid) {
		// TODO Auto-generated method stub
		return taskDao.removeTaskFromDb(taskid);
	}



	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskDao.getAllTasksFromDb();
	}



	@Override
	public List<Task> getAllTasksonPriority(int priority) {
		// TODO Auto-generated method stub
		return taskDao.getAllTasksFromDbOnPriority(priority);

	}

}
