package Students;
/*
Michael Hall
Programming Project 2
6-08-24
graduate class
extends Student class - contains fields name/creditHours/qualityPoints/dateCreated/studentTotal/
getters, gpaThreshhold, rankStudentList, eligibleForHonorSociety
 */

import java.util.Date;

public class Graduate extends Student {
    private String name;
    private int creditHours;
    private int qualityPoints;
    private Date dateCreated;
    private String currentDegreePursued;
    public static int graduateTotal = 0;


    public Graduate(String name, int creditHours, int qualityPoints, String currentDegreePursued) {
        super(name, creditHours, qualityPoints);
        this.currentDegreePursued = currentDegreePursued;
        double GPA = getGPA();
        dateCreated = new Date();
        incStudentCount();
        graduateTotal++;
    }
    protected boolean eligibleForHonorSociety() {
        if (getGPA() > setGPAthreshold() && getCurrentDegreePursued().toLowerCase() == "masters") {
            return true;
        }
        return false;
    }
    protected static int getGraduateTotal() {
        return graduateTotal;
    }
    protected String getCurrentDegreePursued() {
        return currentDegreePursued;
    }
    @Override
    public String toString() {
        System.out.println("Name: " + getName());
        System.out.println("qPoints: " + qualityPoints);
        System.out.println("cHours: " + creditHours);
        System.out.println("GPA: " + getGPA());
        System.out.println(eligibleForHonorSociety());
        return "Program: " + currentDegreePursued;
    }

    @Override
    public String getYear() {
        return "Graduate students do not have a year variable, but a program: " + this.currentDegreePursued;
    }

}
