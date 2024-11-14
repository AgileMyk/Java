public class taskTester {
    public static void main(String[] args) {
        TaskGroup studies = new TaskGroup("school") {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}
