class Task extends ITask {
    public Task(String name) {
        super(name);
    }

    @Override
    public String getDetail() {
        String status = completed ? "Completed" : "Pending";
        return String.format("Task: %s, Status: %s", name, status);
    }
}