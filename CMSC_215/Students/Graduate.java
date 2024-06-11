package Students;
/*
Michael Hall
Programming Project 2
6-08-24
graduate class
extends Student class - contains fields name/creditHours/qualityPoints/dateCreated/studentTotal/
getters, gpaThreshhold, rankStudentList, eligibleForHonorSociety
 */

public class Graduate extends Student {
    private String currentDegreePursued;
    private static int graduateTotal = 0;
    private double GPA;


    protected Graduate(String name, int creditHours, int qualityPoints, String currentDegreePursued) {
        super(name, creditHours, qualityPoints);
        this.currentDegreePursued = currentDegreePursued;
        double GPA = getGPA();
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
    public boolean equals() {
        return false;
    }

    @Override
    public String getYear() {
        return "Graduate students do not have a year variable, but a program: " + this.currentDegreePursued;
    }

}
