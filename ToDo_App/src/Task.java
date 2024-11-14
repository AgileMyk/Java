public class Task extends TaskGroup {
    protected String name;
    protected int priority;
    protected String type;
    String color;
    int totalSessions;
    int sessionLength;
    int sessionsComplete = 0;


    //constructors
    public Task(String name, int priority, String type, String color, int totalSessions, int sessionLength) {
        this.name = name;
        this.priority = priority;
        this.type = type;
        this.color = color;
        //category = super.category;
        this.totalSessions = totalSessions;
        this.sessionLength = sessionLength;
        totalSubTasks++; //is this done correctly?
    }

    public Task(String name) {
        this.name = name;
        priority = 0;
        type = "type?";
        color = "color?";
        //category = super.category;
        totalSessions = 0;
        sessionLength = 0;
        sessionsComplete = 0;
        totalSubTasks++; //is this done correctly?

    }

    public Task(String name, int category, String color) {
        this.name = name;
        this.priority = 0;
        this.color = color;
        totalSubTasks++; //is this done correctly?

    }

    //setters


    //getters
    public double progressDisplay() {
        return (double) sessionLength / totalSessions;
    }
}
