import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        char addMoreTasks;

        do {
           System.out.print("Enter task name: ");
            String taskName = scanner.nextLine();
            System.out.print("Enter task ID: ");
            int taskId = scanner.nextInt();

            scanner.nextLine(); // Clearing newline

            System.out.print("Choose task type (Employee/Project/SubTask): ");
            String taskType = scanner.nextLine();

            switch (taskType.toLowerCase()) {
                case "employee":
                    System.out.print("Enter employee name: ");
                    String employeeName = scanner.nextLine();
                    Employee empTask = new Employee(taskName, taskId, employeeName);
                    taskManager.addTask(empTask);
                    break;
                case "project":
                    System.out.print("Enter project details: ");
                    String projectDetails = scanner.nextLine();
                    Project projTask = new Project(taskName, taskId, projectDetails);
                    taskManager.addTask(projTask);
                    break;
                case "subtask":
                    SubTask subTask = new SubTask(taskName, taskId);
                    taskManager.addTask(subTask);
                    break;
                default:
                    System.out.println("Invalid task type.");
                    break;
            }


            System.out.print("Add another task? (y/n): ");
            addMoreTasks = scanner.next().charAt(0);
            scanner.nextLine(); // Clearing newline

        } while (addMoreTasks == 'y');

        System.out.println("Task List:");
        taskManager.displayTasks();

        TaskAssignMultiple taskAssignMultiple = new TaskAssignMultiple();
        if (!taskManager.getTasks().isEmpty()) {
    Employee lastEmployee = null;
    List<SubTask> subTasks = new ArrayList<>();

    for (Task task : taskManager.getTasks()) {
        if (task instanceof Employee) {
            lastEmployee = (Employee) task;
        } else if (task instanceof SubTask) {
            subTasks.add((SubTask) task);
        }
    }

     if (lastEmployee != null) {
        taskManager.getTasks().get(taskManager.getTasks().size() - 1).setAssignee(lastEmployee.getEmployeeName());
    } else {
        if (lastEmployee == null) {
            System.out.println("No employee available to assign multiple tasks.");
        }
        if (subTasks.isEmpty()) {
            System.out.println("No sub-tasks available to assign to an employee.");
        }
    }
} else {
    System.out.println("No tasks to assign.");
}

        scanner.close();
    }
}
