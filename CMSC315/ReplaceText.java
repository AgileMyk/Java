import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception{
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText <file> <text> <replacement>");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + "  exist");
        }
        System.exit(2);

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
        }

        try (
                Scanner scanner1 = new Scanner(sourceFile);
                PrintWriter pw = new PrintWriter(targetFile);
        ) {
            while (scanner1.hasNextLine()) {
                String s1 = scanner1.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                pw.println(s2);
            }
        }
    }

}
