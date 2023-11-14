class Employee extends Task {
    private String employeeName;

    public Employee(String name, String employeeName) {
        super(name);
        this.employeeName = employeeName;
    }

    @Override
    public void performTask() {
        System.out.println("Karyawan " + employeeName + " mengerjakan tugas: " + getTaskName())
    }
}
