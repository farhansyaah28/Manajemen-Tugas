import java.util.ArrayList;

class TaskAssignment {
    private ArrayList<Task> assignedTasks;

    public TaskAssignment() {
        assignedTasks = new ArrayList<>();
    }

    public void assignTaskToEmployee(Employee employee, Task task) {
        System.out.println("Tugas " + task.getTaskName() + " ditugaskan kepada " + employee.getEmployeeName());
        assignedTasks.add(task);
    }
}
