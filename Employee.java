class Employee extends Task {
    private String employeeName;

    public Employee(String name, String employeeName) {
        super(name);
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void performTask() {
        System.out.println("Karyawan " + employeeName + " mengerjakan tugas: " + getTaskName());
    }
}
