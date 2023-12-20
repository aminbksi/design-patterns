abstract class ITask {
    protected String name;
    protected boolean completed;

    public ITask(String name) {
        this.name = name;
        this.completed = false;
    }

    public void markComplete() {
        this.completed = true;
    }

    public void display() {
        System.out.println(getDetail());
    }

    public abstract String getDetail();
}