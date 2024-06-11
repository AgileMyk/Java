/*
Finally there should be a fourth class Project2 that contains the main method. It should read in
student information from a text file named students.txt. If the file does not exist, an error
message should be displayed and the program should terminate. Each line of the text file will
represent the information for one student. An example of how the text file will look is shown
below:
Brown,William 72 230 Junior
Johnson,Mary 21 77 Masters
Jones,Sally 32 95 Sophomore
For undergraduate students, the final value is the student’s year. For graduate students, the final
value is the degree the student is seeking. As the students are read in, Student objects of the
appropriate type should be created and they should be stored in an array list of type Student. As
the students are read in, the total of all grade point averages should be accumulated so that an
average gpa can be computed. You may assume that the file that the data in the file will be
formatted correctly.
Once all the student data is read in, the threshold for honor society membership should then be
set to the midpoint of the average gpa and the highest possible gpa of 4.0 by calling the
setGpaThreshold method. The threshold should also be displayed on the console. Then a report
should be displayed on the console that lists all students who are eligible for membership .
 */
package Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> Students  = new ArrayList<>();
        File studentFile = new File("C:\\Users\\g\\Hyperskill\\CMSC_215\\Students\\students.txt");

        Scanner in = new Scanner(studentFile);
        while (in.hasNextLine()) {
        //split full line string to check conditions for undergrad vs. grad
            String[] result = in.nextLine().split(" ");

        //As the students are read in, Student objects of the
        //appropriate type should be created, and they should be stored in an array list of type Student.

            if (result[4].toLowerCase().equals("masters") || result[4].toLowerCase().equals("doctorate")) {
                Students.add(new Graduate(result[0] + " " + result[1], Integer.parseInt(result[2]), Integer.parseInt(result[3]), result[4]));
            } else {
                Students.add(new Undergraduate(result[0] + " " + result[1], Integer.parseInt(result[2]), Integer.parseInt(result[3]), result[4]));
            }
        }

        for (Student s : Students) {
            System.out.println(s.toString());
        }

        System.out.println(Student.getStudentTotal());
        System.out.println(Student.setGPAthreshold());

/*

        try {

        } catch (FileNotFoundException ffe) {
            ffe.getMessage();
            ffe.getCause();
            System.exit(0);
        }
 */


    }
}
