/*
Michael Hall
Programming Project 2
6-08-24
undergraduate class
extends Student class - contains fields name/creditHours/qualityPoints/dateCreated/studentTotal/
getters, gpaThreshhold, rankStudentList, eligibleForHonorSociety
 */

package Students;

import java.util.Scanner;
public class Undergraduate extends Student {
    private String year;
    private static int undergraduateTotal = 0;


    protected Undergraduate(String name, int creditHours, int qualityPoints, String year) {
        super(name, creditHours, qualityPoints);
        this.year = year;
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

    @Override
    public boolean equals() {
        return false;
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
