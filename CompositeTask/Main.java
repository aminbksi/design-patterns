public class Main {
    public static void main(String[] args) {
        // Example usage
        TodoList todoList = new TodoList();

        Task individualTask = new Task("Individual Task 1");
        CompositeTask compositeTask = new CompositeTask("Composite Task 1");

        Task subtask1 = new Task("Subtask 1");
        Task subtask2 = new Task("Subtask 2");

        compositeTask.addSubtask(subtask1);
        compositeTask.addSubtask(subtask2);

        todoList.addTask(individualTask);
        todoList.addTask(compositeTask);

        // Display tasks
        todoList.displayTasks();
    }
}