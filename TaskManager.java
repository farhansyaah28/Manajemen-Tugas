import java.util.ArrayList;

class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTaskName() + " (ID: " + task.getTaskId() + ")");
        }
    }
}
