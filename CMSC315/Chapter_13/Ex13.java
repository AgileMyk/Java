package Chapter_13;

/*
*13.13 (Enable the Course class cloneable) Rewrite the Course class in
Listing 10.6 to add a clone method to perform a deep copy on the
students field.
 */

public class Ex13 {

    public static void main(String[] args) {

        System.out.println(generateRandomName());
        System.out.println(generateRandomName());
        System.out.println(generateRandomName());

        Course course1 = new Course("first");

        Course course2 = new Course("second");
    }

    static public class Course implements Cloneable, Comparable<Course> {
        private final String courseName;
        private final String[] students = new String[100];
        private int numberOfStudents;

        public Course(String courseName) {
             this.courseName = courseName;
             }

         public void addStudent(String student) {
             students[numberOfStudents] = student;
             numberOfStudents++;
             }

        public String[] getStudents() {
             return students;
             }
        public int getNumberOfStudents() {
             return numberOfStudents;
             }

         public String getCourseName() {
             return courseName;
             }

         public void dropStudent(String student) {
                for (String currentStudent : students) {
                    if (currentStudent.equals(student)) {
                        student = null;
                        break;
                    }
                    break;
                }
             }

         @Override
         public Object clone() throws CloneNotSupportedException {
            Course clone = new Course(this.courseName);
            for (String s :this.getStudents()) {
                clone.addStudent(s);
            }
            return clone;
         }

         @Override
         public int compareTo(Course course) {
                return 0;
             }
        }

        public static String generateRandomName() {
            int randomLength = (int) (Math.random() * 5) + 4;
            char[] aName = new char[randomLength];
            for (int i = 0; i < aName.length; i++) {
                aName[i] = (char) (Math.ceil((Math.random() * 26) + 96));
            }
            for (int i = 0; i < aName.length; i++) {
                char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};
                if (aName[0] != 'A' || aName[0] != 'E' || aName[0] != 'I' || aName[0] != 'O' || aName[0] != 'U') {
                    aName[1] = vowelsArray[(int) (Math.random() * vowelsArray.length)];
                }
            }
            aName[0] = Character.toUpperCase(aName[0]);
            return new String(aName);
        }
}
