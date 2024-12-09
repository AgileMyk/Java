import java.io.*;
import java.util.Scanner;

public class FileEdit {



    public static void main(String[] args) throws IOException {

        File sourceFile = new File("C:\\Users\\agile\\IdeaProjects\\Java\\CMSC315\\domains.txt");
        System.out.println(sourceFile.exists());
        System.out.println(sourceFile.isFile());
        File sourceFileEdit = new File("domainsEdit.txt");

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
    }
}
