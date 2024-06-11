package Students;

public interface Attendees {
    String SCHOOL_NAME = "Our University";
    int YEAR_ESTABLISHED = 1814;
    String MASCOT = "Tardigrades";
    abstract String Fact();

    abstract void cheer();

    abstract void schoolDepartment();


    abstract int letsCompare(Object o);
    default public void Sing() {
        System.out.println("la dee da dee da");
    }

    //default Student returnStudent(Student student) {
    //    return Student;
    //}
    public static String getSchoolName() {
        return SCHOOL_NAME;
    }
    public static String getMascot() {
        return MASCOT;
    }

}
