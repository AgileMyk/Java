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
    private String[] degrees = {"masters","doctorate"};
    private String currentDegreePursued;

    private static int graduateTotal = 0;

    protected Graduate(String name, int creditHours, int qualityPoints, String currentDegreePursued) {
        super(name, creditHours, qualityPoints);
        this.currentDegreePursued = currentDegreePursued;
    }
    public static int getGraduateTotal() {
        return graduateTotal;
    }
    protected boolean eligibleForHonorSociety(Student s) {
        return gpaThreshhold(s) == true ? this.currentDegreePursued == "master" ? true : false : false;
    }
    @Override
    public String toString() {
        System.out.println("Name: " + getName());
        System.out.println("qPoints: " + qualityPoints);
        System.out.println("cHours: " + creditHours);
        System.out.println("GPA: " + getGPA());
        return "Program: " + currentDegreePursued;
    }
    @Override
    public boolean equals() {
        return false;
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
