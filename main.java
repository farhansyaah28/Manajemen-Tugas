import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk tugas proyek
        System.out.print("Masukkan nama tugas proyek: ");
        String projectTaskName = scanner.nextLine();
        System.out.print("Masukkan detail proyek: ");
        String projectDetails = scanner.nextLine();
        Project projTask = new Project(projectTaskName, projectDetails);

        // Input untuk karyawan
        System.out.print("Masukkan nama karyawan: ");
        String employeeName = scanner.nextLine();
        Employee empTask = new Employee("Tugas Karyawan", employeeName);

        // Input untuk tugas karyawan
        System.out.print("Masukkan tugas karyawan: ");
        String subTaskName = scanner.nextLine();
        SubTask subTask = new SubTask(subTaskName);

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(projTask);
        taskManager.addTask(empTask);
        taskManager.addTask(subTask);

        System.out.println("\nDaftar Tugas:");
        taskManager.displayTasks();

        TaskAssignment taskAssignment = new TaskAssignment();

        // // Input untuk menugaskan tugas karyawan
        // System.out.print("\nMasukkan nama karyawan yang akan ditugaskan tugas: ");
        // String assignedEmployeeName = scanner.nextLine();
        taskAssignment.assignTaskToEmployee(empTask, subTask);
    }
}
