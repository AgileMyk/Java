/*
Michael Hall
Programming Project 2
6-08-24
undergraduate class
extends Student class - contains fields name/creditHours/qualityPoints/dateCreated/studentTotal/
getters, gpaThreshhold, rankStudentList, eligibleForHonorSociety
 */

package Students;

import java.util.Date;
import java.util.Scanner;
public class Undergraduate extends Student {
    private String name;
    private int creditHours;
    private int qualityPoints;
    private Date dateCreated;
    private String year;
    public static int undergraduateTotal = 0;


    public Undergraduate(String name, int creditHours, int qualityPoints, String year) {
        super(name, creditHours, qualityPoints);
        this.year = year;
        double GPA = getGPA();
        dateCreated = new Date();
        incStudentCount();
        undergraduateTotal++;
    }
    @Override
    protected boolean eligibleForHonorSociety() {
        if (getGPA() > setGPAthreshold() && getYear().toLowerCase().equals("junior") || getYear().toLowerCase().equals("senior")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + getName());
        System.out.println("qPoints: " + qualityPoints);
        System.out.println("cHours: " + creditHours);
        System.out.println("GPA: " + getGPA());
        System.out.println(Student.setGPAthreshold());
        return "Year: " + getYear();
    }


public static int getUndergraduateTotal() {
    return undergraduateTotal;
}
protected String getYear() {
        return year;
}
    @Override
    public String getCurrentDegreePursued() {
        return "Undergraduates do not have a degree pursued but a year: " + this.getYear();
    }

}
