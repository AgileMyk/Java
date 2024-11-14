public class Class {
    private String name;
    private final String[] students = new String[100];
    private int numStudents;

    public void course(String name) {
        this.name = name;
    }

    public void addStudent(String name) {
        students[numStudents] = name;
        numStudents++;
    }

    public void dropStudentNonReplace(String name) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].equals(name)) {
                students[i] = students[i+1];
                for (int j = i+1; j < numStudents; j++) {
                    students[j] = students[j+1];
                }
            }
        }
    }

    public void dropStudentReplace(String name) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].equals(name)) {
                students[i] = "";
            }
        }
    }


    public String[] getStudents() {
        return students;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getCoursName() {
        return name;
    }

}
