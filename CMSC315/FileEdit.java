import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class FileEdit {



    public static void main(String[] args) throws IOException, MalformedURLException {

        /*
        File sourceFile = new File("C:\\Users\\agile\\IdeaProjects\\Java\\CMSC315\\domains.txt");
        System.out.println(sourceFile.exists());
        System.out.println(sourceFile.isFile());
        File sourceFileEdit = new File("domainsEdit.txt");
        System.out.println(sourceFileEdit.exists());
        System.out.println(sourceFileEdit.isFile());
         */



        try {
            URL url = new URL("https://biblehub.com");
            Scanner inWeb = new Scanner(url.openStream());
            int count = 1;
            while (inWeb.hasNextLine()) {
                String line = inWeb.nextLine();
                System.out.println(inWeb.nextLine());
                System.out.println("line " + count + " has a length of " + line.length());
                count++;
            }
        } catch (MalformedURLException e1) {
            System.out.println("Invalid URL");
        } catch (IOException e2) {
            System.out.println("IO Exception");
        }

       /*
        try (
                    FileWriter fw = new FileWriter(sourceFileEdit, true);
                    Scanner sc1 = new Scanner(sourceFile)
                    ) {
                while (sc1.hasNextLine()) {
                    String line1 = sc1.nextLine();
                    String line2 = ("0.0.0.0    ");
                    System.out.println(line2+line1);
                    fw.append(line2).append(line1).append("\r\n");
                }
            }
        */
    }
}
