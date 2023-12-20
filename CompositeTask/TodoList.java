import java.util.List;
import java.util.ArrayList;


class TodoList {
    private List<ITask> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(ITask task) {
        tasks.add(task);
    }

    public void displayTasks() {
        for (ITask task : tasks) {
            task.display();
        }
    }
}