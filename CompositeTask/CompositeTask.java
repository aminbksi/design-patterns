import java.util.List;
import java.util.ArrayList;

class CompositeTask extends ITask {
    private List<ITask> tasks;

    public CompositeTask(String name) {
        super(name);
        this.tasks = new ArrayList<>();
    }

    public void addSubtask(ITask task) {
        tasks.add(task);
    }

    @Override
    public void markComplete() {
        super.markComplete();
        for (ITask task : tasks) {
            task.markComplete();
        }
    }

    @Override
    public String getDetail() {
        String status = completed ? "Completed" : "Pending";
        StringBuilder details = new StringBuilder(String.format("Composite Task: %s, Status: %s%n\tSubtasks:", name, status));
        for (ITask task : tasks) {
            details.append(String.format("%n\t- %s", task.getDetail()));
        }
        return details.toString();
    }
}