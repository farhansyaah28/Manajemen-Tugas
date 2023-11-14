abstract class Task {
    private String taskName;
    private int taskId;
    private static int lastTaskId = 0;

    public Task(String name) {
        this.taskName = name;
        this.taskId = ++lastTaskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskId() {
        return taskId;
    }
}
