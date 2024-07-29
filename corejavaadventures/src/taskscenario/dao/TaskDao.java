package taskscenario.dao;

import java.util.List;

import taskscenario.model.Task;
import taskscenario.model.TaskStatus;

public interface TaskDao {

	TaskStatus addTaskInDB(Task task);

	TaskStatus getTaskFromDb(int taskid);

	TaskStatus updateTaskInDb(Task task);

	TaskStatus removeTaskFromDb(int taskid);

	List<Task> getAllTasksFromDb();

	List<Task> getAllTasksFromDbOnPriority(int priority);

}
