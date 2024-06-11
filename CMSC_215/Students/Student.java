/*
Michael Hall
Programming Project 2
6-08-24
Abstract Student class - contains fields name/creditHours/qualityPoints/dateCreated/studentCount
getters, gpaThreshhold, rankStudentList, eligibleForHonorSociety
 */
package Students;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

abstract public class Student implements Comparable<Student> {
    /*
Student class. It has three instance variables which include the student name, credit
hours earned and quality points.
 */
    protected String name;
    protected int creditHours;
    protected int qualityPoints;
    protected Date dateCreated;

    protected static Scanner in = new Scanner(System.in);

    private static int studentCount = 0;

    private double GPA;

    private static int totalAccumulatedGPAPoints = 0;

    private static ArrayList<Student> allStudents = new ArrayList<>();
    /*
    At a minimum, it should have:
        -constructor that allows the student’s name, credit hours and quality points to be
        initialized
        -A method named gpa that returns the student’s grade point average, which is computed
        as the quotient of the quality points and credit hours
        -A method eligibleForHonorSociety that returns whether a student’s gpa exceeds the
        threshold for honor society membership, which applies to all students
        -A toString method that returns a string containing the student name and grade point
        average
        -A class (static) method setGpaThreshold that sets the minimum gpa threshold for honor
        society membership
     */


    protected Student(String name, int creditHours, int qualityPoints) {
        this.name = name;
        this.creditHours = creditHours;
        this.qualityPoints = qualityPoints;
        studentCount++;
        allStudents.add(this);
        this.GPA = calcGPA(creditHours, qualityPoints);
    };
    protected double gpa() {
        return qualityPoints/creditHours;
    }
    protected abstract boolean eligibleForHonorSociety(Student s);
    public abstract String toString();

    //takes an array of all the student instances, allowing a static method to access non-static instance variables
    //perform a calculation whose results are then accessible in a static context

    //As the students are read in, the total of all grade point averages should be accumulated so that an
    //average gpa can be computed. setGPA accesses static values that change with each student instantiation,
    //creating an accessible dynamic GPA thresh hold value
    protected static double setGPAthreshold() {
        double total = 0;
        for (Student current: allStudents) {
            total += current.getGPA();
        }
        //Once all the student data is read in, the threshold for honor society membership should then be
        //set to the midpoint of the average gpa and the highest possible gpa of 4.0 by calling the
        //setGpaThreshold method. The thresh hold is not set by the method, it is only reported
        //The threshold dynamically changes via static values with each new student added to the Student class hierarchy
        // ---------------------I CHANGED THE THRESH HOLD FROM MIDPOINT TO TOP 85%--------------------------

        //The threshold should also be displayed on the console

        return (total / studentCount) * .85;
    }
    /*
                                        -------------------------------
                    getters necessary to perform static calculation on instance variables
                  gpaThreshold used as check in combination with abstract class differences
                               to determine eligibility for honor society
     */
    protected String getName() { return name;}
    protected int getCreditHours() {
        return creditHours;
    }
    protected int getQualityPoints() {
        return qualityPoints;
    }
    public static boolean gpaThreshhold(Student student) {
        return student.qualityPoints/student.creditHours >= setGPAthreshold() ? true : false;
    };
    protected Date getDateCreated() {
        return dateCreated;
    }
    public void rankStudentList(Student[] arr) {
        //create list for labeling student rankings
        String[] rankings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rankings[i] = "rank " + i;
        }
        for (int i = 0; i < arr.length; i++) {

        }
    }

    public abstract boolean equals();

    public static int getStudentTotal() {
        return studentCount;
    }

    //compareTo method with sub-methods calculating compareTo results

    public abstract int compareTo(Student o);

    //validation methods


    private double calcGPA(int cHour, int qPoints) {
        double result = ((double) qPoints / cHour);
        result *= 100;
        result = Math.round(result);
        result /= 100;
        return result;
    }
    public double getGPA() {
        return GPA;
    }
}

