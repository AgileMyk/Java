package Exercises_12_24_and_12_25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/*
12.24 (Create large dataset) Create a data file with 1,000
lines. Each line in the file consists of a faculty member’s first
name, last name, rank, and salary. The faculty member’s first
name and last name for the ith line are FirstNamei and
LastNamei. The rank is randomly generated as assistant,
associate, and full. The salary is randomly generated as a
number with two digits after the decimal point. The salary for
an assistant professor should be in the range from 50,000 to
80,000, for associate professor from 60,000 to 110,000, and
for full professor from 75,000 to 130,000. Save the file in
Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055.95
FirstName2 LastName2 associate 81112.45
...
FirstName1000 LastName1000 full 92255.21


12.25 (Process large dataset) A university posts its
employees’ salaries at http://liveexample.pearsoncmg.com/
data/Salary.txt. Each line in the file consists of a faculty
member’s first name, last name, rank, and salary (see
Programming Exercise 12.24 ). Write a program to
display the total salary for assistant professors, associate
professors, full professors, and faculty, respectively, and
display the average salary for assistant professors, associate
professors, full professors, and faculty, respectively.
 */
public class Exercise_12_24_AND_25 {

    public static void main(String[] args) {
        ArrayList<Faculty> facultyMembers = new ArrayList<>();
        String targetSite = "http://liveexample.pearsoncmg.com/data/Salary.txt";
        try {
            URL url1 = new URL(targetSite);
            Scanner siteScanner = new Scanner(url1.openStream());
            while (siteScanner.hasNextLine()) {
                facultyMembers.add(parseFacultyInformation(siteScanner.nextLine()));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Faculty faculty : facultyMembers) {
            System.out.println(faculty);
        }
        Faculty.totalSalaries();
        Faculty.totalSalaries_assistant();
        Faculty.totalSalaries_assistant();
        Faculty.totalSalaries_assistant();
    }

    public static Faculty parseFacultyInformation(String line) {
        String fName ="";
        String lName ="";
        String status = "";
        double salary = 0.0;
        Scanner in = new Scanner(line);
        while (in.hasNextLine()) {
            if (in.hasNext()) {
                fName = in.next();
            }
            if (in.hasNext()) {
                lName = in.next();
            }
            if (in.hasNext()) {
                status = in.next();
            }
            if (in.hasNextDouble()) {
                salary += in.nextDouble();
            }
        }
        return new Faculty(fName,lName,status,salary);
    }

}

