/*
Michael Hall
Programming Project 2
6-08-24
undergraduate class
extends Student class - contains fields name/creditHours/qualityPoints/dateCreated/studentTotal/
getters, gpaThreshhold, rankStudentList, eligibleForHonorSociety
 */

package Students;

import static Students.Student.gpaThreshhold;
import java.util.Scanner;
public class Undergraduate extends Student {
    private String year;
    private String[] years = {"freshmen","sophomore","junior","senior"};

    private static int undergraduateTotal = 0;


    protected Undergraduate(String name, int creditHours, int qualityPoints, String year) {
        super(name, creditHours, qualityPoints);
        this.year = year;
    }

    @Override
    protected boolean eligibleForHonorSociety(Student s) {
        return gpaThreshhold(s) == true ? this.year == "junior" || this.year == "senior" ? true : false : false;
    }

    @Override
    public String toString() {
        System.out.println("Name: " + getName());
        System.out.println("qPoints: " + qualityPoints);
        System.out.println("cHours: " + creditHours);
        System.out.println("GPA: " + getGPA());
        return "Year: " + year;
    }

    @Override
    public boolean equals() {
        return false;
    }
     public int compareTo(Student s) {
        int result = 1;
        if (result == 0) return 0;
        result = this.getYear() > getYear() ? 1 : 0;
        result = this.getQualityPoints() > getQualityPoints() ? 1 : 0;
        return result;
    }
    private int getYear() {
        int result = 0;
        switch (year) {
            case "senior":
                result = 4;
                break;
            case "junior":
                result = 3;
                break;
            case "sophomore":
                result = 2;
                break;
            case "freshman":
                result = 1;
        }
        return result;
    }

public static int getUndergraduateTotal() {
    return undergraduateTotal;
}

 /*
    @Override
    public int compareTo(Object o) {
        return 0;
    }
  */

}
