class Project extends Task {
    private String projectDetails;

    public Project(String name, String details) {
        this.projectDetails = details;
    }
    public String getProjectDetails() {
        return projectDetails;
    }
}
