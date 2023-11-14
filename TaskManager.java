import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTaskName() + " (ID: " + task.getTaskId() + ")");
        }
    }
}
