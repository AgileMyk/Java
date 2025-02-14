/*
12.23 (Process scores in a text file on the Web) Suppose
the text file on the Web http://
liveexample.pearsoncmg.com/data/Scores.txt contains an
unspecified number of scores separated by spaces. Write a
program that reads the scores from the file and displays their
total and average.
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_12_23 {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        String url1 = "http://liveexample.pearsoncmg.com/data/Scores.txt";
        try {
            URL targetSite = new URL(url1);
            Scanner siteScanner = new Scanner(targetSite.openStream());
            while (siteScanner.hasNextLine()) {
                while (siteScanner.hasNextInt()) {
                    int currentVal = siteScanner.nextInt();
                    values.add(currentVal);
                    System.out.printf("%d added to ", currentVal);
                } System.out.println("Going to next line");
             }
        } catch (MalformedURLException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println("The array contains: ");
        for (Integer i : values) {
            System.out.println(i);
        }
        Collections.sort(values);
        System.out.println("Ordering the array returns a value list of: ");
        for (Integer i : values) {
            System.out.println(i);
        }
    }

}
