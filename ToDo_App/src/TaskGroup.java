abstract public class TaskGroup {
    protected String category;
    public static int totalSubTasks = 0;

    public TaskGroup(String category) {
        this.category = category;
    }

    //why do I need this?
    protected TaskGroup() {
    }
}
